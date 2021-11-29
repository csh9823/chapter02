package com.javaex.ex14;

public class Shape {
	//필드 //protected자식만 가져다 쓸 수 있음.
	protected String lineColor;
	protected String fillColor;
	
	//생성자
	public Shape(String lineColor, String fillColor) {
		
		this.lineColor = lineColor;
		this.fillColor = fillColor;
	}


	public Shape() {

	}

	//gs메소드
	public String getLineColor() {
		return lineColor;
	}


	public String getFillColor() {
		return fillColor;
	}


	public void setLineColor(String lineColor) {
		this.lineColor = lineColor;
	}


	public void setFillColor(String fillColor) {
		this.fillColor = fillColor;
	}


	
	
	
	//메소드
	@Override
	public String toString() {
		return "Shape [lineColor=" + lineColor + ", fillColor=" + fillColor + "]";
	}
	
}
