package com.malcolm.daotest.mybatis.mapperext;


import com.malcolm.daotest.mybatis.model.Employee;

import java.util.List;

/**
 * Created by felleuch on 11/07/2016.
 */
public interface EmployeeMapperExt  {

    public List<Employee> getAllEmployeesSimple();

    public List<Employee> getEmployeesByProjectId(Integer projectId);


    public List<Employee> getAllEmployees();
}
