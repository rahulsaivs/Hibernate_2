package com.dao;

import javax.persistence.EntityManager;

import com.entities.Student;

public class StudentDaoImp implements StudentDao
{
	private EntityManager entityManager;
	public StudentDaoImp()
	{
		entityManager=JPAUtil.getEntityManager();
	}
	@Override
	public void addStudent(Student student) {
		// TODO Auto-generated method stub
		entityManager.persist(student);
	}

	@Override
	public Student getStudentById(int ID) {
		// TODO Auto-generated method stub
		Student student=entityManager.find(Student.class,ID);
		return student;
	}

	@Override
	public void updateStudent(Student student) {
		// TODO Auto-generated method stub
		entityManager.merge(student);
	}

	@Override
	public void removeStudent(Student student) {
		// TODO Auto-generated method stub
		entityManager.remove(student);
	}
	@Override
	public void commitTransaction() {
		entityManager.getTransaction().commit();
		
	}

	@Override
	public void beginTransaction() {
		entityManager.getTransaction().begin();
}
}