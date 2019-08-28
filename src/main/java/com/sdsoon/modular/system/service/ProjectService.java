package com.sdsoon.modular.system.service;

import com.sdsoon.core.response.ex.ResponseException;
import com.sdsoon.modular.system.model.ProjectModel;
import com.sdsoon.modular.system.model.ProjectPoModel;

import javax.servlet.http.HttpServletResponse;
import java.io.UnsupportedEncodingException;

/**
 * Created By Chr on 2019/8/22.
 */
public interface ProjectService {
    boolean setupProject(ProjectModel projectModel) throws ResponseException;

//    boolean setupProjectDemo(ProjectModel projectModel) throws ResponseException;

    ProjectPoModel selectProjectById(String projectId) throws ResponseException;

    boolean download(String downloadId, HttpServletResponse response) throws ResponseException, UnsupportedEncodingException;
}
