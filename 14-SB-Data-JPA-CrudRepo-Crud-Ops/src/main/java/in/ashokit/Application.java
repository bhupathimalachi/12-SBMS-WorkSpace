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

		/*Student student1 = new Student(121, "Sachin", "sachin@ashokit.in", 26);
		Student student2 = new Student(122, "Rajkumar", "raj.k@ashokit.in", 28);
		Student student3 = new Student(123, "Vivek", "vivek@ashokit.in", 21);

		List<Student> studentsList = Arrays.asList(student1, student2, student3);

		repository.saveAll(studentsList);*/

		//System.out.println("Records Count :: "+ repository.count());
		
		//System.out.println(repository.findById(121));
		
		/*List<Integer> idsList = Arrays.asList(121,122,123);
		Iterable<Student> students = repository.findAllById(idsList);*/
		
		/*Iterable<Student> students = repository.findAll();
		
		for(Student student : students) {
			System.out.println(student);
		}*/
		
		//System.out.println("Is Record Present ? ::"+ repository.existsById(121));
		
		repository.deleteById(123);
		
	}

}
