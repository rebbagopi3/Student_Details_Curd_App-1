package com.rg.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.rg.entity.Student;

@Repository
public interface StudentRepo extends CrudRepository<Student, Integer> {

	// select * from stu_dtls where s_name=?
	public List<Student> findByName(String name);

	// public Student updateStudent(Student student);

	// select * from stu_dtls where s_email=?
	public List<Student> findByEmail(String email);


	//select * from stu_dtls where s_aadharno=?
	public List<Student> findByAadharno(Integer aadharno);

	// select * from stu_dtls where phono=?
	public List<Student> findByPhono(Integer phono);
	
	//select * from stu_dtls where address=?
	public List<Student> findByAddress(String address);
	
	public List<Student> findByQualification(String qualification);
	
	public List<Student> findByPincode(Integer pincode);

}
