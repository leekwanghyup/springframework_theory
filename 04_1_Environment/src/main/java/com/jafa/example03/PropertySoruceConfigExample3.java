package com.jafa.example03;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import config.AppConfig03;

// AppConfig3 : @PropertySources를 사용하여 여러개의 @PropertySource 설정하기
public class PropertySoruceConfigExample3 {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext ctx 
					=new AnnotationConfigApplicationContext(AppConfig03.class);
		
		JdbcConnectionInfo mysqlConnector = ctx.getBean("mysqlConnector",JdbcConnectionInfo.class);
		JdbcConnectionInfo oracleConnector = ctx.getBean("oracleConnector",JdbcConnectionInfo.class);
		
		mysqlConnector.getConnectionInfo();
		oracleConnector.getConnectionInfo();
	}
}
