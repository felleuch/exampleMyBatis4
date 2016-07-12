package com.felleuch.daotest.mybatis.mapper;

import com.felleuch.daotest.mybatis.model.RoleEmployee;

public interface RoleEmployeeMapper {
    int deleteByPrimaryKey(Integer role_emp_assn_id);

    int insert(RoleEmployee record);

    int insertSelective(RoleEmployee record);

    RoleEmployee selectByPrimaryKey(Integer role_emp_assn_id);

    int updateByPrimaryKeySelective(RoleEmployee record);

    int updateByPrimaryKey(RoleEmployee record);
}