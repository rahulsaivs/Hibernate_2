package repository;

import javax.persistence.EntityManager;

import entities.Placement;

public class IPlacementRepositoryImp implements IPlacementRepository {
	
private EntityManager entityManager;
	

	public IPlacementRepositoryImp() {
		entityManager=JPAUtil.getEntityManager();
	}



	@Override
	public Placement addPlacement(Placement placement) {
		entityManager.persist(placement);
		return placement;
	}

	@Override
	public Placement updatePlacement(Placement placement) {
		entityManager.merge(placement);
		return placement;
	}

	@Override
	public Placement searchPlacement(long id) {
		Placement placement= entityManager.find(Placement.class,id);
		return placement;
	}

	@Override
	public boolean cancelPlacement(long id) {
		entityManager.remove(id);
		return true;
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