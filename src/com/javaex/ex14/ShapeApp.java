package com.javaex.ex14;

public class ShapeApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		Shape s01 = new Shape("초록", "파랑");
		System.out.println(s01.toString()); 
		*/
		//사각형 배열을 만든다
		Rectangle[] rArray = new Rectangle[3];
		Rectangle r01 = new Rectangle("빨강", "파랑", 10, 5);
		
		Rectangle r02 = new Rectangle("파랑", "파랑", 14, 9);
		Rectangle r03 = new Rectangle("노랑", "노랑", 20, 7);
		//System.out.println(r01.toString()); // 자식쪽에 재 정의된 메소드 사용
		//사각형을 배열에 넣는다.
		rArray[0] = r01 ;
		rArray[1] = r02 ;
		rArray[2] = r03 ;
		//배열을 순회 하면서 출력한다.
		
		for (int i =0 ; i<rArray.length; i++) {
			rArray[i].draw();
		}
		
		Trinfle[] TArray = new Trinfle[3];
		
		Trinfle t01 = new Trinfle("빨강", "파랑", 8, 4);
		Trinfle t02 = new Trinfle("파랑", "파랑", 12, 9);
		Trinfle t03 = new Trinfle("노랑", "노랑", 27, 7);
		TArray[0] = t01;
		TArray[1] = t02;
		TArray[2] = t03;
		for (int i =0 ; i<TArray.length; i++) {
			TArray[i].draw();
		}
		
		Circle[] CArray = new Circle[3];
		
		Circle C01 = new Circle("빨강", "파랑", 4);
		Circle C02 = new Circle("파랑", "파랑", 2);
		Circle C03 = new Circle("노랑", "노랑", 7);
		CArray[0] = C01;
		CArray[1] = C02;
		CArray[2] = C03;
		for (int i =0 ; i<CArray.length; i++) {
			CArray[i].draw();
		}
	}

}
