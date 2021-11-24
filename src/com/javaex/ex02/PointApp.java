package com.javaex.ex02;

public class PointApp {

	public static void main(String[] args) {
		// 
		Point point1 = new Point(3, 6);
	
		//point1.setX(5);
		//point1.setY(5);
		point1.show();
		
		
		Point point2 = new Point();
		point2.setX(10);
		point2.setY(23);
		
		point2.show();
		
		
		Point point3 = new Point(100);
		point3.setY(101);
		point3.show();
		
		
		Point point4 = new Point(100,65);
		point4.show(true);
		point4.show(false);
		point4.show();
	}

}
