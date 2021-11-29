package com.javaex.ex13;

public class Circle {
	//필드
	private String lineColor;
	private String fillColor;
	private int radius;
	//생성자
	public Circle(String lineColor, String fillColor, int radius) {
	
		this.lineColor = lineColor;
		this.fillColor = fillColor;
		this.radius = radius;
	}
	
	public Circle() {
	
	}
	//메소드gs

	public String getLineColor() {
		return lineColor;
	}

	public String getFillColor() {
		return fillColor;
	}

	public int getRadius() {
		return radius;
	}

	public void setLineColor(String lineColor) {
		this.lineColor = lineColor;
	}

	public void setFillColor(String fillColor) {
		this.fillColor = fillColor;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}

	
	
	
	
	
	//메소드
	public void draw() {
		System.out.println("선택"+ lineColor + "면색" +fillColor+"반지름"+radius+" 원을 그렸습니다.");
	}
	
	
	@Override
	public String toString() {
		return "Circle [lineColor=" + lineColor + ", fillColor=" + fillColor + ", radius=" + radius + "]";
	}
}
