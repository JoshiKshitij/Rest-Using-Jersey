package com.ghost.RestUsingJersey.resourses;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.ghost.RestUsingJersey.dto.StudentDto;

@Path("/std")
public class StudentResource {

	
	@GET
	@Produces(value= {MediaType.APPLICATION_XML,MediaType.APPLICATION_JSON})
	public StudentDto getStudent(){
		return new StudentDto("arhun", "Kv", 16);
	}
	
	@GET
	@Path(value = "getAll")
	@Produces(value= {MediaType.APPLICATION_XML,MediaType.APPLICATION_JSON})
	public List<StudentDto> getAllStudent(){
		List<StudentDto> al = new ArrayList<StudentDto>();
		al.add(	new StudentDto("arhun", "Kv", 16));
		al.add(	new StudentDto("karan", "Sts", 17));
		al.add(	new StudentDto("Hitler", "Kv", 16));
		al.add(	new StudentDto("Krish", "Kv", 18));
		al.add(	new StudentDto("Ram", "Kv", 18));
	
		return al;
	}

	public StudentResource() {
		super();
		System.out.println("StudentResorce Created");
		System.out.println("and it will return xml format object ");
	}
	
	
}
