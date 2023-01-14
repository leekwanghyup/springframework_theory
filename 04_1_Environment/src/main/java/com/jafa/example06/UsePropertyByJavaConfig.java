package com.jafa.example06;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import config.AppConfig06;

//Configuration 애노테이션을 이용하는 자바설정에서 프로퍼티 사용
public class UsePropertyByJavaConfig {
	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext ctx 
				= new AnnotationConfigApplicationContext(AppConfig06.class);
		
		JdbcConnectionBean06 bean = ctx.getBean(JdbcConnectionBean06.class);
		bean.jdbcConnectionInfo();
	}
}
