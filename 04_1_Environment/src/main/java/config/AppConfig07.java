package config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;

import com.jafa.example07.JdbcConnectionBean07;

// PropetrySoruce와 PropertySourcesPlaceholderConfigurer 함께 사용
@Configuration
@PropertySource("classpath:example07/oracle.properties")
public class AppConfig07 {
	
	@Value("${db.driver}")
	private String driver;
	@Value("${db.jdbcUrl}")
	private String url;
	@Value("${db.user}")
	private String username;
	@Value("${db.password}")
	private String password;
	
	@Bean
	public static PropertySourcesPlaceholderConfigurer propertySourcesPlaceholderConfigurer() {
		return new PropertySourcesPlaceholderConfigurer();
	}
	
	@Bean
	public JdbcConnectionBean07 jdbcConnectionBean07() {
		JdbcConnectionBean07 bean = new JdbcConnectionBean07();
		bean.setDriver(driver);
		bean.setUrl(url);
		bean.setUsername(username);
		bean.setPassword(password);
		return bean;
	}
}
