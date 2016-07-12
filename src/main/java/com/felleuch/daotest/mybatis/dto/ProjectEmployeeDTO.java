package com.felleuch.daotest.mybatis.dto;

import com.felleuch.daotest.mybatis.model.Project;
import com.felleuch.daotest.mybatis.model.ProjectEmployee;

/**
 * Created by felleuch on 11/07/2016.
 */
public class ProjectEmployeeDTO extends ProjectEmployee {

    private Project project;


    public Project getProject() {
        return project;
    }

    public void setProject(Project project) {
        this.project = project;
    }
}
