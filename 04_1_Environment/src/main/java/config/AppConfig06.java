package config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.core.io.ClassPathResource;

import com.jafa.example06.JdbcConnectionBean06;

// Configuration 애노테이션을 이용하는 자바설정에서 프로퍼티 사용
@Configuration
public class AppConfig06 {
	
	@Value("${db.driver}")
	private String driver;
	@Value("${db.jdbcUrl}")
	private String url;
	@Value("${db.user}")
	private String username;
	@Value("${db.password}")
	private String password;
	
	// 빈등록 시 static 메소드로 지정해야한다.
	@Bean
	public static PropertySourcesPlaceholderConfigurer propertySourcesPlaceholderConfigurer() {
		PropertySourcesPlaceholderConfigurer configurer = 
				 new PropertySourcesPlaceholderConfigurer();
		configurer.setLocation(new ClassPathResource("example06/oracle.properties"));
		return configurer;
	}
	
	@Bean
	public JdbcConnectionBean06 jdbcConnectionBean06() {
		JdbcConnectionBean06 bean = new JdbcConnectionBean06();
		bean.setDriver(driver);
		bean.setUrl(url);
		bean.setUsername(username);
		bean.setPassword(password);
		return bean;
	}
}
