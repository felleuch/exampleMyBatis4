package com.malcolm.daotest.mybatis.mapper;

import com.malcolm.daotest.mybatis.model.Employee;

import java.util.List;

public interface EmployeeMapper {

    int deleteByPrimaryKey(Integer emp_id);

    int insert(Employee record);

    int insertSelective(Employee record);

    Employee selectByPrimaryKey(Integer emp_id);

    int updateByPrimaryKeySelective(Employee record);

    int updateByPrimaryKey(Employee record);
}