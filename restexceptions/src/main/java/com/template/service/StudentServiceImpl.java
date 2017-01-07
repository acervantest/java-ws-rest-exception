package com.template.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.ws.rs.core.Response;

import com.template.bean.Student;
import com.template.exception.SomeBusinessException;


public class StudentServiceImpl implements StudentService{

	private long currentId = 111;
	Map<Long, Student> students = new HashMap<Long, Student>();
	
	public StudentServiceImpl() {
		init();
	}
	
	final void init(){
		
		Student student = new Student(currentId, "Alejandro", "Cervantes");
		
		students.put(student.getEnrollmentId(), student);
		
	}

	@Override
	public Response addStudent(Student student) {
		System.out.println("add student method invoqued... student : "+student);
		student.setEnrollmentId(++currentId);
		students.put(student.getEnrollmentId(), student);
		return Response.ok(student).build();
	}

	@Override
	public Student getStudent(String id) {
		System.out.println("getStudent method invoqued... id : "+id);
		Long studentId = Long.parseLong(id);
		Student student = students.get(studentId);
		return student;
	}

	@Override
	public Response updateStudent(Student student) {
		System.out.println("updateStudent method invoqued... student : "+student);
		Student oldStudent = students.get(student.getEnrollmentId());
		Response response = null;
		if(oldStudent != null){
			students.put(student.getEnrollmentId(), student);
			response = Response.ok().build();
		}else{
			response = Response.notModified().build();
		}
		return response;
	}

	@Override
	public Response deleteStudent(String id) {
		System.out.println("deleteStudent method invoqued... id : "+id);
		Long studentId = Long.parseLong(id);
		Student studentToErase = students.get(studentId);
		
		Response response = null;
		if(studentToErase != null){
			students.remove(studentId);
			response = Response.ok().build();
		}else{
			throw new SomeBusinessException("Business Exception sent from delete method...");
		}
		return response;
	}

	@Override
	public List<Student> getAllStudents() {	
		System.out.println("getAllStudents method invoqued... : ");
		List<Student> allStudents = new ArrayList<Student>(students.values());
		allStudents.forEach(System.out::println);
		return allStudents;
	}
}
