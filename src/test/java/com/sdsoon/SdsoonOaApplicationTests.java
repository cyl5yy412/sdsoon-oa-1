package com.sdsoon;

import com.sdsoon.core.response.ex.ResponseException;
import com.sdsoon.modular.system.mapper.*;
import com.sdsoon.modular.system.po.SsPermission;
import com.sdsoon.modular.system.po.SsPro;
import com.sdsoon.modular.system.po.SsProDoc;
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
    private SsProMapper ssProMapper;
    @Resource
    private SsProDocMapper ssProDocMapper;
    @Test
    public void show() throws ResponseException {
        List<SsPro> ssPros = ssProMapper.selectByExample(null);
        List<SsProDoc> ssProDocs = ssProDocMapper.selectByExample(null);
        System.out.println(ssProDocs);
        System.out.println(ssPros);
    }

}
