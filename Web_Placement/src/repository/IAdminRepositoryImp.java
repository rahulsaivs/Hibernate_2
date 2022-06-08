package repository;

import javax.persistence.EntityManager;

import entities.Admin;

public class IAdminRepositoryImp implements IAdminRepository  {
	
	private EntityManager entityManager;
	public IAdminRepositoryImp() {
		entityManager=JPAUtil.getEntityManager();
	}

	@Override
	public Admin addNewAdmin(Admin admin) {
		entityManager.persist(admin);
		return admin;
	}

	@Override
	public Admin updateAdmin(Admin admin) {
		entityManager.merge(admin);
		return admin;
	}

	@Override
	public Admin deleteAdmin(long id) {
		entityManager.remove(id);
		return null;
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