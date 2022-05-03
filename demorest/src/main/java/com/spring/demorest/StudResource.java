package com.spring.demorest;

import java.sql.SQLException;
import java.util.List;

import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.DELETE;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.PUT;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("students")
public class StudResource {
	
	StudentRepository repo = new StudentRepository();
	
	@GET
	@Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
	public List<Student> getStuds() throws SQLException {
		System.out.println("Get called");
		
		return repo.getStuds();
	}
	
	@GET
	@Path("student/{id}")
	@Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
	public Student getStud(@PathParam("id") int id) throws SQLException {
		System.out.println("Get stud called");
		return repo.getStud(id);
	}
	
	@POST
	@Path("student")
	@Consumes({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
	public Student createStud(Student s) throws SQLException {
		System.out.println(s);
		repo.create(s);
		return s;
	}
	
	@PUT
	@Path("student")
	@Consumes({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
	public Student updateStud(Student s) throws SQLException {
		System.out.println(s);
		if(repo.getStud(s.getId()).getId()==0)
			repo.create(s);
		else
			repo.update(s);
		return s;
	}
	
	@DELETE
	@Path("student/{id}")
	@Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
	public Student deleteStud(@PathParam("id") int id) throws SQLException {
		Student s = repo.getStud(id);
		if(s.getId()!=0)
			repo.delete(id);
		return s;
	}
}
