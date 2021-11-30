package com.javaex.ex16;

public class PersonApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person p01 = new Person("정우성", 45);
		
		 p01.showInfo();
		 
		 Student s01 = new Student("이정재", 46,"서울고등학교");
		 
		 s01.showInfo();
		
		//자식을 숨긴다 get으로 쓸수 없지만 출력은 제대로 작동됨 오버라이드
		Person ps01 = new Student("강호동", 50 , "마산고등학교");
		
		ps01.showInfo();
		System.out.println(ps01.toString());
	}

}
