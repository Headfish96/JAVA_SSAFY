package com.ssafy.c_inheritance.person;

public class SpiderMan extends Person {
	boolean isSpider;
	//has a 관계
	Spider spider;
	
	public SpiderMan(String name, boolean inSpider) {
		
		//this.name = name; //이렇게 쓰면 Person.java의 this.name = name과 코드 중복이다.
		super(name); //Super를 사용해 중복 최소화
		this.isSpider = isSpider;
		//super(); 조상의 생성자를 부른다. 생략되어 있음.
		this.spider = new Spider();
		//public Person() {} 이 생성자가 Person.java에 정의되어 있지 않다면,
		// SpiderMan() 생성자가 가리키는게 없어지기에 오류 발생
	}


	void fireWeb() {
		//System.out.println("어떻게");
		if(this.isSpider) {
			this.spider.fireWeb();
		}else {
			//System.out.println("사람일때는 못해");
			super.jump();
		}
	}
	@Override
	void jump() {
		if(this.isSpider) {
			this.spider.jump();
		}else {
			//System.out.println("폴짝");
			super.jump();
		}
	}


	@Override
	public String toString() {
		return "SpiderMan [isSpider=" + isSpider + ", spider=" + spider + ", toString()=" + super.toString() + "]";
	}


	
}
