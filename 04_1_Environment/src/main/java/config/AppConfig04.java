package config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import com.jafa.example04.JdbcConnectionBean04;

@Configuration
@PropertySource(value ="classpath:example04/oracle.properties")
public class AppConfig04 {
	
	// JdbcConnectionEnv는 EnvironmentAware 인터페이스를 구현함
	// 이 인터페이스를 구현한 객체가 스프링빈이 되면 스프링 컨테이너는 
	// Environment객체를 주입한다. 
	@Bean
	public JdbcConnectionBean04 jdbcConnectionBean() {
		return new JdbcConnectionBean04();
	}
}
