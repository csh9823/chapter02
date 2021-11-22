package com.chapter02.ex01;

public class Goods {
	//필드
	private String name; //앞에 private 넣으면 메인 시나리오 에서 사용불가
	private int price;
	
	//메소드
	public void setName(String n) {
		
		name = n;
		
	}
	
	public String getName() {
		return name;
	}
	
	public void setPrice(int b) {
		price = b;
	}
	
	public int getPrice() {
		return price;
	}
	
	public void show() {
		System.out.println("---------------");
		System.out.println("상품명: "+name);
		System.out.println("가격: "+price);
	}
}
