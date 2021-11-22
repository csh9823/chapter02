package com.javaex.ex02;

public class Point {
	//필드
	private int X;
	private int Y;

public void setX(int a) {
		
		X = a;
		
	}

public int getX() {
	return X;
}

public void setY(int b) {
		Y = b;
}

public int getY() {
	return Y;
}

public void show() {
	System.out.println("점[x="+X+", y="+Y+"]을 그렸습니다.");
}
}
