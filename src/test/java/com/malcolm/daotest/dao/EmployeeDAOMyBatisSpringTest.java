package com.malcolm.daotest.dao;

import com.malcolm.daotest.mybatis.MyBatisDAOConfig;
import com.malcolm.daotest.mybatis.dao.EmployeeDAO;
import com.malcolm.daotest.mybatis.model.Employee;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

import static org.hamcrest.Matchers.greaterThan;
import static org.hamcrest.Matchers.not;
import static org.hamcrest.Matchers.notNullValue;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertThat;

/**
 * Created by felleuch on 11/07/2016.
 */

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {MyBatisDAOConfig.class})
@Transactional
public class EmployeeDAOMyBatisSpringTest {

    @Autowired
    @Qualifier("employeeDAO")
    private EmployeeDAO dao;


    @Test
    public void getAllEmployees() {
        assertNotNull("Employee DAO not injected ",dao);
        List<Employee> employeeList = dao.getAllEmployees();
        assertNotNull("Employee List not fetched ",employeeList);
        assertThat(employeeList, notNullValue());
        assertThat(employeeList.size(), not(0));
        assertThat(employeeList.size(), greaterThan(1));
    }

    @Test
    public void getAllEmployeesSimple() {
        assertNotNull("Employee DAO not injected ",dao);
        List<Employee> employeeList = dao.getAllEmployeesSimple();
        assertNotNull("Employee List not fetched ",employeeList);
        assertThat(employeeList, notNullValue());
        assertThat(employeeList.size(), not(0));
        assertThat(employeeList.size(), greaterThan(1));
    }


}
