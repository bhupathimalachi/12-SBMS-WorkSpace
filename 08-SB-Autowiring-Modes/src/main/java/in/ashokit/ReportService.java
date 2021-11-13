package in.ashokit;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class ReportService {

	@Autowired
	@Qualifier("excel")
	private IReport reportGenerator;

	public void report() {
		reportGenerator.generateReport();
	}
}
