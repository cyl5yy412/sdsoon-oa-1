package com.sdsoon;

import com.sdsoon.core.util.PageResult;
import com.sdsoon.modular.system.mapper.*;
import com.sdsoon.modular.system.model.ProjectMissionModel;
import com.sdsoon.modular.system.po.SsPermission;
import com.sdsoon.modular.system.po.SsProjectMission;
import com.sdsoon.modular.system.po.SsProjectMissionExample;
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

    @Resource
    private SsProjectManageMapper ssProjectManageMapper;
    @Resource
    private SsProjectDocMapper ssProjectDocMapper;
    @Resource
    private SsProjectPicMapper ssProjectPicMapper;
    @Resource
    private SsProjectMissionMapper ssProjectMissionMapper;
    @Test
    public void show2() {
        String id="695b1acedf034b09be4246fba42c56ce";
        SsProjectMissionExample example = new SsProjectMissionExample();
        SsProjectMissionExample.Criteria criteria = example.createCriteria();
        criteria.andProjectGProjectIdEqualTo(id);
        List<SsProjectMission> ssProjectMissions = ssProjectMissionMapper.selectByExample(example);
        long total = ssProjectMissionMapper.countByExample(example);
        System.out.println(total);
        System.out.println(ssProjectMissions);
    }

}
