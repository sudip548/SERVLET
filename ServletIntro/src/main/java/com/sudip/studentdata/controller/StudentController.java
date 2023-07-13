package com.sudip.studentdata.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sudip.studentdata.dto.Student;
import com.sudip.studentdata.repository.StudentRepository;
@WebServlet("/Student")
public class StudentController  extends HttpServlet{

  private StudentRepository repository;
  {
	repository = new StudentRepository();  
  }
	@Override
	protected  void doPost(HttpServletRequest req,HttpServletResponse resp)throws ServletException,IOException{
	int id= Integer.parseInt(req.getParameter("id"));
	String name=req.getParameter("name");
	String email=req.getParameter("email");
	String course=req.getParameter("course");
	
    Student student = new Student(id ,name,email,course);
    
    resp.getWriter().println(repository.saveStudent(student));
	 
    }
	@Override
	protected  void doGet(HttpServletRequest req,HttpServletResponse resp)throws ServletException,IOException{
    List<Student >list = repository.getAllData();
    
    PrintWriter writer=resp.getWriter();
    list.forEach(writer::println);
	
	}
}