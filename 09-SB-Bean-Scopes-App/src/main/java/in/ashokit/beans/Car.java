package in.ashokit.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Car {

	@Autowired
	private IEngine eng1;

	@Autowired
	private IEngine eng2;

	public Car() {
		System.out.println("Car :: Constructor");
	}

}