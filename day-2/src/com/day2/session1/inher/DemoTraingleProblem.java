package com.day2.session1.inher;

class Point{
	private int x, y;
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	public int getX() {
		return x;
	}
	public int getY() {
		return y;
	}
	public void printPointDetails() {
		System.out.println("{x,y}:"+ x+","+ y);
	}
}

class Triangle{
	private Point p1, p2, p3;

	public Triangle(Point p1, Point p2, Point p3) {
		this.p1 = p1;
		this.p2 = p2;
		this.p3 = p3;
	}
	
	private double getDistance(Point a, Point b) {
		return Math.sqrt(Math.pow((b.getX()-a.getX()), 2)+Math.pow((b.getY()-a.getY()), 2));
	}
	
	
	public double getPerimeter() {
		//p1-> p2, 					 p2->p3 ,				 p3->p1
		return getDistance(p1, p2)+ getDistance(p2, p3)+ getDistance(p3, p1);
	}
	
	public double getArea() {
		return 0;
		
	}
}
public class DemoTraingleProblem {
	
	public static void main(String[] args) {
		
		Point p1=new Point(2, 5);
		Point p2=new Point(4, 9);
		Point p3=new Point(3, 7);
		
		Triangle triangle=new Triangle(p1, p2, p3);
		
		System.out.println(triangle.getPerimeter());
	}

}
