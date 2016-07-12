package com.felleuch.daotest.mybatis.service;

/**
 * Created by felleuch on 11/07/2016.
 */


import com.felleuch.daotest.mybatis.model.Employee;

import java.util.List;

/**
 * Interface for Employee Service
 *
 * @author Malcolm
 */
public interface IEmployeeService {

    /**
     * Get All Employee No Associations, Simple Get all Employee
     *
     * @return
     */
    public List<Employee> getAllEmployeesSimple();

    /**
     * Get All Employee
     *
     * @return
     */
    public List<Employee> getAllEmployees();

    /**
     * Get Employees By Project ID
     *
     * @return
     */
    public List<Employee> getEmployeesByProjectId(Integer projectId);

    /**
     * Get Employees By Project Name
     *
     * @return
     */
    public List<Employee> getEmployeesByProjectName(String projectName);

    /**
     * Get Employees By Role Id
     *
     * @return
     */
    public List<Employee> getEmployeesByRoleId(Integer roleId);

    /**
     * Get Employees By Role Name
     *
     * @return
     */
    public List<Employee> getEmployeesByRoleName(String roleName);

    /**
     * Get Employees By Department Id
     *
     * @return
     */
    public List<Employee> getEmployeesByDepartmentId(Integer departmentId);

    /**
     * Get Employees By Department Name
     *
     * @return
     */
    public List<Employee> getEmployeesByDepartmentName(String departmentName);

    /**
     * Get Employees By Manager Id
     *
     * @return
     */
    public List<Employee> getEmployeesByManagerId(Integer managerId);

    /**
     * Get Employees By Matching on Employee First Name Only Using Like
     *
     * @return
     */
    public List<Employee> getEmployeesByFirstName(String employeeName);
}

