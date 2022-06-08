package service;

import java.util.Scanner;

import entities.User;
import repository.IUserRepositoryImp;

public class IUserServiceImp implements IUserService {
	
	private IUserRepositoryImp uao;
	Scanner s=new Scanner(System.in);
	

	public IUserServiceImp() {
		uao=new IUserRepositoryImp();
	}


	@Override
	public User addNewUser(User user) {
		uao.beginTransaction();
		uao.addNewUser(user);
		uao.commitTransaction();
		return user;
	}

	@Override
	public User updateUser(User user) {
		uao.beginTransaction();
		uao.updateUser(user);
		uao.commitTransaction();
		return user;

	}

	@Override
	public User login(User user) {
		System.out.println("Enetr the user name:");
		String uname=s.nextLine();
		System.out.println("Enter the Password :");
		String upsw=s.nextLine();
		if(uname==user.getName() && upsw==user.getPassword()) {
			return user;
			
		}
		else {
			System.out.println("Invalid user name or password :");
			return null;
		}
	}

	@Override
	public boolean logOut() {
		System.exit(0);
		return true;

	}

}