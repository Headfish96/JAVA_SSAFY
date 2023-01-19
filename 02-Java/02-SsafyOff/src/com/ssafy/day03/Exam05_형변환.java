package com.ssafy.day03;

class P {}
class C extends P{}

public class Exam05_형변환 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		P p = new P();
		C c = new C();
		
		//부모는 자식타입을 받을 수 있다.
		P p1 = new C();
		
		//
		//객체변수 instanceof 타입 -> true of false
		//p instanceof P -> ture
		//p instanceof Object -> ture
		//p instanceof C -> false
		//c instanceof P -> true
		//c instanceof Object -> true
		
		System.out.println(p instanceof P);
		System.out.println(p instanceof Object);
		System.out.println(p instanceof C);
		System.out.println(c instanceof P);
		System.out.println(c instanceof Object);
		
	}

}
