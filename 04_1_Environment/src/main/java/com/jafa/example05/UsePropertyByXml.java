package com.jafa.example05;

import java.io.IOException;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;
import org.springframework.core.env.ConfigurableEnvironment;
import org.springframework.core.env.MutablePropertySources;
import org.springframework.core.io.support.ResourcePropertySource;

import config.AppConfig04;

// xml에서 프로퍼티 설정 
public class UsePropertyByXml {
	
	public static void main(String[] args) throws IOException {
		GenericXmlApplicationContext ctx = 
				new GenericXmlApplicationContext("classpath:example05/appConfig05.xml");
		JdbcConnectionBean05 bean = ctx.getBean(JdbcConnectionBean05.class);
		bean.jdbcConnectionInfo();
	}
}
