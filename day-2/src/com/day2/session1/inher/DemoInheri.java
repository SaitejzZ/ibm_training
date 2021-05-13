package com.day2.session1.inher;

class A{
	private int i;
	public A(int i) {
		this.i=i;
	}
	public void printA() {
		System.out.println(i);
	}
}

class B extends A{
	private int j;
	public B(int i, int j) {
		super(i);
		this.j=j;
	}
	public void printB() {
		printA();
		System.out.println(j);
	}
}

class C extends B{
	private int k;
	public C(int i, int j, int k) {
		super(i,j);
		this.k=k;
	}
	
	public void printC() {
		printB();
		System.out.println(k);
	}
}
public class DemoInheri {
	
	public static void main(String[] args) {
		C c=new C(2,5,6);
		c.printC();
	}

}
