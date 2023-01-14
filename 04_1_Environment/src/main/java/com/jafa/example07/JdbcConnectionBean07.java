package com.jafa.example07;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class JdbcConnectionBean07 {
	private String driver; 
	private String url; 
	private String username; 
	private String password;
	
	public void jdbcConnectionInfo() {
		System.out.println("JdbcConnectionBean07");
		System.out.println("드라이버 : " + this.driver);
		System.out.println("URL : " + this.url);
		System.out.println("사용자계정 : "+this.username);
		System.out.println("암호 : " + this.password);
	}
}
