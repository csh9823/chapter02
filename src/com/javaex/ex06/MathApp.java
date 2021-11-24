package com.javaex.ex06;

public class MathApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Math math = new Math();
		/*
		System.out.println(math.plusInt(3, 2));
		
		
		System.out.println(math.plusDouble(3.5, 76.4));
		*/
		//알아서 찾아서 맞춰줌
		System.out.println(math.plus(3, 2));
		System.out.println(math.plus(3.5, 76.4));
		System.out.println(math.plus(3, 76.4));
		System.out.println(math.plus(3.5, 76));
	}

}
