package com.felleuch.daotest.mybatis.mapper;

import com.felleuch.daotest.mybatis.model.Designation;

public interface DesignationMapper {
    int deleteByPrimaryKey(Integer designation_id);

    int insert(Designation record);

    int insertSelective(Designation record);

    Designation selectByPrimaryKey(Integer designation_id);

    int updateByPrimaryKeySelective(Designation record);

    int updateByPrimaryKey(Designation record);
}