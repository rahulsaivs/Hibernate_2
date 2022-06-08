package com.dao;

import com.entities.Student;

public interface StudentDao {
	abstract void addStudent (Student student);
	abstract Student getStudentById(int ID);
	abstract void updateStudent(Student student);
	abstract void removeStudent(Student student);
	abstract void commitTransaction();
	abstract void beginTransaction();
	//Student getStudentById1(int ID);
	
}