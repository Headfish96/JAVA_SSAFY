/*
 * 생성자
 * 
 * - 생성자는 호출될 수 있는 시점이 딱 정해져있음
 * - 바로 객체가 생성되는 시점에만 호출된다.
 * 
 * 일반 메소드와 생성자 메소드와의 차이점
 * - 일반 메소드들은 객체가 생성된 이후에 호출된다.
 * - 일반 메소드는 정확히는 인스턴스 메소드를 의미한다.
 * - 생성자 메소드는 생성시 한번만 호출이 가능하다.
 * - 생성된 이후에는 생성자 메소드를 호출할 수 없다.
 * - 반환 타입이 있으면 일반 메소드라고 생각하게 된다.
 * 
 * 이러한 특징으로 연관되는 것들이 있다.
 * 클래스 이름과 동일해야 한다.
 * 
 * 	타입 a = new 타입();
 *  이때 호출되는 new를 생성한다고하고 타입()이 생성되는 생성자 메소드이다.
 *  
 *  - 생성자의 특징
 *  1. 이름이 클래스와 동일하다.
 *  2. 반환타입이 없음. void는 반환타입의 값이 없는 것이고, 이거는 반환 타입이 아예없는 것임
 *  3. 디폴트 생성자
 *  	형태: 클래스접근제한자 클래스명() - 매개변수가 없는 형태
		조건: 클래스에 정의된 생성자가 존재하지 않을때
	4. 생성자는 오버로딩을 지원한다.
	5. this 사용법
		this.변수, this.메서드(), this()-생성자를 불러온다.
		여기서 말하는 this는 자시자신, 즉 생성된 객체
	6. this의 사용상의 제약
	- this. 변수 또는 메서드의 호출은 static 영역에서는 사용이 불가능하다.
	this 는 인스턴스와 연관되는네 static은 클래스에 할당되니 this가 어떤 것을 가르키는지 알 수 없다.
	this() 생성자 호출은 생성자 안에서만 호출이 가능하다. 생성자 안에서도 첫번째 구문으로 호출이 되어야한다.
	이 개념이 상속과도 연관되니 익혀놓자.
	
		
 *  클래스 객체를 만들때 메모리에 필요한 정보를 올려주는 역할이 생성사
 *  따라서 모든 클래스는 생성자가 필요함
 *  
 */

package com.ssafy.day02;

public class Exam02 {
	int val = 100; //static이 없으니 인스턴스 변수임 이 변수의 메모리는 인스턴스마다 따로 할당된다.
	//이 메모리는 객체가 생성된 다음에 의미를 갖는다.
	static int val2 = 200; //클래스 변수라고 한다. 이건 클래스 마다 메모리 할당
	public static void main(String[] args) {
		Exam02 exam = new Exam02();
		System.out.println(exam.val);
		//System.out.println(exam.val2); //The static field Exam02.val2 should be accessed in a static way
		System.out.println(Exam02.val2);
		// TODO Auto-generated method stub
		Dog d1 = new Dog("쪼");
		Dog d2 = new Dog("매", 3);
		//d1.call();
	}

}