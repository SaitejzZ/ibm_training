package com.day2.session2.productstack;

public class DemoGc {
	
	public static void main(String[] args) {
		
		Product product=new Product(121, "laptop", 600, .2);
		product=null;// object become candidate of gc
		
		System.gc();
		
		Runtime.getRuntime().gc();
		
		
	}

}
