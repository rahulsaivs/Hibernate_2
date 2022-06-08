package com.tns.client;

import com.tns.service.BookService;
import com.tns.service.BookServiceImpl;

public class Client {

	public static void main(String[] args) {
		BookService obj=new BookServiceImpl();
		System.out.println("Total No.Of Books");
		System.out.println("Total Books: "+obj.getBookCount());
		
		System.out.println("Listing Book with Id:102");
		System.out.println("Total Books: "+obj.getBookId(102));
		
		System.out.println("Listing all Books:");
		System.out.println("Total Books: "+obj.getAllBooks());
		
		
		System.out.println("Book written by RK:");
		System.out.println("Total Books: "+obj.getAuthorBooks("RK"));
		
		
		System.out.println("Book by title:");
		System.out.println("Total Books: "+obj.getBookByTitle("Python"));
		
		System.out.println("Listing book between 200 to 500:");
		System.out.println("Total Books: "+obj.getBookPriceRange(200, 500));
		
		

	}

}