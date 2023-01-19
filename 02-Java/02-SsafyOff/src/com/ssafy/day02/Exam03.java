/*
 * static 블럭
 * - 클래스 정보가 로딩될 때 실행
 * - 형태: static {}
 * 
 * 
 */

package com.ssafy.day02;


class StaticSub {
	static int v = 100;
	StaticSub() {
		System.out.println("1. StaticSub 생성자 호출");
	}
	static {
		System.out.println("2. 클래스 정보가 로딩될때 실행");
	}//이 static블럭은 이 클래스가 실행될때 딱 한번만 실행된다.
}

public class Exam03 {

	public static void main(String[] args) {
		System.out.println("3. main start----------");
		StaticSub ss = new StaticSub();
		StaticSub ss2 = new StaticSub();
		System.out.println("4. ss 객체 생성 후 메인 메서드");
		
	}

}
// 3 2 1 1 4 c출력