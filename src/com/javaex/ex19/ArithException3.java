package com.javaex.ex19;

public class ArithException3 {

	public static void main(String[] args) {

		int[] inArray = new int[] { 3, 6, 9 };

		try {
			System.out.println(inArray[3]);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(e.toString());
		} catch (ArithmeticException e) {
			System.out.println(e.toString());
		} finally {
			System.out.println("finally");
		}

	}

}
