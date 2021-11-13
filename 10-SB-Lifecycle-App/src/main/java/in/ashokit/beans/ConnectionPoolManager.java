package in.ashokit.beans;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;

@Component
public class ConnectionPoolManager implements InitializingBean, DisposableBean {

	public ConnectionPoolManager() {
		System.out.println("*** ConnectionPoolManager::Constructor ***");
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("*** Connection Pool Created ****");
	}

	public void getConnection() {
		System.out.println("Got Connection from pool.....");
	}

	@Override
	public void destroy() throws Exception {
		System.out.println("*** Connection Pool Destroyed ***");
	}

}
