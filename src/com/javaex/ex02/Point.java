package com.javaex.ex02;

public class Point {
	//필드
	private int X=0;
	private int Y=0;

	//생성자
/*	
public Point() {
	//해당 클래스를 메모리에 올리는 일
	//System.out.println("Point()실행");
}
*/
	public Point() {
		System.out.println("Point()");
	}
	
	public Point(int X) {
		this.X= X;
		System.out.println("Point(1)");
	}
	
	
	public Point(int X, int Y) {
		//해당 클레스를 메모리에 올리는 일
		this.X = X;
		this.Y = Y;
		System.out.println("Point(2)");
	}
	
	/* 한자리 수 값이 똑 같아서 오류가남
	public Point(int Y) {
		this.Y= Y;
		System.out.println("Point(1)");
	}
	*/
	//set.get 메소드
public void setX(int X) {
		
		this.X = X;
		
	}

public int getX() {
	return X;
}

public void setY(int Y) {
		this.Y = Y;
}

public int getY() {
	return Y;
}
//일반 메소드
public void show() {
	System.out.println("점[x="+this.getX()+", y="+Y+"]을 그렸습니다.");
}

//action=true 그리기 가능 , action=false 지우기 가능 같은 이름으로 여러게 쓸 수 있게해줌
public void show(boolean action) {
	if(action == true) {
		System.out.println("점[x="+X+", y="+Y+"]을 그렸습니다.");
	}else if(action == false){
		System.out.println("점[x="+X+", y="+Y+"]을 지웠습니다.");
	}else {
		System.out.println("잘못된입력");
	}
}


}
