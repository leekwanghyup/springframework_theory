package com.jafa.example01;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.core.env.ConfigurableEnvironment;

// Environment로 프로퍼티 읽기
public class getEnvironmentExample {
	
	public static void main(String[] args) {
		AnnotationConfigApplicationContext ctx 
							= new AnnotationConfigApplicationContext(); 

		// 프로필 선택 기능, PropertySource 추가기능 제공
		// Environment 인터페이스 상속
		ConfigurableEnvironment env = ctx.getEnvironment();
		
		String javaVersion = env.getProperty("java.version"); // 자바버전
		String jrePath = env.getProperty("java.home"); // JRE가 설치된 경로
		String osName = env.getProperty("os.name");
		String pathSeperator = env.getProperty("file.separator");
		System.out.println(javaVersion);
		System.out.println(jrePath);
		System.out.println(pathSeperator);
	}
	
}
