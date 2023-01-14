package com.jafa.example03;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import config.AppConfig01;
import config.AppConfig02;

// AppConfig2 : 프로퍼티파일을 찾지 못할 경우 예외발생 무시하기
public class PropertySoruceConfigExample2 {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext ctx 
					=new AnnotationConfigApplicationContext(AppConfig02.class);
		
		JdbcConnectionInfo mysqlConnector = ctx.getBean("mysqlConnector",JdbcConnectionInfo.class);
		JdbcConnectionInfo oracleConnector = ctx.getBean("oracleConnector",JdbcConnectionInfo.class);
		
		mysqlConnector.getConnectionInfo();
		oracleConnector.getConnectionInfo();
	}
}
