package in.ashokit;

import org.springframework.stereotype.Component;

@Component("excel")
public class ExcelReport implements IReport {

	@Override
	public void generateReport() {
		System.out.println("*** Excel Report Generated......******");
	}
}
