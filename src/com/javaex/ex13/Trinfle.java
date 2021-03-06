package com.javaex.ex13;

public class Trinfle {
	//필드
	private String lineColor;
	private String fillColor;
	private int width;
	private int height;
	
	
	//생성자
	public Trinfle(String lineColor, String fillColor, int width, int height) {
		
		this.lineColor = lineColor;
		this.fillColor = fillColor;
		this.width = width;
		this.height = height;
	}


	public Trinfle() {
		
	}

	//gs메소드
	public String getLineColor() {
		return lineColor;
	}


	public String getFillColor() {
		return fillColor;
	}


	public int getWidth() {
		return width;
	}


	public int getHeight() {
		return height;
	}


	public void setLineColor(String lineColor) {
		this.lineColor = lineColor;
	}


	public void setFillColor(String fillColor) {
		this.fillColor = fillColor;
	}


	public void setWidth(int width) {
		this.width = width;
	}


	public void setHeight(int height) {
		this.height = height;
	}
	//메소드
	public void draw() {
		System.out.println("선택"+ lineColor + "면색" +fillColor+"가로"+width+"세로"+height+" 삼각형을 그렸습니다.");
	}

	@Override
	public String toString() {
		return "Trinfle [lineColor=" + lineColor + ", fillColor=" + fillColor + ", width=" + width + ", height="
				+ height + "]";
	}
	
	
}
