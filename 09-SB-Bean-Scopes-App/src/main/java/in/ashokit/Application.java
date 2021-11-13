package in.ashokit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import in.ashokit.beans.Car;
import in.ashokit.beans.Engine;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);
		Engine bean1 = context.getBean(Engine.class);
		Engine bean2 = context.getBean(Engine.class);

		System.out.println(bean1.hashCode());
		System.out.println(bean2.hashCode());
		System.out.println("---------------------------------");

		Car car1 = context.getBean(Car.class);
		Car car2 = context.getBean(Car.class);
		System.out.println(car1.hashCode());
		System.out.println(car2.hashCode());

	}
}
