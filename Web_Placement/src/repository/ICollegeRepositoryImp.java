package repository;

import javax.persistence.EntityManager;

import entities.College;

public class ICollegeRepositoryImp implements ICollegeRepository{
	
	private EntityManager entityManager;
	public ICollegeRepositoryImp() {
		entityManager=JPAUtil.getEntityManager();
	}

	@Override
	public College addCollege(College college) {
		entityManager.persist(college);
		return college;
	}

	@Override
	public College updateCollege(College college) {
		entityManager.merge(college);
		return college;
	}

	@Override
	public College searchCollege(long id) {
		College college=entityManager.find(College.class, id);
		return college;
	}

	@Override
	public boolean deleteCollege(long id) {
		entityManager.remove(id);
		return false;
	}

	@Override
	public void beginTransaction() {
		entityManager.getTransaction().begin();		
	}

	@Override
	public void commitTransaction() {
		entityManager.getTransaction().commit();		
	}

}