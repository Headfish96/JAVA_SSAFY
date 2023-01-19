package com.ssafy.day03;

interface A {
	final String SERVER_IP = "192.168.0.1";
	void print();
}

/*final*/ class Parent {
	public final void call() {

	}
}

class Child extends Parent implements A {
	
	final int val;
	
	Child(int val) {
		this.val = val;
	}

	@Override
	public void print() {
		// TODO Auto-generated method stub
		
	}
	//public void call() {
		//System.out.println("재정의된 메서드");
	//}
	

}


//가능했던 키워드:
// - 접근 제한자: public, default package
// - 활용관련: final, abstract
public class Exam03_Final연습 {
	
	public static void main(String[] args) {
		Child c = new Child(100);
		c.call();
		System.out.println();
	}
	
	
	//final 키워드
	/*
	 * final은 마지막을 의마한다. 변수에 붙이면 변수의 값 할당이 마지막이라는 것을 뜻한다.
	 * 사용하려면 선언시 사용해야한다.
	 * 
	 * final을 붙일 경우 기능은 다음과 같다.(앞에 final)
	 * 변수: 값의 할당을  한번만 할 수 있다.(선언시, 선언시에 값이 없는 경우 생성자를 통해서 가능)
	 * 메서드: 오버라이딩 금지, 더이상 메서드의 내용을 변경하는 것을 금지한다.
	 * 클래스: 상속을 금지
	 * 
	 */
	
	
	
	// 접근 제한자 4가지 모두 가능!
	//내부 클래스는 안에 있는 멤버처럼 유사하게 사용한다.
	class Inner {} 
	
	
	/*
	 * 메소드는 접근제한자가 4가지 모두 가능하다
	 * - public, protected, default package, private
	 * - protected는 상속에 관여, 나와 상속 관계가 있다면 다른 패키지에서 나를 쓸 수 있지만,
	 *   상속 관계가 없으면 사용할 수 없음
	 * 활용 제한자: final, abstract, static, synchronized
	 */
	
	public void call() {
		System.out.println();
	}
	
	
}
