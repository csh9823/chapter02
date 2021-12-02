package com.javaex.ex18;

public class ShapeApp {

	public static void main(String[] args) {
		/*ㅁ
		Rectangle r01 = new Rectangle("빨강", "빨강" , 5 ,10);
		System.out.println(r01.area());
		
		Circle c01 = new Circle("파랑", "파랑", 10);
		System.out.println(c01.area());
		
		Trinfle t01 = new Trinfle("노랑", "노랑", 5,10);
		System.out.println(t01.area());
		*/
		//배열을 만든다
		Shape[] sArray = new Shape[3];
		
		Shape r01 = new Rectangle("빨강", "빨강" , 5 ,10);
		System.out.println(r01.area());
		
		Shape c01 = new Circle("파랑", "파랑", 10);
		System.out.println(c01.area());
		
		Shape t01 = new Trinfle("노랑", "노랑", 5,10);
		System.out.println(t01.area());
		
		//배열에 도형을 담는다
		sArray[0] = r01;
		sArray[1] = c01;
		sArray[2] = t01;
		//모든 도형의 면적 구하기
		for(int i=0; i<sArray.length; i++) {
			System.out.println(sArray[i].area());
		}
		
		// Shape s01 = new Shape("바보","멍청이"); // abstract써서 사용 불가능 
	}

}
