package com.malcolm.daotest.mybatis.dto;

import com.malcolm.daotest.mybatis.model.*;

import java.util.List;

/**
 * Created by felleuch on 11/07/2016.
 */
public class EmployeeDTO extends Employee {

    private Designation designation;
    private Department department;
    private Employee manager;
    private List<RoleEmployee> employeeRoleAssn;
    private List<ProjectEmployee> employeeProjectAssn;


    public Designation getDesignation() {
        return designation;
    }

    public void setDesignation(Designation designation) {
        this.designation = designation;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public Employee getManager() {
        return manager;
    }

    public void setManager(Employee manager) {
        this.manager = manager;
    }

    public List<RoleEmployee> getEmployeeRoleAssn() {
        return employeeRoleAssn;
    }

    public void setEmployeeRoleAssn(List<RoleEmployee> employeeRoleAssn) {
        this.employeeRoleAssn = employeeRoleAssn;
    }

    public List<ProjectEmployee> getEmployeeProjectAssn() {
        return employeeProjectAssn;
    }

    public void setEmployeeProjectAssn(List<ProjectEmployee> employeeProjectAssn) {
        this.employeeProjectAssn = employeeProjectAssn;
    }
}
