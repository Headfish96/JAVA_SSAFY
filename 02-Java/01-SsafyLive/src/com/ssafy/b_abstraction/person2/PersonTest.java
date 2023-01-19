package com.ssafy.b_abstraction.person2;

public class PersonTest {

	public static void main(String[] args) {
		System.out.println(Person.org);
		
		
		// 객체 사용
		Person p = new Person();
		p.org = "SSAFY2";
		p.name = "홍길돌";
		p.isHungry = true;
		p.eat();
		
		System.out.println(p.name+" : "+p.isHungry+" : "+p.age);
		System.out.printf("%S, %b, %d%n", p.name, p.isHungry, p.age);
		p.printInfo();
		
		Person p2 = new Person();
		p2.name="장길산";
		p2.work();
		System.out.println(p2.org);
		//System.out.println(p2.name+" : "p2.isHungry+" : "+p2.age);
		//System.out.println(p2.name+" : "p2.isHungry+" : "+p2.age);
		p2.printInfo();
		p.printInfo();
		

	}

}
