/*
 * 오버로딩 vs 오버라이딩(재정의 - 상속관계)
 * 
 * 
 * 객체지향의 특징: 다형성
 * 
 * 다형성의 정의
 * 이름은 동일하지만 하는 일이 다르다.
 * 하나의 이름으로 여러가지 다양한 일을 하기 때문에 다형성이다.
 * 부를 때는 같은 이름이지만 실재로는 다른 일을 하는 것이다.
 * 
 * 메소드의 이름이 같은 것을 오버로딩, 오버라이딩이라고 한다.
 * 오버로딩, 오버라이딩 둘 다 변수가 아닌 메소드의 이름이 같다.
 * 둘의 차이는
 * 오버라이딩을 재정의 한다고 하는데 상속 관계에서 쓰인다.
 * 
 * 먹는다라는 하나의 행위를 하기 위한 도구가 젓가락, 포ㅡ, 숫가락 같이 같은 기능을 하는데 형태만 다른 경우에
 * 먹는다라는 eat이라는 메소드를 만들고 그 방식, 형태를 메소드에 붙여 오버로딩하는 것이다.
 * 오버로딩을 지원하지 않는 언어도 있다. 이름이 같은 메소드를 여러개 못만드는 언어가 있다. 예를 들어 자바스크립트
 * 자바와 같은 경우는 메소드의 이름은 같고 매개변수만 다른 오버로딩을 지원한다.
 * 이 점이 유지보수에 좋다.
 * 
 * println이 대표적인 오버로딩 메소드다.
 * 모든 입력되는 값들에 대한 처리를 할 수 있도록 메소드가 처리되어 있다.
 * 우리가 만드는 클래스는 println에 넣을 수 없다.
 * 
 * 필수 조건
 * 	- 메서드 이름이 같다. 
 * 	- 매개변수의 개수 또는 타입이 달라야한다.
 * 
 * 반환타입은 상관 없다.
 * - 오버라이딩과 헷갈리지 말자.
 * - 오버로딩의 반환타입은 상관 없다.
 * 
 * 생성자 오버로딩이 지원된다.
 * 생성자 오버로딩도 이름이 같다.
 * 생성자라는 이름이 들어가면 특징이 하나 생기낟.
 *
 *
 //Exam01 e = new Exam01();
		//System.out.println(100);
		//System.out.println(e);
		
		//byte -> short -> int -> long -> float -> double
		//		char -> int
		
		//int ch ='a'; //자동 형변환이 가능하기에 이렇게 쓸 수 있다.
		
		//long l = 100;
		//int c = l; //이렇게는 쓸 수 없고
		//int c = int(l); //이렇게는 된다.
		/*
		 * println(int i)
		 * println(100)
		 * 
		 * 
		 * e라는 것에 데이터 타입은 Exam01이다.
		 * 근데 내가 어떤 이름을 만들 지 자바가 어떻게 미리 알겠는가
		 * 따라서 println(Exam01 e)와 같은 형태로는 쓸 수 없다.
		 * Exam01 e 부분에 뭐가 들어올지 모르는데 다 받도록 하고 싶다.
		 * 개념적으로 Exam01을 담을 수 있는 더 큰 형이 오면 된다.
		 * Exam01이라는 타입을 담을 수 있는 더 큰 타입이 필요하다.
		 * 여기서 상속 관계를 통해 타입간의 크기를 지정해 줄 수 있다.
		 * 
		 * println(e)
		 * println(Object e)
		 * 
		 * 
		 * 정리하면 오버로딩은 메소드 이름은 같은데 매개변수가 다른 것이 오버로딩
		 * 오버로딩의 전제 조건은 다형성이기 때문에 일단은 메소들 이름이 같아야함
		 * 다른건 매개변수의 타입 또는 개수가 다른 것임
		 * 
		 */
		// TODO Auto-generated method stub
		
/*
 * 두개의 매개변수를 줄때 보통 end는 포함되지 않도록 한다.
 * 가장 매개변수가 많은 것을 기준으로 유지보수가 용이하도록 리펙토링한다.
 * 기능을 합칠때는 달라지는 부분에 초점을 맞춘다.
 * 
 */
package com.ssafy.day02;

public class Exam01 {
	static void printArray(int[] arr) {
		printArray(arr, 0, arr.length);
	}
	static void printArray(int[] arr, int begin) {
		printArray(arr, begin, arr.length);
	}	
	static void printArray(int[] arr, int begin, int end) {
		for (int i = begin; i < end; i++) {
			System.out.println(arr[i]);
		}
	}
	public static void main(String[] args) {
		
		int season = 10;
		String result = "";
		switch (season) {
			case 12:
			case 1:
			case 2:
				result = "겨울";
				break;
			case 3:
			case 4:
			case 5:
				result = "봄";
				break;
			case 6:
			case 7:
			case 8:
				result = "여름";
				break;
			case 9:
			case 10:
			case 11:
				result = "가을";
				break;
		}
		System.out.println(season + "월은" + result + "입니다.");
		
		
		printArray(new int[] {1, 10, 100});
		printArray(new int[] {1, 10, 100}, 1);
		printArray(new int[] {1, 10, 100}, 1, 2);
	}
}






