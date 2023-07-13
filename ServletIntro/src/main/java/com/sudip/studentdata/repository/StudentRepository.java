package com.sudip.studentdata.repository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.sudip.studentdata.dto.Student;

public class StudentRepository {
	//This method save list of all data or object
 private Connection getConnection() throws SQLException {
	try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		String url="jdbc:mysql://localhost:3306/m11_e4";
		String user="root";
		String pass="sudipu";
		return DriverManager.getConnection(url,user,pass);
		
	}catch(ClassNotFoundException e) {
		e.printStackTrace();
	}
	return null;
}
public String saveStudent(Student student) throws SQLException {
	
	int res=0;
	Connection connection= getConnection();
String query="INSERT INTO student Values(?,?,?,? )";
try {
	PreparedStatement ps= connection .prepareStatement(query);
	ps.setInt(1,student.getId());
	ps.setString(2,student.getName());
	ps.setString(2,student.getEmail());
	ps.setString(2,student.getCourse());
	
	res=ps.executeUpdate();
	connection .close();
}catch(SQLException e) {
	e.printStackTrace();
}
return student.toString()+"data saved sucessfully";
}
// This method return list of all data or object

public List<Student>getAllData() throws SQLException{
	List<Student>list= null;
	Connection connection=getConnection();
	String query ="SELECT* FROM student";
	try {
		PreparedStatement ps= connection .prepareStatement(query);
		ResultSet set= ps.executeQuery();
		if(set.isBeforeFirst()) {
			list= new ArrayList<>();
			while(set.next()) {
				Student student =new Student();
				student.setId(set.getInt(1));
				student .setName(set.getString(2));
				student .setEmail(set.getString(3));
				student .setCourse(set.getString(4));
				list.add(student);
			}
		}
	}catch(SQLException e) {
		e.printStackTrace();
	}
	
	return new ArrayList<>();
}
}
