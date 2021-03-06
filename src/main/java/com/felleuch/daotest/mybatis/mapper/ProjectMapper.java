package com.felleuch.daotest.mybatis.mapper;

import com.felleuch.daotest.mybatis.model.Project;

public interface ProjectMapper {
    int deleteByPrimaryKey(Integer project_id);

    int insert(Project record);

    int insertSelective(Project record);

    Project selectByPrimaryKey(Integer project_id);

    int updateByPrimaryKeySelective(Project record);

    int updateByPrimaryKey(Project record);
}