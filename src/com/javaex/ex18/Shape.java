package com.javaex.ex18;

//퍼블릭에 abstract를 넣어줘야 작동가능 부모만 사용하는 코드 사용 불가능
public abstract class Shape {
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
	
	public void draw() {
		System.out.println("선색 "+ lineColor + "면색 " + fillColor + " 그렸습니다.");
	}
	//자식에게 오버라이드 area()를 주기위해서 부모에게 억지로 가상의 값(껍데기)을 줌 부모만 써서 코드를 만들지 못 하게함 명령어 abstract 
	public abstract double area();
	
	@Override
	public String toString() {
		return "Shape [lineColor=" + lineColor + ", fillColor=" + fillColor + "]";
	}
	
}
