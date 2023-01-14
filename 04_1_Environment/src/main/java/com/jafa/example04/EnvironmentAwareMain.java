package com.jafa.example04;

import java.io.IOException;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import config.AppConfig04;

// EnvironmentAware인터페이스 구현하여 Environment 사용하기 
public class EnvironmentAwareMain {
	
	public static void main(String[] args) throws IOException {
		AnnotationConfigApplicationContext ctx 
				= new AnnotationConfigApplicationContext(AppConfig04.class);
		JdbcConnectionBean04 bean = ctx.getBean(JdbcConnectionBean04.class);
		bean.jdbcConnectionInfo();
	}
}
