package in.ashokit.beans;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.stereotype.Component;

@Component
public class Motor {

	private Motor() {
		System.out.println("*** Motor :: Constructor ***");
	}

	@PostConstruct
	public static void start() {
		System.out.println("*** Motor :: Startring.....***");
	}

	public void doWork() {
		System.out.println("Motor working....");
	}

	@PreDestroy
	public static void stop() {
		System.out.println("*** Motor :: Stopped.... ***");
	}

}
