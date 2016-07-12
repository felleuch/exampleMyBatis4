package com.felleuch.daotest.mybatis.mapper;

import com.felleuch.daotest.mybatis.model.Employee;

public interface EmployeeMapper {

    int deleteByPrimaryKey(Integer emp_id);

    int insert(Employee record);

    int insertSelective(Employee record);

    Employee selectByPrimaryKey(Integer emp_id);

    int updateByPrimaryKeySelective(Employee record);

    int updateByPrimaryKey(Employee record);
}