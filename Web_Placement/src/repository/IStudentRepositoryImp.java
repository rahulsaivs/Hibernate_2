package repository;

import javax.persistence.EntityManager;

import entities.Student;

public class IStudentRepositoryImp implements IStudentRepository {
	private static final Student Student=null;
	private EntityManager entityManager;
	
	public IStudentRepositoryImp() {
		entityManager=JPAUtil.getEntityManager();
	}

	@Override
	public Student addStudent(Student student) {
		entityManager.persist(student);

		return student;
	}

	@Override
	public Student updateStudent(Student student) {
		entityManager.merge(student);

		return student;
	}

	@Override
	public Student searchStudentById(long id) {
		Student student=entityManager.find(Student.getClass(), id);
		return student;
	}

	@Override
	public Student searchStudentByHallTicket(long ticketNo) {
		Student student=entityManager.find(Student.getClass(), ticketNo );
		return student;
	}

	@Override
	public boolean deleteStudent(long id) {
		entityManager.remove(id);
		return false;

	}

	@Override
	public void beginTransaction() {
		entityManager.getTransaction().commit();

		
	}

	@Override
	public void commitTransaction() {
		entityManager.getTransaction().begin();

		
	}

}