package com.day2.session1.inher;

class A{
	int i=9;
	public void foo() {
		System.out.println(i);
	}
}

class B{
	int i=99;
	public void foo() {
		System.out.println(i);
	}
}

class C extends A, B{
	//?
	
}



public class DemoMultipleInher {
	public static void main(String[] args) {
		
	}

}
