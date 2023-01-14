package com.jafa.example04;

import org.springframework.context.EnvironmentAware;
import org.springframework.core.env.Environment;


// EnvironmentAware인터페이스 구현 
public class JdbcConnectionBean04 implements EnvironmentAware{
	
	// EnvironmentAware 인터페이스를 구현한 객체가 스프링 빈으로 등록되면 
	// 스프링컨테이너가 Environment객체를 주입해준다. 
	private Environment environment;

	// setEnvironment메소드 오버라이딩 
	@Override
	public void setEnvironment(Environment environment) {
		this.environment = environment;
	}
	
	public void jdbcConnectionInfo() {
		System.out.println("JdbcConnectionBean04");
		System.out.println("드라이버 : " + environment.getProperty("db.driver"));
		System.out.println("URL : " + environment.getProperty("db.jdbcUrl"));
		System.out.println("사용자계정 : "+environment.getProperty("db.user"));
		System.out.println("암호 : " + environment.getProperty("db.password"));
	}
}
