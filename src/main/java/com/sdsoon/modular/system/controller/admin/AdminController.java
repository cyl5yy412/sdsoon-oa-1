package com.sdsoon.modular.system.controller.admin;

import com.sdsoon.core.response.ex.BaseController;
import com.sdsoon.core.response.ex.ResponseException;
import com.sdsoon.core.util.*;
import com.sdsoon.modular.system.po.SsPermission;
import com.sdsoon.modular.system.po.SsRole;
import com.sdsoon.modular.system.po.SsUserInfo;
import com.sdsoon.modular.system.service.AdminService;
import com.sdsoon.modular.system.vo.AddUserVo;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.*;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.io.UnsupportedEncodingException;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 后台管理控制器
 * <p>
 * Created By Chr on 2019/8/16.
 */
@Controller
public class AdminController extends BaseController {

    @Autowired
    private AdminService adminService;

    /**
     * 登录页跳转
     */
    @GetMapping("/login")
    public String login() {
        if (getLoginUser() != null) {
            return "/index.html";
        }
        return "/login.html";
    }

    @GetMapping("/page/index")
    public String pageIndex() {
        if (getLoginUser() != null) {
            return "redirect:page/other/loginz.html";
        }
        return "/page/other/login.html";
    }
    /**
     * 403
     */
    @GetMapping("/error/403")
    public String err403() {
        return "/page/error/error-403.html";
    }

    /**
     * 登录接口
     */
    @ResponseBody
    @PostMapping("/login")
    public JsonResult doLogin(String username,
                              String password,
//                              String code,
                              HttpServletRequest request) throws UnsupportedEncodingException, NoSuchAlgorithmException {
        if (StringUtil.isBlank(username, password)) {
            return JsonResult.error("账号或密码不能为空");
        }
//        if (!CaptchaUtil.ver(code, request)) {
//            // CaptchaUtil.clear(request);
//            return JsonResult.error("验证码不正确");
//        }
        try {
            String encodePassoword = PasswordUtil.EncodeByMD5(password);
            UsernamePasswordToken token = new UsernamePasswordToken(username, encodePassoword);
            SecurityUtils.getSubject().login(token);
            //添加登陆日志
//            addLoginRecord(getLoginUserId(), request);
            return JsonResult.ok("登录成功");
        } catch (IncorrectCredentialsException ice) {
            return JsonResult.error("密码错误");
        } catch (UnknownAccountException uae) {
            return JsonResult.error("账号不存在");
        } catch (LockedAccountException e) {
            return JsonResult.error("账号被锁定");
        } catch (ExcessiveAttemptsException eae) {
            return JsonResult.error("操作频繁，请稍后再试");
        }
    }

    //"system:admin"
    //"user:manager"
    //

    /**
     * 用户列表
     */
    @RequiresPermissions({"system:admin", "user:manager"})
    @ResponseBody
    @GetMapping("/users")
    public Map<String,Object> users(@RequestParam("page") Integer page, @RequestParam("limit") Integer limit,String userName,String userRealName) throws ResponseException {
        Map<String,Object> map = adminService.selectAllUsers(page, limit,userName, userRealName);
        return map;
    }

    /**
     * 修改用户
     */
    @RequiresPermissions({"system:admin", "user:manager"})
    @ResponseBody
    @PostMapping("/user/update")
    public JsonResult userUpdate(AddUserVo addUserVo, String roleId) throws ResponseException, UnsupportedEncodingException, NoSuchAlgorithmException {
        boolean b = adminService.updateUserInfo(addUserVo, roleId);
        if (b) {
            return JsonResult.ok();
        }
        return JsonResult.error();
    }

    /**
     * 添加用户
     */
    @RequiresPermissions({"system:admin", "user:manager"})
    @ResponseBody
    @PostMapping("/user/add")
    public JsonResult userAdd(AddUserVo addUserVo, String roleId) throws UnsupportedEncodingException, NoSuchAlgorithmException, ResponseException {
        boolean b = adminService.register(addUserVo, roleId);
        if (b) {
            return JsonResult.ok("添加成功");
        }
        return JsonResult.error("添加失败");
    }

    /**
     * 修改用户状态
     */
    @RequiresPermissions({"system:admin", "user:manager"})
    @ResponseBody
    @PostMapping("/user/updateState")
    public JsonResult updateState(@RequestParam("userId") String userId, @RequestParam("state") Integer state) {
        if (userId == null) {
            return JsonResult.error("参数userId不能为空");
        }
        if (state == null || (state != 0 && state != 1)) {
            return JsonResult.error("状态值不正确");
        }
        boolean b = adminService.updateState(userId, state);
        if (b) {
            return JsonResult.ok();
        }
        return JsonResult.error();
    }

    /**
     * 删除用户
     */
    @RequiresPermissions({"system:admin", "user:manager"})
    @ResponseBody
    @PostMapping("/user/delete")
    public JsonResult delete(String userId) {
        if (userId == null) {
            return JsonResult.error("参数userId不能为空");
        }
        boolean b = adminService.removeById(userId);
        if (b) {
            return JsonResult.ok("删除成功");
        }
        return JsonResult.error("删除失败");
    }

    /**
     * 重置密码
     */
    @RequiresPermissions({"system:admin", "user:manager"})
    @ResponseBody
    @RequestMapping("/user/restPsw")
    public JsonResult resetPsw(String userId) throws UnsupportedEncodingException, NoSuchAlgorithmException {
        if (userId == null) {
            return JsonResult.error("参数userId不能为空");
        }
        boolean b = adminService.resetPsw(userId);
        if (b) {
            return JsonResult.ok("重置成功，初始密码为:" + "123456");
        }
        return JsonResult.error("重置失败");
    }

    //"role:manager"

    /**
     * 角色列表
     */
    @RequiresPermissions({"system:admin", "role:manager"})
    @ResponseBody
    @GetMapping("/roles")
    public PageResult<SsRole> roles(@RequestParam("page") Integer page, @RequestParam("limit") Integer limit) throws ResponseException {
        PageResult<SsRole> rolePageResult = adminService.selectAllRoles(page, limit);
        return rolePageResult;
    }

    /**
     * 添加角色
     **/
    @RequiresPermissions({"system:admin", "role:manager"})
    @ResponseBody
    @PostMapping("/role/add")
    public JsonResult add(SsRole role) {
        boolean b = adminService.saveRole(role);
        if (b) {
            return JsonResult.ok("添加成功");
        }
        return JsonResult.error("添加失败");
    }

    /**
     * 修改角色
     **/
    @RequiresPermissions({"system:admin", "role:manager"})
    @ResponseBody
    @RequestMapping("/role/update")
    public JsonResult update(SsRole role) {
        boolean b = adminService.updateRoleById(role);
        if (b) {
            return JsonResult.ok("修改成功");
        }
        return JsonResult.error("修改失败");
    }

    /**
     * 删除角色
     **/
    @RequiresPermissions({"system:admin", "role:manager"})
    @ResponseBody
    @PostMapping("/role/delete")
    public JsonResult delete(Integer roleId) {
        boolean b = adminService.removeRoleById(roleId);
        if (b) {
            return JsonResult.ok("删除成功");
        }
        return JsonResult.error("删除失败");
    }

    /**
     * 角色权限树
     */
    @RequiresPermissions({"system:admin", "role:manager"})
    @ResponseBody
    @GetMapping("/role/authTree")
    public List<Map<String, Object>> authTree(Integer roleId) {
        List<SsPermission> rolePerms = adminService.listByRoleId(roleId);
        List<SsPermission> allPerms = adminService.list();
        List<Map<String, Object>> authTrees = new ArrayList<>();
        for (SsPermission one : allPerms) {
            Map<String, Object> authTree = new HashMap<>();
            authTree.put("id", one.getPermId());
            authTree.put("name", one.getPermName() + " " + StringUtil.getStr(one.getPermCode()));
            authTree.put("pId", one.getPermParentId());
            authTree.put("open", true);
            authTree.put("checked", false);
            for (SsPermission temp : rolePerms) {
                if (temp.getPermId().equals(one.getPermId())) {
                    authTree.put("checked", true);
                    break;
                }
            }
            authTrees.add(authTree);
        }
        return authTrees;
    }

    /**
     * 修改角色权限
     */
    @RequiresPermissions({"system:admin", "role:manager"})
    @ResponseBody
    @PostMapping("/role/updateRoleAuth")
    public JsonResult updateRoleAuth(Integer roleId, String authIds) throws ResponseException {
        boolean b = adminService.updateRoleAuth(roleId, JSONUtil.parseArray(authIds, Integer.class));
        if (b) {
            return JsonResult.ok("修改成功");
        }
        return JsonResult.error("修改失败");
    }

    //"perm:manager"

    /**
     * 查询所有权限
     **/
    @RequiresPermissions({"system:admin", "perm:manager"})
    @ResponseBody
    @GetMapping("/perms")
    public PageResult<SsPermission> list() throws ResponseException {
        List<SsPermission> authorities = adminService.selectPermsByPage();
        return new PageResult<>(authorities);
    }

    /**
     * 添加权限
     */
    @RequiresPermissions({"system:admin", "perm:manager"})
    @ResponseBody
    @RequestMapping("/perm/add")
    public JsonResult add(SsPermission authorities) {
        boolean b = adminService.addOnePerm(authorities);
        if (b) {
            return JsonResult.ok("添加成功");
        }
        return JsonResult.error("添加失败");
    }

    /**
     * 修改权限
     */
    @RequiresPermissions({"system:admin", "perm:manager"})
    @ResponseBody
    @RequestMapping("/perm/update")
    public JsonResult update(SsPermission authorities) {
        boolean b = adminService.updatePermsById(authorities);
        if (b) {
            return JsonResult.ok("修改成功");
        }
        return JsonResult.error("修改失败");
    }

    /**
     * 删除权限
     */
    @RequiresPermissions({"system:admin", "perm:manager"})
    @ResponseBody
    @PostMapping("/perm/delete")
    public JsonResult deletePerm(Integer permId) {
        boolean b = adminService.removePermById(permId);
        if (b) {
            return JsonResult.ok("删除成功");
        }
        return JsonResult.error("删除失败");
    }

    //#######################################################
    //#######################################################

    /**
     * 获取当前登录的user
     */
    public SsUserInfo getLoginUser() {
        Subject subject = SecurityUtils.getSubject();
        if (subject != null) {
            Object object = subject.getPrincipal();
            if (object != null) {
                return (SsUserInfo) object;
            }
        }
        return null;
    }

    /**
     * 获取当前登录的userId
     */
    public String getLoginUserId() {
        SsUserInfo loginUser = getLoginUser();
        return loginUser == null ? null : loginUser.getUserId();
    }


}
