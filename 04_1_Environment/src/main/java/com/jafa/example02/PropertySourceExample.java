package com.jafa.example02;

import java.io.IOException;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.core.env.ConfigurableEnvironment;
import org.springframework.core.env.MutablePropertySources;
import org.springframework.core.io.support.ResourcePropertySource;

// Environment에 PropertySource 추가하기 
public class PropertySourceExample {
	
	public static void main(String[] args) throws IOException {
		AnnotationConfigApplicationContext ctx = 
					new AnnotationConfigApplicationContext();
		
		ConfigurableEnvironment env = ctx.getEnvironment();
		
		// 새로운 PropertySource를 추가해주는 메소드 제공
		MutablePropertySources propertySources = env.getPropertySources();
		
		// addLast(), addFirst()로 프로퍼티 파일 등록
		// 우선순위  addFirst > addLast  
		propertySources.addLast(new ResourcePropertySource("classpath:/example02/mysql.properties"));
		propertySources.addFirst(new ResourcePropertySource("classpath:/example02/oracle.properties"));
		
		// db.properties에 등록된 값을 읽어오자 
		String driver = env.getProperty("db.driver");
		String url = env.getProperty("db.jdbcUrl");
		String user = env.getProperty("db.user");
		String pwd = env.getProperty("db.password");
		
		// 결과 출력
		System.out.println(driver);
		System.out.println(url);
		System.out.println(user);
		System.out.println(pwd);
	}
}
