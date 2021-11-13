package in.ashokit.beans;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class CacheManager implements ApplicationRunner {

	public CacheManager() {
		System.out.println("*** CacheManager::Constructor ***");
	}

	/*@Override
	public void run(String... args) throws Exception {
		System.out.println("*** Loading Data From DB to Cache ***");
	}*/
	
	@Override
	public void run(ApplicationArguments args) throws Exception {
		System.out.println("*** Loading Data From DB to Cache ***");
	}

}
