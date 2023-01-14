package com.jafa.example03;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import config.AppConfig01;

// AppConfig1
public class PropertySoruceConfigExample1 {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext ctx 
					=new AnnotationConfigApplicationContext(AppConfig01.class);
		
		JdbcConnectionInfo mysqlConnector = ctx.getBean("mysqlConnector",JdbcConnectionInfo.class);
		JdbcConnectionInfo oracleConnector = ctx.getBean("oracleConnector",JdbcConnectionInfo.class);
		
		mysqlConnector.getConnectionInfo();
		oracleConnector.getConnectionInfo();
	}
}
