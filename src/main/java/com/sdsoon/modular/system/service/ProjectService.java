package com.sdsoon.modular.system.service;

import com.sdsoon.core.response.ex.ResponseException;
import com.sdsoon.modular.system.model.ProjectModel;

/**
 * Created By Chr on 2019/8/22.
 */
public interface ProjectService {
    boolean setupProject(ProjectModel projectModel) throws ResponseException;

    boolean setupProjectDemo(ProjectModel projectModel) throws ResponseException;

}
