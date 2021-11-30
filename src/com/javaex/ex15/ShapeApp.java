package com.javaex.ex15;

public class ShapeApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Shape r01 = new Rectangle("빨강", "빨강", 5, 5);
		r01.draw();
		Shape c01 = new Circle("노랑", "노랑", 100);
		c01.draw();
		Shape t01 = new Trinfle("빨강","빨강",5,5);
		t01.draw();
		
		
		
		
	
		 
		Shape[] Sarry = new Shape[3];
		Sarry[0] = r01;
		Sarry[1] = c01;
		Sarry[2] = t01;
		
		for(int i = 0; i<Sarry.length; i++){
			Sarry[i].draw();
		}
		//다운캐스팅 get꺼내오는법 강제 형변환 사용 Circle로 만들기
		 System.out.println(((Circle)c01).getRadius());
		
	}

}
