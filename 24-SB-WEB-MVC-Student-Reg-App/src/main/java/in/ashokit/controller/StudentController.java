package in.ashokit.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import in.ashokit.binding.Student;
import in.ashokit.repository.StudentRepository;

@Controller
public class StudentController {

	@Autowired
	private StudentRepository studentRepo;

	@GetMapping("/student")
	public String loadForm(Model model) {
		Student studentObj = new Student();
		model.addAttribute("student", studentObj);
		return "index";
	}

	@PostMapping("/saveStudent")
	public String saveStudent(Student student) {
		System.out.println(student);
		studentRepo.save(student);
		return "success";
	}
}
