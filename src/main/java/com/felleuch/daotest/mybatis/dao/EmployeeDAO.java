package com.felleuch.daotest.mybatis.dao;

/**
 * Created by felleuch on 11/07/2016.
 */
import com.felleuch.daotest.mybatis.mapper.EmployeeMapper;
import com.felleuch.daotest.mybatis.mapperext.EmployeeMapperExt;
import com.felleuch.daotest.mybatis.model.Employee;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;


/**
 * DAO for Employee Details
 *
 * @author Malcolm
 */
@Service
@Qualifier("employeeDAO")
public class EmployeeDAO implements EmployeeMapper,EmployeeMapperExt {




    @Autowired
    private SqlSession sqlSession;

    @Override
    public List<Employee> getAllEmployeesSimple() {
        try {
            return sqlSession.getMapper(EmployeeMapperExt.class).getAllEmployeesSimple();
        } catch (Exception e) {
            throw new RuntimeException(e.getMessage());
        }
    }


    @Override
    public List<Employee> getAllEmployees() {
        try {
            return sqlSession.getMapper(EmployeeMapperExt.class).getAllEmployees();
        } catch (Exception e) {
            throw new RuntimeException(e.getMessage());
        }
    }

    @Override
    public List<Employee> getEmployeesByProjectId(Integer projectId) {
        try {
            return sqlSession.getMapper(EmployeeMapperExt.class).getEmployeesByProjectId(projectId);
        } catch (Exception e) {
            throw new RuntimeException(e.getMessage());
        }
    }
/*
    @Override
    public List<Employee> getEmployeesByProjectName(String projectName) {
        try {
            return super.getMapper(mapperClazzExt).getEmployeesByProjectName(projectName);
        } catch (Exception e) {
            throw new RuntimeException(e.getMessage());
        }
    }

    @Override
    public List<Employee> getEmployeesByRoleId(Integer roleId) {
        try {
            return super.getMapper(mapperClazzExt).getEmployeesByRoleId(roleId);
        } catch (Exception e) {
            throw new RuntimeException(e.getMessage());
        }
    }

    @Override
    public List<Employee> getEmployeesByRoleName(String roleName) {
        try {
            return super.getMapper(mapperClazzExt).getEmployeesByRoleName(roleName);
        } catch (Exception e) {
            throw new RuntimeException(e.getMessage());
        }
    }

    @Override
    public List<Employee> getEmployeesByDepartmentId(Integer departmentId) {
        try {
            return super.getMapper(mapperClazzExt).getEmployeesByDepartmentId(departmentId);
        } catch (Exception e) {
            throw new RuntimeException(e.getMessage());
        }
    }

    @Override
    public List<Employee> getEmployeesByDepartmentName(String departmentName) {
        try {
            return super.getMapper(mapperClazzExt).getEmployeesByDepartmentName(departmentName);
        } catch (Exception e) {
            throw new RuntimeException(e.getMessage());
        }
    }

    @Override
    public List<Employee> getEmployeesByManagerId(Integer managerId) {
        try {
            return super.getMapper(mapperClazzExt).getEmployeesByManagerId(managerId);
        } catch (Exception e) {
            throw new RuntimeException(e.getMessage());
        }
    }

    @Override
    public List<Employee> getEmployeesByFirstName(String employeeName) {
        try {
            employeeName = employeeName + "%";
            return super.getMapper(mapperClazzExt).getEmployeesByFirstName(employeeName);
        } catch (Exception e) {
            throw new RuntimeException(e.getMessage());
        }
    }*/

    @Override
    public int deleteByPrimaryKey(Integer emp_id) {
        try {
            return sqlSession.getMapper(EmployeeMapper.class).deleteByPrimaryKey(emp_id);
        } catch (Exception e) {
            throw new RuntimeException(e.getMessage());
        }
    }

    @Override
    public int insert(Employee record) {
        try {
            int row = sqlSession.getMapper(EmployeeMapper.class).insert(record);
            try {
                Object identity = record.getEmp_id();
                if (identity == null) {
                    return row;
                } else {
                    return (Integer) identity;
                }
            } catch (Exception e) {
                return -1;
            }
        } catch (Exception e) {
            throw new RuntimeException(e.getMessage());
        }
    }

    @Override
    public int insertSelective(Employee record) {
        try {
            int row = sqlSession.getMapper(EmployeeMapper.class).insertSelective(record);
            try {
                Object identity = record.getEmp_id();
                if (identity == null) {
                    return row;
                } else {
                    return (Integer) identity;
                }
            } catch (Exception e) {

                return -1;
            }
        } catch (Exception e) {
            throw new RuntimeException(e.getMessage());
        }
    }

    @Override
    public Employee selectByPrimaryKey(Integer emp_id) {
        try {
            return sqlSession.getMapper(EmployeeMapper.class).selectByPrimaryKey(emp_id);
        } catch (Exception e) {
            throw new RuntimeException(e.getMessage());
        }
    }

    @Override
    public int updateByPrimaryKeySelective(Employee record) {
        try {
            return sqlSession.getMapper(EmployeeMapper.class).updateByPrimaryKeySelective(record);
        } catch (Exception e) {
            throw new RuntimeException(e.getMessage());
        }
    }

    @Override
    public int updateByPrimaryKey(Employee record) {
        try {
            return sqlSession.getMapper(EmployeeMapper.class).updateByPrimaryKey(record);
        } catch (Exception e) {
            throw new RuntimeException(e.getMessage());
        }
    }
}
