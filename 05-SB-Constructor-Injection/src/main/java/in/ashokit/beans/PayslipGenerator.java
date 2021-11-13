package in.ashokit.beans;

import org.springframework.stereotype.Component;

@Component
public class PayslipGenerator {

	private Printer printer;

	public PayslipGenerator(Printer printer) {
		System.out.println("**** PayslipGenerator : 1-Param Constructor *******");
		this.printer = printer;
	}

	public void generatePayslip() {
		// get payslip data from database
		printer.print();
	}
}