package com.day4.session1.empmgt;

public class CommisionEmployee extends Employee{
	
	public CommisionEmployee(int id, String name, double salary) {
		super(id, name, salary);
	}

	@Override
	public double getPayment() {
		// TODO Auto-generated method stub
		return 0;
	}
}
