package in.ashokit.beans;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class Engine implements IEngine{

	public Engine() {
		System.out.println("Engine :: Constructor");
	}

}
