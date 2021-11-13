package in.ashokit.dao;

import org.springframework.stereotype.Repository;

@Repository
public class UserDao {

	public UserDao() {
		System.out.println("**** UserDao :: Constructor ****");
	}

	public String saveUser(String name, String email, Long phno) {
		// logic to insert record into DB
		return "User Saved";
	}
}
