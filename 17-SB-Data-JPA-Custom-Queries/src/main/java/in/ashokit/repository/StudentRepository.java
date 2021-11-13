package in.ashokit.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.transaction.annotation.Transactional;

import in.ashokit.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Integer> {

	@Query(value = "From Student where studentAge >=:age")
	public List<Student> getStudentsByAge(Integer age);

	@Query(value = "select * from students_dtls", nativeQuery = true)
	public List<Student> getStudents();

	@Transactional
	@Modifying
	@Query(value = "delete from Student where studentAge=:age")
	public void deleteStudentByAge(Integer age);

}