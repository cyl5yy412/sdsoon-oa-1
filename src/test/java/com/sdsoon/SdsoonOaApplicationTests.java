package com.sdsoon;

import com.sdsoon.core.response.ex.ResponseException;
import com.sdsoon.modular.system.mapper.SsPermissionMapper;
import com.sdsoon.modular.system.mapper.SsRoleMapper;
import com.sdsoon.modular.system.mapper.SsUserInfoMapper;
import com.sdsoon.modular.system.po.SsPermission;
import com.sdsoon.modular.system.po.SsUserInfoExample;
import com.sdsoon.modular.system.service.ProjectService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SdsoonOaApplicationTests {

    @Resource
    private SsUserInfoMapper ssUserInfoMapper;
    @Resource
    private SsPermissionMapper ssPermissionMapper;
    @Resource
    private SsRoleMapper ssRoleMapper;

    @Test
    public void contextLoads() {
        SsUserInfoExample example = new SsUserInfoExample();
//		SsUserInfoExample.Criteria criteria = example.createCriteria();
        long l = ssUserInfoMapper.countByExample(null);
        System.out.println(l);
    }

    @Test
    public void contextLoads2() {
        List<SsPermission> ssPermissions = ssPermissionMapper.selectByExample(null);
        System.out.println(ssPermissions);
        long l = ssRoleMapper.countByExample(null);
        System.out.println(l);
    }

    @Autowired
    private ProjectService projectService;


}
