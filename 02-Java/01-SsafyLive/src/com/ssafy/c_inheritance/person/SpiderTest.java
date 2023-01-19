package com.ssafy.c_inheritance.person;

public class SpiderTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SpiderMan sman = new SpiderMan("최하영", false); //SpiderMan 객체생성
		sman.isSpider = false;
		sman.name = "최하영";
		sman.eat();
		sman.jump();
		sman.isSpider = true;
		sman.fireWeb();
		sman.eat("젓가락");
		sman.jump();
		
		System.out.println(sman.toString());
		String s1 = new String("hello");
		String s2 = new String("hello");
		System.out.println(s1==s2);
		System.out.println(s1.equals(s2));
	}

}
