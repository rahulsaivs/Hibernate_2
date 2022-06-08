package repository;

import entities.Admin;

public interface IAdminRepository {
	Admin addNewAdmin(Admin admin);
	Admin updateAdmin(Admin admin);
	Admin deleteAdmin(long id);
	void beginTransaction() ;
	void commitTransaction();


}