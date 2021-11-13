package in.ashokit;

import java.util.Arrays;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import in.ashokit.entity.Student;
import in.ashokit.repository.StudentRepository;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);
		StudentRepository repository = context.getBean(StudentRepository.class);

		// List<Student> students = repository.findByStudentAge(26);

		// List<Student> students = repository.findByStudentAgeGreaterThanEqual(26);

		List<Student> students = repository.findByStudentAgeIn(Arrays.asList(22, 25));

		for (Student s : students) {
			System.out.println(s);
		}
	}
}
