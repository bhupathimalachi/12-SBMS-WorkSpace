package in.ashokit.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import in.ashokit.util.PasswordUtils;

@Configuration
public class AppConfig {

	public AppConfig() {
		System.out.println("****** AppConfig :: Constructor *******");
	}

	@Bean
	public PasswordUtils getInstance() {
		PasswordUtils pwd = new PasswordUtils("AES");
		// customization
		return pwd;
	}

}
