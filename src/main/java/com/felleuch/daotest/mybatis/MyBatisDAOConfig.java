package com.felleuch.daotest.mybatis;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.core.io.ClassPathResource;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.sql.DataSource;
import java.sql.SQLException;

/**
 * MyBatis Configuration
 *
 */
@Configuration
@EnableTransactionManagement  
@PropertySource("classpath:dbconfig.properties")
@ComponentScan({"com.felleuch.daotest.mybatis"})
public class MyBatisDAOConfig {
	
	private static final String PROPERTY_NAME_DATABASE_DRIVER 	 = "dataSource.driver";
	private static final String PROPERTY_NAME_DATABASE_URL		 = "dataSource.url";
    private static final String PROPERTY_NAME_DATABASE_PASSWORD  = "dataSource.password";  
    private static final String PROPERTY_NAME_DATABASE_USERNAME  = "dataSource.username";  
	
    @Autowired
    private Environment environment;
    

    
    @Bean
	public DataSourceTransactionManager transactionManager() throws SQLException {
    	DataSourceTransactionManager txManager = new DataSourceTransactionManager(dataSource());
		return txManager;
	}
    
    @Bean
    public DataSource dataSource() throws SQLException {
		DriverManagerDataSource dataSource = new DriverManagerDataSource();  
		dataSource.setDriverClassName(environment.getRequiredProperty(PROPERTY_NAME_DATABASE_DRIVER));  
        dataSource.setUrl(environment.getRequiredProperty(PROPERTY_NAME_DATABASE_URL));  
        dataSource.setUsername(environment.getRequiredProperty(PROPERTY_NAME_DATABASE_USERNAME));  
        dataSource.setPassword(environment.getRequiredProperty(PROPERTY_NAME_DATABASE_PASSWORD));
        return dataSource;
    }
   
    @Bean
    public SqlSessionFactory sqlSessionFactoryBean() throws Exception{
    	SqlSessionFactoryBean sessionFactoryBean = new SqlSessionFactoryBean();
    	sessionFactoryBean.setDataSource( dataSource());
    	sessionFactoryBean.setConfigLocation(new ClassPathResource("mybatis-config.xml"));
    	return sessionFactoryBean.getObject();
    }
    
    @Bean
    public SqlSession sqlSessionTemplate() throws Exception{
    	return new SqlSessionTemplate(sqlSessionFactoryBean());
    }
}
