package com.malcolm.daotest.mybatis.dto;

import com.malcolm.daotest.mybatis.model.Employee;
import com.malcolm.daotest.mybatis.model.Project;

/**
 * Created by felleuch on 11/07/2016.
 */
public class ProjectDTO extends Project {

    private Employee manager;


    public Employee getManager() {
        return manager;
    }

    public void setManager(Employee manager) {
        this.manager = manager;
    }
}
