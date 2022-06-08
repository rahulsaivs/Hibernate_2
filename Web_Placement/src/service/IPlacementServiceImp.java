package service;

import entities.Placement;
import repository.IPlacementRepository;
import repository.IPlacementRepositoryImp;

public class IPlacementServiceImp implements IPlacementService{
private IPlacementRepository pao;
	


	public IPlacementServiceImp() {
		pao=new IPlacementRepositoryImp();
	}

	@Override
	public Placement addPlacement(Placement placement) {
		pao.beginTransaction();
		pao.addPlacement(placement);
		pao.commitTransaction();
		return placement;

	}

	@Override
	public Placement updatePlacement(Placement placement) {
		pao.beginTransaction();
		pao.updatePlacement(placement);
		pao.commitTransaction();
        return placement;
	}
	@Override
	public Placement searchPlacement(long id) {
		Placement placement =pao.searchPlacement(id);
		return placement;

	}

	@Override
	public boolean cancelPlacement(long id) {
		pao.beginTransaction();
		boolean res=pao.cancelPlacement(id);
		pao.commitTransaction();
		return res;

	}

}