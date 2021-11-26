package com.javaex.ex11;

public class Person { //protected 상속받은 애들이 쓸 수 있게해줌
	protected  String name;
	private int age;
	
	//생성자
	public Person() {
		System.out.println("Person");
	}


	public Person(String name, int age) {

		this.name = name;
		this.age = age;
		System.out.println("Person2");
	}
	
	//gs메소드


	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}
	
/*
	public int getAge() {
		if(age<1) {
			return 1;
		}else {
			return age;	
		}
	}
*/

	public void setName(String name) {
		this.name = name;
	}


	public void setAge(int age) {
		this.age = age;
	}
	//메소드

	public void show() {
		System.out.println("============================");
		System.out.println("이름:" +this.getName());
		System.out.println("나이:" + this.getAge());
		System.out.println("============================");
		System.out.println("");
	}
	
	
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}
	
	
}
