package com.chapter02.ex01;

public class GoodsApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Goods camera = new Goods();
		camera.setName("니콘");
		String cameraName = camera.getName();
				
		camera.setPrice(200000);
		int cameraPrice = camera.getPrice();
		System.out.println(cameraName);
		System.out.println(cameraPrice);
		
		
		Goods computer = new Goods();
		computer.setName("LG컴");
		computer.setPrice(900000);
		
		
		Goods cup = new Goods();
		cup.setName("머그컵");
		cup.setPrice(2000);
		
		camera.show();
		computer.show();
		cup.show();
		
		
		
		//computer
		
		
		
		
		
		
		
		
		
		
		
		/*
		camera.name = "니콘";
		camera.price = 400000;
		
		System.out.println(camera.name);
		System.out.println(camera.price);
		
		Goods computer = new Goods();
		computer.name = "LG그램";
		computer.price = 900000;
		
		System.out.println(computer.name);
		System.out.println(computer.price);
		
		Goods cup = new Goods();
		
		cup.name = "머그컵";
		cup.price = 2000;
		
		System.out.println(cup.name);
		System.out.println(cup.price);
		*/
	}

}
