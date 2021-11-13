package in.ashokit.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import in.ashokit.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Integer> {

	// select * from student_dtls where student_age=:age
	public List<Student> findByStudentAge(Integer age);

	// select * from student_dtls where student_Age >= :age
	public List<Student> findByStudentAgeGreaterThanEqual(Integer age);

	// select * from student_dtls where student_age in (?...)
	public List<Student> findByStudentAgeIn(List<Integer> ages);

	// select * from student_dtls where student_name=:name and student_age=:age
	public List<Student> findByStudentNameAndStudentAge(String name, Integer age);

}