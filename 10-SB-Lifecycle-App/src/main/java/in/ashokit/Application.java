package in.ashokit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import in.ashokit.beans.ConnectionPoolManager;
import in.ashokit.beans.Motor;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);
		
		Motor bean = context.getBean(Motor.class);
		bean.doWork();

		ConnectionPoolManager cpm = context.getBean(ConnectionPoolManager.class);
		cpm.getConnection();
	}
}