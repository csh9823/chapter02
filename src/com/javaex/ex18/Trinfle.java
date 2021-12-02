package com.javaex.ex18;

public class Trinfle extends Shape{
	
	//필드
	private int width;
	private int height;
	//생성자
	public Trinfle(String lineColor, String fillColor) {
		super(lineColor, fillColor);
	}
	
	public Trinfle(String lineColor, String fillColor, int width, int height) {
		super(lineColor, fillColor);
		this.width = width;
		this.height = height;
	}
	
	
	//gs메소드
	
	public int getWidth() {
		return width;
	}

	public int getHeight() {
		return height;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public void setHeight(int height) {
		this.height = height;
	}
	
	
	
	//메소드
	
	public void draw() {
		System.out.println("선색 "+ super.lineColor + "면색 " + super.fillColor + " 가로 "+ this.width + "세로 " + this.height + " 삼각형을 그렸습니다.");
	}

	public double area() {
		double result = (width*height)/2;
		return result;
	}
	
	
	
	
}
