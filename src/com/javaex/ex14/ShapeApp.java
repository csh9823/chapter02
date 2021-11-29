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
		//System.out.println(r01.toString()); // 자식쪽에 재 정의된 메소드 사용
		Rectangle r02 = new Rectangle("파랑", "파랑", 14, 9);
		Rectangle r03 = new Rectangle("노랑", "노랑", 20, 7);
		//사각형을 배열에 넣는다.
		rArray[0] = r01 ;
		rArray[1] = r02 ;
		rArray[2] = r03 ;
		//배열을 순회 하면서 출력한다.
		
		for (int i =0 ; i<rArray.length; i++) {
			rArray[i].draw();
		}
		
	}

}
