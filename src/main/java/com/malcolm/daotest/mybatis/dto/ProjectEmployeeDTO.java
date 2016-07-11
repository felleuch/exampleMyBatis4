package com.malcolm.daotest.mybatis.dto;

import com.malcolm.daotest.mybatis.model.Project;
import com.malcolm.daotest.mybatis.model.ProjectEmployee;

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
