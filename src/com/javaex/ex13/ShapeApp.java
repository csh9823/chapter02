package com.javaex.ex13;

public class ShapeApp {

	public static void main(String[] args) {
		
		//메모리가 움직이는 스토리
		
		//사각형 3개를 만든다 메모리
		Rectangle r01 = new Rectangle("빨강","노랑", 5, 5);
		
		
		
		Rectangle r02 = new Rectangle("파랑","노랑", 10, 20);
		
		
		Rectangle r03 = new Rectangle("빨강","빨강", 55, 77);
		
		
		
		//배열
		Rectangle[] rArray = new Rectangle[3];
		
		//사각형을 배열에 채워 넣는다 (주소)
		rArray[0] = r01;
		rArray[1] = r02;
		rArray[2] = r03;
		for(int i=0; i<rArray.length; i++) {
			rArray[i].draw();
		}
		
		/*모든 사각형의 선색만 출력
		for(int i=0; i<rArray.length; i++) {
			System.out.println(rArray[i].getLineColor());
		}
		*/
		/////////////////////////////////////////////////
		
		//원 관리 배열
		Circle[] cArray = new Circle[3];
		
		
		//원3개만듬
		Circle c01 = new Circle("보라","빨강", 15);
		Circle c02 = new Circle("검정","노랑", 5);
		Circle c03 = new Circle("파랑","초록", 7);
		
		//원을 배열에 넣기
		cArray[0] = c01;
		cArray[1] = c02;
		cArray[2] = c03;
		//모든 원형 그리기
		for(int i=0; i<cArray.length; i++) {
			cArray[i].draw();
		}
		
		//삼각형 그리기
		Trinfle t01 = new Trinfle("자색","파랑", 5, 5);
		Trinfle t02 = new Trinfle("구색","노랑", 10, 20);
		Trinfle t03 = new Trinfle("상색","빨강", 55, 77);
		//삼각형 배열 관리
		Trinfle[] tArray = new Trinfle[3];
		tArray[0] = t01;
		tArray[1] = t02;
		tArray[2] = t03;
		//모든 삼각형 그리기
		for(int i=0; i<tArray.length; i++) {
			tArray[i].draw();
		}
	}

}
