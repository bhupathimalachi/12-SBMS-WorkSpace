package in.ashokit.beans;

import org.springframework.stereotype.Component;

@Component
public class Printer {

	public Printer() {
		System.out.println("******* Printer::Constructor ******");
	}

	public void print() {
		System.out.println("**********Payslip printing......*************");
	}
}
