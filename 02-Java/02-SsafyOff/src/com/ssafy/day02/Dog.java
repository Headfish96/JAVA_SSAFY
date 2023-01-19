package com.ssafy.day02;

public class Dog { //Dog가 클래스 이름이기도 하지만 동시에 데이터 타입도 된다.
	String name;
	int age;
	Dog() {
		this("무명", -1);
		//this.name = "무명";
		//this.age = -1;
	}
	Dog(String name) {
		//System.out.println("다른 생성자 호출하기");
		//Constructor call must be the first statement in a constructor
		//해석:생성자를 호출할 때는 생성자 안에서 처음 불러야한다.
		this(name,-1);
		//this.name = name;
		//this.age = -1;//여기서 this는 현재 자기 자신의 객체를 의미한다.
		//자기자신 객체를 찾아가도록 해주는 것이 this
	}
	
	public void print() {
		//Constructor call must be the first statement in a constructor
		//해석:생성자를 호출할 때는 생성자 안에서 처음 불러야한다.
		//this("a", -1);
	}
	
	Dog(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	//static void alarm() {
		//System.out.println(this);
		//Cannot use this in a static context
		//static이 공유의 영역이라 어떤 것을 가리키는지 몰라서 쓸 수 없음.
	//}
	// 위 메소드가 끝나고 나서도 변수는 쓰고 싶으면 클래스 자체적으로 관리하게 위해서 멤버변수 자리로 올라온다.
	// 여기에 생성자를 정의하지 않으면 자바가 자동으로 생성해준다.
	// 생성자가 아닌 일반 메서드로 선언된다.(생성자는 반환타입 자체가 없어야 한다.)
	/*
	Dog() {
		System.out.println("Dog() 생성자 호출");
	}
	*/		
}
