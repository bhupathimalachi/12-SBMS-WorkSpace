package in.ashokit;

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

		// List<Student> students = repository.getStudentsByAge(20);

		/*List<Student> students = repository.getStudents();

		for (Student s : students) {
			System.out.println(s);
		}*/
		
		repository.deleteStudentByAge(25);

	}
}
