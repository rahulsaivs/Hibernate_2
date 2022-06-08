package com.tns.duo;

import java.util.List;

import com.tns.entities.Book;

public interface BookDao {
	public abstract Book getBookId(int id);
	public abstract List<Book>getBookByTitle(String title);
	public abstract List<Book>getAuthorBooks(String author);
	public abstract List<Book>getBookPriceRange(double low,double high);
	public abstract List<Book>getAllBooks();
	public abstract Long getBookCount();
}