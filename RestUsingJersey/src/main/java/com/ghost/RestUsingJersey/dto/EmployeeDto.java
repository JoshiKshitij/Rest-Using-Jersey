package com.ghost.RestUsingJersey.dto;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class EmployeeDto {
	
	private String name ;
	private long id;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public EmployeeDto() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "EmployeeDto [name=" + name + ", id=" + id + "]";
	}
	public EmployeeDto(String name, long id) {
		super();
		this.name = name;
		this.id = id;
	}

}
