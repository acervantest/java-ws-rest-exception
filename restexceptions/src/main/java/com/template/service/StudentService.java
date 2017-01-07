package com.template.service;

import java.util.List;

import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

import com.template.bean.Student;

@Produces({"application/xml", "application/json"})
public interface StudentService {

	@POST
	@Path("/student/")
	public Response addStudent(Student student);
	
	@GET
	@Path("/student/{id}")
	public Student getStudent(@PathParam("id") String id);
	
	@GET
	@Path("/student")
	public List<Student> getAllStudents();
	
	@PUT
	@Path("/student/")
	public Response updateStudent(Student student);

	@DELETE
	@Path("/student/{id}")
	public Response deleteStudent(@PathParam("id") String id);
}
