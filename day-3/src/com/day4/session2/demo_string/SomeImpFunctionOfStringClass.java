package com.day4.session2.demo_string;

import java.util.StringTokenizer;

public class SomeImpFunctionOfStringClass {

	public static void main(String[] args) {
		//how to split string
		String data="i love java and java love me";
		
		//StringTokenizer vs split 
		StringTokenizer stringTokenizer=new StringTokenizer(data, " ");
		while(stringTokenizer.hasMoreTokens()) {
			System.out.println(stringTokenizer.nextToken());
		}
		
		String tokens[]=data.split(" ", 2);
		
		for(String token: tokens) {
			System.out.println(token);
		}
	}
}
