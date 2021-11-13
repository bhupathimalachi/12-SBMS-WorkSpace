package in.ashokit.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.ashokit.dao.UserDao;

@Service
public class UserService {

	public UserService() {
		System.out.println("*** UserService :: Constructor ***");
	}

	@Autowired
	private UserDao userdao;
	
	public void saveUser() {
		String status = userdao.saveUser("Raju", "raju@gmail.com", 6301921083l);
		System.out.println(status);
	}
}