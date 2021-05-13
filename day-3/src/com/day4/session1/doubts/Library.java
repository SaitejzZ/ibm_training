package com.day4.session1.doubts;
import java.util.*;
public class Library {
	private String libName;
	private String libLocation;
	private LinkedList<Book> books=new LinkedList<>();
	
	public Library(String libName, String libLocation) {
		this.libName = libName;
		this.libLocation = libLocation;
	}

	public void addBook(Book book) {
		books.add(book);
	}
	
	public void printLibDetails() {
		System.out.println("-------------------------");
		System.out.println("libName: "+ libName);
		System.out.println("libLocation: "+ libLocation);
		
		System.out.println("-------books in lib----------");
		for(Book book: books) {
			System.out.println(book);
		}
		System.out.println("-------books in lib----------");
	}

}
