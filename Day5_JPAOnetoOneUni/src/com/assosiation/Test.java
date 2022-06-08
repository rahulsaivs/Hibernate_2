package com.assosiation;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Test {

	public static void main(String[] args) {
		EntityManagerFactory factory=Persistence.createEntityManagerFactory("JPA-PU");
		EntityManager em=factory.createEntityManager();
		em.getTransaction().begin();
		
		Employee e=new Employee();
		e.setEmployeeName("Soujan");
		
		Address a=new Address();
		a.setAddressId(10);
		
a.setStreet("Vijaynagar");
		a.setCity("Bangalore");
		a.setState("Karnataka");
		
		e.setAddress(a);
		em.persist(e);
		System.out.println("Row Inserted");
		
		em.getTransaction().commit();
		em.close();
		factory.close();
		
		

	}

}