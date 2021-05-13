package com.day2.session1.uml;

public class TestBook {
	
	public static void main(String[] args) {
		Author author=new Author("raj", "raj@ibm.com", 'm');
		Book book=new Book("let us java", author, 400, 40);
		System.out.println(book);
	}

}
