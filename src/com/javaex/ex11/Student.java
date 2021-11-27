package com.javaex.ex11;

public class Student extends Person{ //extends Person 부모를 가져온다
	//필드
	private String schoolName;
	//생성자

	public Student() {
		System.out.println("Student");
	}
	
	
	public Student(String schoolName) {
		this.schoolName = schoolName;
		System.out.println("Student1");
	}


	public Student( String name ,int age ,String schoolName) {
		/*사용 불가
		super.name= name;
		super.age = age;
		*/ // super=부모
		//super(); Person디폴트 생성자 사용
		//super(name, age); //Person의 2줄 생성자 사용
		/*
		super.setName(name); // Person의 디폴트 생성자 사용
		super.setAge(age);
		*/
		super();
		super.name = name;
		//super.age = age;
		this.schoolName = schoolName;
		System.out.println("Student3");
	}

	
	
	
	//메소드gs
	public String getSchoolName() {
		return schoolName;
	}

	public void setSchoolName(String schoolName) {
		this.schoolName = schoolName;
	}

	
	
	
	//메소드
	public void show(){
		
		//super.show();
		System.out.println("*************************************");
		System.out.println("이름:" +super.name);
		System.out.println("나이:" +super.age);
		System.out.println("학교:" +this.schoolName);
		
		
		System.out.println("*************************************");
		System.out.println("");
	}


	@Override
	public String toString() {
		return "Student [schoolName=" + schoolName + ", name=" + name + ", age=" + age + "]";
	}
	
	
	
	
	
}
