package com.rg.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.rg.entity.Student;
import com.rg.repository.StudentRepo;

@RestController
public class StudentController {
	@Autowired
	StudentRepo repo;

	@GetMapping("/getall/students")
	public List<Student> getallStudents() {
		return (List<Student>) repo.findAll();
	}

	@PostMapping("/save/student")
	public Student saveStudent(@RequestBody Student student) {
		return repo.save(student);
	}

//	@PutMapping("/update/student/{id}")
//	public Student upadateStudent(@PathVariable Integer id, @RequestBody Student stu) {
//		Student exiting = repo.findById(id).orElseThrow(() -> new RuntimeException("Student not fount" + id));
//
//	exiting.setStudentStatus(stu.getStudentStatus()!=null? stu.getStudentStatus():exiting.getStudentStatus());
////		exiting.setStudentStatus(stu.getStudentStatus()!=null? stu.getStudentStatus():exiting.getStudentStatus());
////		exiting.setStudentStatus(stu.getStudentStatus()!=null? stu.getStudentStatus():exiting.getStudentStatus());
////		exiting.setStudentStatus(stu.getStudentStatus()!=null? stu.getStudentStatus():exiting.getStudentStatus());
////		exiting.setStudentStatus(stu.getStudentStatus()!=null? stu.getStudentStatus():exiting.getStudentStatus());
////		
//		repo.save(exiting);
//
//		return exiting;
//
//	}
//	public Employee updateEmployee(Employee employee) {
//        employeeDao.findById(employee.getEmployeeId()).orElseThrow();
//        return employeeDao.save(employee);
//    }
//	@PutMapping("/update/employee")
//    public Employee updateEmployee(@RequestBody Employee employee) {
//        return employeeService.updateEmployee(employee);
//    }

	@PutMapping("/update/student")
	public Student updateStudent(@RequestBody Student student) {
		repo.findById(student.getId()).orElseThrow();
		repo.save(student);
		return student;
	}

	@GetMapping("/getbyid/student/{id}")
	public Student getStudentById(@PathVariable Integer id) {
		return repo.findById(id).orElseThrow(() -> new RuntimeException("Student not found" + id));

	}

	@DeleteMapping("/delet/student/{id}")
	public String deleteStudent(@PathVariable Integer id) {
		repo.deleteById(id);
		return "Student deleted " + id;

	}

	@GetMapping("/getbyname/sudent/{name}")
	public List<Student> getStudentByName(@PathVariable String name) {
		return repo.findByName(name);
	}

	@GetMapping("/getbyemail/{email}")
	public List<Student> getStudentByEmail(@PathVariable String email) {
		return repo.findByEmail(email);
	}

	@GetMapping("/getbyaadhar/{aadharno}")
	public List<Student> getStudentByAadharNo(@PathVariable Integer aadharno) {
		return repo.findByAadharno(aadharno);
	}

	@GetMapping("/getbyphono/{phono}")
	public List<Student> getStudentByPhoNo(@PathVariable Integer phono) {
		return repo.findByPhono(phono);
	}
	
	@GetMapping("/getbyaddress/{address}")
	public List<Student> getByAddress(@PathVariable String address){
		return repo.findByAddress(address);
	}
	@GetMapping("/getbyqualification/{qualification}")
	public List<Student> getByQualification(@PathVariable String qualification){
		return repo.findByQualification(qualification);
	}
	
	@GetMapping("/getbypincode/{pincode}")
	public List<Student> findByPincode(@PathVariable Integer pincode){
		return repo.findByPincode(pincode);
	}

}
