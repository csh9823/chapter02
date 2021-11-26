package com.javaes.ex10;

public class GoodsApp {
	public static void main(String[] args) {
		
		Goods[] goods= new Goods[3];
		
		Goods camera = new Goods("니콘", 400000);
		
		goods[0] = camera;
		
		Goods cup = new Goods("머그컵", 2000);
		
		goods[1] = cup;
		
		Goods computer = new Goods("Lg그램", 900000);
		
		goods[2] = computer;
		
		int count=0;
		for (int i=0; i<goods.length; i++) {
			if(goods[i]!= null) {// 방을 전에 안 쓸때 사용 주소가 없지 않다 --> 주소가 있다.
			System.out.println(goods[i].toString());
			count++;
			}
		}
		System.out.println(count);
		
		
		//이름만 출력하기
		
		for(int i=0; i<goods.length; i++) {
			
			goods[i].show(); 
		}
	}

}
