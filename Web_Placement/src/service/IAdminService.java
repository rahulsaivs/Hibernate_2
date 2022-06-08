package service;

import entities.Admin;

public interface IAdminService {
	Admin addNewAdmin(Admin admin);
	Admin updateAdmin(Admin admin);
	Admin login(Admin admin);
	boolean logOut();
}