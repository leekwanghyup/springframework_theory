package config;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;

import com.jafa.example03.JdbcConnectionInfo;

@Configuration
@PropertySource(value ={
		"classpath:example03/mysql.properties",
		"classpath:example03/oracle.properties",
		"classpath:example03/mariaDB.properties" // 현재 존재하지 않는 프로퍼티 파일
}, ignoreResourceNotFound = true) // 프로퍼티 파일이 없는 경우에도 예외가 발생하지 않는다.
public class AppConfig02 {
	
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
