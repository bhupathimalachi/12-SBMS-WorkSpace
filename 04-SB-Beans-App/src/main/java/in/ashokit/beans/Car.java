package in.ashokit.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Car {

	public Car() {
		System.out.println("******* Car :: Constructor *********");
	}

	private Engine eng;

	@Autowired
	public void setEng(Engine eng) {
		System.out.println("***** setEng() method called ******");
		this.eng = eng;
	}

	public void drive() {
		int start = eng.start();
		if (start >= 0) {
			System.out.println("Journey Started");
		} else {
			System.out.println("Engine in trouble");
		}
	}
}