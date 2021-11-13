package in.ashokit.beans;

import java.lang.reflect.Field;

public class Demo {

	public static void main(String[] args) {

		try {

			// loading the class using forName(.)
			Class<?> clzz = Class.forName("in.ashokit.beans.User");

			// Creating Object For The Class Which Is Loaded
			Object object = clzz.newInstance();

			// Loading the variable which is declared in the class
			Field ageField = clzz.getDeclaredField("age");

			// Making Variable is accessible
			ageField.setAccessible(true);

			// Setting the value for the variable
			ageField.set(object, 20);

			// Getting the value of the variable and printing on console
			System.out.println(ageField.get(object));

		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
