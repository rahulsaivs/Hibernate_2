package com.client;

import com.entities.Student;
import com.service.StudentService;
import com.service.StudentServiceImp;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StudentService service=new StudentServiceImp();
		Student student=new Student();
		student.setID(19);
		student.setName("Soujan");
		service.addStudent(student);
		
		/*student=service.findStudentById(16);
		System.out.println("ID: "+student.getID());
		System.out.println("Name:"+student.getName());*/
		
		/*student=service.findStudentById(16);
		student.setName("Rakshit");
		service.updateStudent(student);*/
		
		student=service.findStudentById(16);
		student.setName("Rakshit");
		service.removeStudent(student);
	}

}