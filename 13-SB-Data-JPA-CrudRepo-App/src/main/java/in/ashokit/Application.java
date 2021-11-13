package in.ashokit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import in.ashokit.entity.Student;
import in.ashokit.repository.StudentRepository;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);
		StudentRepository studentRepository = context.getBean(StudentRepository.class);

		// System.out.println(studentRepository.getClass().getName());

		Student student = new Student(102, "Rani", "rani@ashokit.in", 20);

		studentRepository.save(student);

		System.out.println("Record inserted .....");
	}

}
