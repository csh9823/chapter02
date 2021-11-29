package com.javaex.ex14;

public class Rectangle extends Shape{
	//부모꺼 씀
	//private String lineColor;
	//private String fillColor;
	
	//필드
	private int width;
	private int height;
	
	
	
	//생성자
	
	public Rectangle() {
		super(); //Shape 기본 생성자 Shape();
	}



	public Rectangle(String lineColor, String fillColor, int width, int height) {
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



	
	
	//부모쪽에도 같은 메소드가 있다.
	//부모 쪽의 메소드 사용 못하게 할려고 같은 이름으로 재정의.
	
	public String toString() {
		return "Rectangle [width=" + width + ", height=" + height + ", lineColor=" + lineColor + ", fillColor="
				+ fillColor + "]";
	}
	
	public void draw() {
		System.out.println("선색 "+ super.lineColor + "면색 " + super.fillColor + "가로 "+ this.width + "세로 " + this.width + " 사각형을 그렸습니다.");
	}
	
	
}
