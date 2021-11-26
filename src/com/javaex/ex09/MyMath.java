package com.javaex.ex09;

public class MyMath {

	//필드  --필요x
	static private double pi = 3.14;
	//생성자 -- 디폴트 생성자
	
	//메소드g/s --필드x
	
	//메소드 일반
	//static 메모리에 올리는게 아닌 스테틱에 올림 모든곳애서 사용가능 new사용해서 불러올 필요 없음
	public static int plus(int a, int b) {
		/*
		int sum = a+b;
		return sum;
		*/
		return a+b;
	}
	
	public static double plus(double a, double b) {
		return a+b;
	}
	
	public static double plus(double a, int b) {
		return a+b;
	}
	
	public static double plus(int a, double b){
		return a+b;
	}
	
	public static double circleArea(int radius) {
		double area = radius*radius*pi;
		return area;
	}
	
	public static double circle (int radius) {
		return (radius+radius)*pi;
	}
}
