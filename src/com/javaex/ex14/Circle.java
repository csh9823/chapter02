package com.javaex.ex14;

public class Circle extends Shape{
	
	//필드
	private int radius;
	//생성자
	public Circle(String lineColor, String fillColor, int radius) {
		super(lineColor, fillColor);
		this.radius = radius;
	}
	
	public Circle(String lineColor, String fillColor) {
		super(lineColor, fillColor);
	}
	
	//메소드gs
	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}
	
	
	
	//메소드
	
	
	
	



	



	public void draw() {
		System.out.println("선색 "+ super.lineColor + "면색 " + super.fillColor + " 반지름 "+ this.radius + " 원을 그렸습니다.");
	}

	
	
}
