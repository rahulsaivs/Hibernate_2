package service;

import entities.Certificate;
import repository.ICertificateRepository;
import repository.ICertificateRepositoryImp;

public class ICertificateServiceImp implements ICertificateService  {
private ICertificateRepository cao;
	

	public ICertificateServiceImp() {
		cao=new ICertificateRepositoryImp();
	}


	@Override
	public Certificate addCertificate(Certificate certificate) {
		cao.beginTransaction();
		cao.addCertificate(certificate);
		cao.commitTransaction();
		return certificate;
	}

	@Override
	public Certificate updateCertificate(Certificate certificate) {
		cao.beginTransaction();
		cao.updateCertificate(certificate);
		cao.commitTransaction();
		return certificate;

	}

	@Override
	public Certificate searchCertificate(long id) {
		Certificate certificate =cao.searchCertificate(id);
		return certificate;

	}

	@Override
	public Certificate deleteCertificate(long id) {
		cao.beginTransaction();
		Certificate certificate=cao.deleteCertificate(id);
		cao.commitTransaction();
		return certificate;

	}

}