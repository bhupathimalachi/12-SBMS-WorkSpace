package in.ashokit;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

import in.ashokit.entity.Student;
import in.ashokit.repository.StudentRepository;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);

		StudentRepository repository = context.getBean(StudentRepository.class);

		// List<Student> students = repository.findAll();
		//List<Student> students = repository.findAll(Sort.by("studentAge").ascending());

		/*Student student = new Student();
		student.setStudentAge(20);
		List<Student> students = repository.findAll(Example.of(student));*/
		
		int pageNo = 2;
		Page<Student> pageable = repository.findAll(PageRequest.of(pageNo-1, 3));
		List<Student> students = pageable.getContent();
		
		for (Student s : students) {
			System.out.println(s);
		}
		context.close();
	}
}
