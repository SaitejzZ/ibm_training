package com.day4.session2.demo_string;

public class DemoString {

	public static void main(String[] args) {
		
		String data="a"+"b"+"c"+"d";
		
		String data2=new StringBuilder().append("a").append("b").append("c").append("d").toString();
		System.out.println(data2);
		//then what i do?
		//String vs StringBuilder  vs StringBuffer
		//String: immutable and thread safe 
		
		//StringBuilder				  vs				 StringBuffer
		// is not syn									all mthod are syn, performance is poor
		//good in performance
		//builder design pattern
		
		
		/*
		 * String hello="i love java"; hello= hello.toUpperCase();
		 * System.out.println(hello);
		 */
		
//		String b="in";
//		String a=new String("in").intern();
//		if(a==b) {
//			System.out.println("are same");
//		}else
//			System.out.println("not same");
	}
}
