package com.sudip.studentdata.dto;

//import lombok.AllArgsConstructor;
//import lombok.Data;
//import lombok.NoArgsConstructor;
//@Data
//@AllArgsConstructor
//@NoArgsConstructor

public class Student {
	
	
	private Integer id;
	private String name;
	private String email;
	private String course;
	
public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	
@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", email=" + email + ", course=" + course + "]";
	}

public Student(int id ,String name,String email,String course) {
	super();
	this.id = id;
	this.name = name;
	this.email = email;
	this.course = course;
}

public Student() {
	// TODO Auto-generated constructor stub
}
	
}
