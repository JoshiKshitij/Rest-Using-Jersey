package com.ghost.RestUsingJersey.resourses;

import java.net.URI;
import java.util.List;
import java.util.Map;

import javax.ws.rs.GET;
import javax.ws.rs.HeaderParam;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.Cookie;
import javax.ws.rs.core.HttpHeaders;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.MultivaluedMap;
import javax.ws.rs.core.UriInfo;

import com.ghost.RestUsingJersey.dto.EmployeeDto;

@Path("/emp")
public class EmployeeResource {

	@GET
	@Produces(value = { MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
	public EmployeeDto getemp() {
		System.out.println("return emp");
		return new EmployeeDto("Kshitij Joshi", 21);
	}
	
	

	@GET
	@Path("/queryParam")
	@Produces(value = { MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
	public EmployeeDto getYear(@QueryParam("year") int year) {
		System.out.println("return emp " + year );
		return new EmployeeDto("Kshitij Joshi " + year , 21);
	}
	
	@GET
	@Path("/headerParam")
	@Produces(value = { MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
	public EmployeeDto paramsUsingHeaders(@HeaderParam(value = "head") String header) {
		System.out.println("return emp " + header );
		return new EmployeeDto("Kshitij Joshi " + header , 21);
	}
	
	@GET
	@Path("/contex")
	@Produces(value = { MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
	public EmployeeDto contexHttpHeaderUrfiINfo(@Context UriInfo info ,@Context HttpHeaders header) {
	
		// UriInfo has info aboput the parans passed in uri 
		URI absolutePath = info.getAbsolutePath();
		System.out.println("absolute path is : " +absolutePath);
		
		
		// this hold all the path params details
		Map<String,List<String>> pathParameters = info.getPathParameters();
		
		// this will hold all query param details
		Map<String,List<String>> queryParameters = info.getQueryParameters();
		
		
		// this will hold all the paramter passed in headers
		Map<String,List<String>> requestHeaders = header.getRequestHeaders();
		
		
		// will have all the cookies from the browers
		Map<String, Cookie> cookies = header.getCookies();
		return new EmployeeDto("Kshitij Joshi " + header , 21);
	}
	
	
	
	// resource chaining
	
	@Path("toStd")
	public StudentResource goToStudents() {
		
		// this method will return an in stance of the StudentResource
		// and then jersy will go into that resource and will 
		// look the futher uri
		
		//http://localhost:8010/RestUsingJersey/webresources/emp/toStd/getAll
		//http://localhost:8010/RestUsingJersey/webresources/emp/toStd
		
		return new StudentResource();
	}
	
	
}
