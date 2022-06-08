package service;

import java.util.Scanner;

import entities.Admin;
import repository.IAdminRepositoryImp;

public class IAdminServiceImp implements IAdminService{
	private IAdminRepositoryImp uao;
	
	Scanner s=new Scanner(System.in);
		

		public IAdminServiceImp() {
			uao=new IAdminRepositoryImp();
		}


	@Override
	public Admin addNewAdmin(Admin admin) {
		uao.beginTransaction();
		uao.addNewAdmin(admin);
		uao.commitTransaction();
		return admin;

	}

	@Override
	public Admin updateAdmin(Admin admin) {
		uao.beginTransaction();
		uao.updateAdmin(admin);
		uao.commitTransaction();
		return admin;

	}

	@Override
	public Admin login(Admin admin) {
		System.out.println("Enetr the admin name:");
		String uname=s.nextLine();
		System.out.println("Enter the Password :");
		String upsw=s.nextLine();
		if(uname==admin.getName() && upsw==admin.getPassword()) {
			return admin;
			
		}
		else {
			System.out.println("Invalid admin name or password :");
			return null;
		}

	}

	@Override
	public boolean logOut() {
		System.exit(0);
		return true;

	}

}