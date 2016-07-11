package com.malcolm.daotest.mybatis.service.impl;

import com.malcolm.daotest.mybatis.dao.EmployeeDAO;
import com.malcolm.daotest.mybatis.model.Employee;
import com.malcolm.daotest.mybatis.service.IEmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import java.util.List;

/**
 * Created by felleuch on 11/07/2016.
 */
public class EmployeeServiceMyBatisImpl implements IEmployeeService {


    @Autowired
    @Qualifier("employeeDAO")
    private EmployeeDAO dao;

    @Override
    public List<Employee> getAllEmployeesSimple() {
        List<Employee> 	employeeInfoList 	  = dao.getAllEmployeesSimple();
        return employeeInfoList;
    }

    @Override
    public List<Employee> getAllEmployees() {
        List<Employee> 	employeeInfoList 	  = dao.getAllEmployees();
        return employeeInfoList;
    }

    @Override
    public List<Employee> getEmployeesByProjectId(Integer projectId) {
        List<Employee> 	employeeInfoList 	  = dao.getEmployeesByProjectId(projectId);
        return employeeInfoList;
    }

    @Override
    public List<Employee> getEmployeesByProjectName(String projectName) {
        //List<Employee> 	employeeInfoList 	  = dao.getEmployeesByProjectName(projectName);
        return null;
    }

    @Override
    public List<Employee> getEmployeesByRoleId(Integer roleId) {
       // List<Employee> 	employeeInfoList 	  = dao.getEmployeesByRoleId(roleId);
        return null;
    }

    @Override
    public List<Employee> getEmployeesByRoleName(String roleName) {
       // List<Employee> 	employeeInfoList 	  = dao.getEmployeesByRoleName(roleName);
        return null;
    }

    @Override
    public List<Employee> getEmployeesByDepartmentId(Integer departmentId) {
       // List<Employee> 	employeeInfoList 	  = dao.getEmployeesByDepartmentId(departmentId);
        return null;
    }

    @Override
    public List<Employee> getEmployeesByDepartmentName(String departmentName) {
       // List<Employee> 	employeeInfoList 	  = dao.getEmployeesByDepartmentName(departmentName);
        return null;
    }

    @Override
    public List<Employee> getEmployeesByManagerId(Integer managerId) {
        //List<Employee> 	employeeInfoList 	  = dao.getEmployeesByManagerId(managerId);
        return null;
    }

    @Override
    public List<Employee> getEmployeesByFirstName(String employeeName) {
       // List<Employee> 	employeeInfoList 	  = dao.getEmployeesByFirstName(employeeName);
        return null;
    }


//    private List<Employee> mapEmployee(List<Employee> employeeInfoList) {
//        List<Employee> employeeInfoBDOList = new ArrayList<Employee>();
//        for (Employee employee : employeeInfoList) {
//            employeeInfoBDOList.add(MyBatisModelMapper.mapEmployee(employee));
//        }
//        return employeeInfoBDOList;
//    }

    
}
