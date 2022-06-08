package repository;

import javax.persistence.EntityManager;

import entities.Certificate;

public class ICertificateRepositoryImp implements ICertificateRepository {
	
	private EntityManager entityManager;
	
	public ICertificateRepositoryImp() {
		entityManager=JPAUtil.getEntityManager();
	}

	@Override
	public Certificate addCertificate(Certificate certificate) {
		entityManager.persist(certificate);
		return certificate;
	}

	@Override
	public Certificate updateCertificate(Certificate certificate) {
		entityManager.merge(certificate);
		return certificate;
	}

	@Override
	public Certificate searchCertificate(long id) {
		Certificate certificate=entityManager.find(Certificate.class, id);
		return certificate;
	}

	@Override
	public Certificate deleteCertificate(long id) {
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