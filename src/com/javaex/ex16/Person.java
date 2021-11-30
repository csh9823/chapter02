package com.javaex.ex16;

public class Person {
	//필드
	protected String name;
	protected int age;
	
	
	//생성자
	
	public Person(String name, int age) {
		
		this.name = name;
		this.age = age;
	}


	public Person() {
		
	}
	
	//gs메소드
	public String getName() {
		return name;
	}


	public int getAge() {
		return age;
	}


	public void setName(String name) {
		this.name = name;
	}


	public void setAge(int age) {
		this.age = age;
	}

	//메소드 일반
	public void showInfo() {
		System.out.println("************************************************");
		System.out.println("이름: " + name + " 나이: "+ age);		
		System.out.println("************************************************");
	}
	
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}
	
	
	
	
}
