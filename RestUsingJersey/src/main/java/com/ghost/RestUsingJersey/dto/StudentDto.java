package com.ghost.RestUsingJersey.dto;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class StudentDto {
	
	private String name;
	private String school;
	private int age;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSchool() {
		return school;
	}
	public void setSchool(String school) {
		this.school = school;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public StudentDto() {
		super();
		// TODO Auto-generated constructor stub
	}
	public StudentDto(String name, String school, int age) {
		super();
		this.name = name;
		this.school = school;
		this.age = age;
	}
	@Override
	public String toString() {
		return "StudentDto [name=" + name + ", school=" + school + ", age=" + age + "]";
	}
	
	

}
