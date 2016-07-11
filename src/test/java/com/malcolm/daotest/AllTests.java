package com.malcolm.daotest;

import com.malcolm.daotest.dao.EmployeeDAOMyBatisSpringTest;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 * Created by felleuch on 11/07/2016.
 */
@RunWith(Suite.class)
@Suite.SuiteClasses({
        EmployeeDAOMyBatisSpringTest.class
})
public class AllTests {
}
