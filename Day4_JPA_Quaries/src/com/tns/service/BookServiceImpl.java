package com.tns.service;

import java.util.List;

import com.tns.duo.BookDao;
import com.tns.duo.BookDaoImp;
import com.tns.entities.Book;

public class BookServiceImpl implements BookService {
	private BookDao dao;
	
	public BookServiceImpl() {
		dao=new BookDaoImp();
		// TODO Auto-generated constructor stub
	}

	@Override
	public Book getBookId(int id) {
		// TODO Auto-generated method stub
		return dao.getBookId(id);
	}

	@Override
	public List<Book> getBookByTitle(String title) {
		// TODO Auto-generated method stub
		return dao.getBookByTitle(title);
	}

	@Override
	public List<Book> getAuthorBooks(String author) {
		// TODO Auto-generated method stub
		return dao.getAuthorBooks(author);
	}

	@Override
	public List<Book> getBookPriceRange(double low, double high) {
		// TODO Auto-generated method stub
		return dao.getBookPriceRange(low, high);
	}

	@Override
	public List<Book> getAllBooks() {
		// TODO Auto-generated method stub
		return dao.getAllBooks();
	}

	@Override
	public Long getBookCount() {
		// TODO Auto-generated method stub
		return dao.getBookCount();
	}
	

}