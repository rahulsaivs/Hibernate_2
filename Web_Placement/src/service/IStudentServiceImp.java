package service;

import entities.Certificate;
import entities.Student;

import repository.ICertificateRepository;
import repository.ICertificateRepositoryImp;
import repository.IStudentRepository;
import repository.IStudentRepositoryImp;

public class IStudentServiceImp implements IStudentService{
	private static final Student Student = null;
	private IStudentRepository dao;
	private ICertificateRepository cao;
	
	public IStudentServiceImp() {
		dao=new IStudentRepositoryImp();
		cao=new ICertificateRepositoryImp();

	}

	@Override
	public Student addStudent(Student student) {
		dao.beginTransaction();
		dao.addStudent(student);
		dao.commitTransaction();
		return student;

	}

	@Override
	public Student updateStudent(Student student) {
		dao.beginTransaction();
		dao.updateStudent(student);
		dao.commitTransaction();
		return student;

	}

	@Override
	public Student searchStudentById(long id) {
		Student student=dao.searchStudentById(id);
		return student;
	}

	@Override
	public Student searchStudentByHallTicket(long ticketNo) {
		Student student=dao.searchStudentByHallTicket(ticketNo);
		return student;
	}

	@Override
	public boolean addCertificate(Certificate cerfificate) {
		dao.beginTransaction();
		cao.addCertificate(cerfificate);
		dao.commitTransaction();
		return true;

	}

	@Override
	public boolean updateCertificate(Certificate certificate) {
		dao.beginTransaction();
		cao.updateCertificate(certificate);
		dao.commitTransaction();
		return true;

	}

	@Override
	public boolean deleteStudent(long id) {
		dao.beginTransaction();
		boolean res=dao.deleteStudent(id);
		dao.commitTransaction();
		return res;

	}

}