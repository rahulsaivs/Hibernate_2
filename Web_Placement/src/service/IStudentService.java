package service;

import entities.Certificate;
import entities.Student;

public interface IStudentService {
	Student addStudent(Student student);
	Student updateStudent(Student student);
	Student searchStudentById(long id);
	Student searchStudentByHallTicket(long ticketNo);
	boolean addCertificate(Certificate cerfificate);
	boolean updateCertificate(Certificate certificate);
	boolean deleteStudent(long id);


}