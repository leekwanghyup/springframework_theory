package config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;

import com.jafa.example03.JdbcConnectionInfo;

// Java8 이상 @PropertySources 없이  여러개의 @PropertySource 사용   
// @PropertySource 
@Configuration
@PropertySource(value ={"classpath:example03/mysql.properties"}) 
@PropertySource(value ="classpath:example03/oracle.properties")
@PropertySource(value ="classpath:example03/oracle.properties", ignoreResourceNotFound = true)
public class AppConfig03 {
	
	@Autowired
	Environment env;
	
	@Bean(name = "mysqlConnector")
	public JdbcConnectionInfo mySqlConnectionInfo() {
		return JdbcConnectionInfo.builder()
			.driver(env.getProperty("db.mysql.driver"))
			.url(env.getProperty("db.mysql.jdbcUrl"))
			.username(env.getProperty("db.mysql.user"))
			.password(env.getProperty("db.mysql.password"))
			.build();
	}
	
	@Bean(name = "oracleConnector")
	public JdbcConnectionInfo OracleConnectionInfo() {
		return JdbcConnectionInfo.builder()
			.driver(env.getProperty("db.ora.driver"))
			.url(env.getProperty("db.ora.jdbcUrl"))
			.username(env.getProperty("db.ora.user"))
			.password(env.getProperty("db.ora.password"))
			.build();
	}
}
