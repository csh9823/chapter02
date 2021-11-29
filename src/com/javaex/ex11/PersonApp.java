package com.javaex.ex11;

public class PersonApp {

	
	public static void main(String[]args) {
		/*
		Person p01 = new Person("정우성",45);
		
		Person p02 = new Person();
		
		p02.setName("이정재");
		p02.setAge(-46);
		
		System.out.println(p01.toString());
		System.out.println(p02.toString());
		
		p02.show();
		*/
		System.out.println("-----------------");
		Person p01 = new Person("정우성",45);
		p01.show();
		System.out.println("-----------------");
		
		//상속 받은 Student
		Student	s01	=new Student();
		s01.setName("강호동");
		s01.setAge(55);
		s01.setSchoolName("서울고등학교");
		
		System.out.println("-----------------");
		System.out.println(s01.getAge());
		System.out.println(s01.getName());
		System.out.println(s01.getSchoolName());
		System.out.println("-----------------");
		
		Student s02 = new Student("서장훈",50,"강남고등학교");
		//s02.name="황일영";
		
		
		System.out.println(s02.toString());
		s02.show(); // 같은 이름이면 자식꺼만 출력 부모꺼는 출력안됨
		
		
		
	}
}
