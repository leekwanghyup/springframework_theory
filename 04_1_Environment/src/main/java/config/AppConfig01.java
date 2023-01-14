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
		"classpath:example03/oracle.properties"
})
public class AppConfig01 {
	
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
