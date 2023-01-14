package com.jafa.example03;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Builder
public class JdbcConnectionInfo {
	
	private String driver;
	private String url;
	private String username;
	private String password;
	
	public void getConnectionInfo() {
		System.out.println("드라이버 : "+this.driver);
		System.out.println("주소 : "+this.url);
		System.out.println("계정 : "+this.username);
		System.out.println("암호 : "+this.password);
	}
}
