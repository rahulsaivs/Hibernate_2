package service;

import entities.College;
import entities.Placement;
import repository.ICollegeRepository;
import repository.ICollegeRepositoryImp;

public class ICollegeServiceImp implements ICollegeService{
	
private ICollegeRepository coao;
	

	public ICollegeServiceImp() {
		coao=new ICollegeRepositoryImp();
	}


	@Override
	public College addCollege(College college) {
		coao.beginTransaction();
		coao.addCollege(college);
		coao.commitTransaction();
		return college;

	}

	@Override
	public College updateCollege(College college) {
		coao.beginTransaction();
		coao.updateCollege(college);
		coao.commitTransaction();
		return college;
	}

	@Override
	public College searchCollege(long id) {
		College college =coao.searchCollege(id);
		return college;
	}

	@Override
	public boolean deleteCollege(long id) {
		coao.beginTransaction();
		boolean res=coao.deleteCollege(id);
		coao.commitTransaction();
		return res;

	}

	@Override
	public boolean schedulePlacement(Placement placement) {
		// TODO Auto-generated method stub
		return false;
	}

}