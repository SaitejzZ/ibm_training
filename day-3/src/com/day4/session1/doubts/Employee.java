package com.day4.session1.doubts;
import java.util.*;
public class Employee {
	private int id;
	private String name;
	private double salary;
	
	private HashSet<String> phones=new HashSet<>();

	public Employee(int id, String name, double salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	public void addPhone(String phoneNo) {
		phones.add(phoneNo);	
	}
	
	public void printDetails() {
		System.out.println("id: "+ id);
		System.out.println("name: "+ name);
		System.out.println("salary: "+ salary);
		System.out.println("phones: "+ phones);
	}
}
