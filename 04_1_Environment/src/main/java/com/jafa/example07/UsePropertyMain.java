package com.jafa.example07;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import config.AppConfig07;

public class UsePropertyMain {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext ctx = 
					new AnnotationConfigApplicationContext(AppConfig07.class);
		JdbcConnectionBean07 bean = ctx.getBean(JdbcConnectionBean07.class);
		bean.jdbcConnectionInfo();
	}
}
