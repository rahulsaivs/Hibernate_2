package repository;

import entities.Student;

public interface IStudentRepository {
	Student addStudent(Student student);
	Student updateStudent(Student student);
	Student searchStudentById(long id);
	Student searchStudentByHallTicket(long ticketNo);
	boolean deleteStudent(long id);
	void beginTransaction() ;
	void commitTransaction();
}