package com.ssafy.startcamp;

import java.util.Arrays;

class Ssafy {
	String name;
}
//클래스를 하나 만들었는데, 이러면 클래스도 하나의 데이터 타입이 된 것임

public class Test04_배열의초기화 {
	
	static void print(int[] arr) {
		System.out.println(Arrays.toString(arr));
	//배열 안에 있는 값을 문자열로 표현해주도록 하겠다
	}
	static void print(int v) {
		System.out.println(v*v);
		//배열 안에 있는 값을 문자열로 표현해주도록 하겠다
	}
	
	public static void main(String[] args) {
		System.out.println("=========================");
		
		/*
		 * int[] a = {1, 10, 100, 1000};
		 * print(a);
		 */	

		/*
		 * print({1,10,100,1000});
		 * 위 프린트가 안되는 이유, 이건 항상 쓰일때 변수의 선언과 같이 해야하는데 그렇지 않았음 
		 */
		
		print(new int[]{1,10,100,1000}); //이렇게 사용하면 변수의 선언과 동시게 사용하기에 가능함
		
		
		/*
		 * int k = 100;
		 * print(k);
		 * k는 한번만 쓰이는 변수라거 쓰이지 않는게 좋다.
		 */
		print(100);
		
		System.out.println("=========================");
		
		Ssafy s1 = null;
		System.out.println(s1);
		//여기서 s1을 출력하려면 초기화 오류 발생. null 값으로 초기화해서 오류 해결
		//자동초기화는 배열만 해당. 이건 클래스이니 자동 초기화가 되지 않는다.
	
		{
			int[] arr = new int[3];
			//arr의 타입은 배열인데 그 배열이 int를 담는거야 -> int[] arr
			//arr[1] = 100;
			//숫자는 전부 다 0으로 초기화
			//문자는 전부 null문자로 자동 초기화
			//논리형은 false로 자동 초기화
			//참조형은 null로 자동 초기화
			arr[0] = 10;
			arr[1] = 100;
			arr[2] = 1000;
			System.out.println(arr[0]);
			//배열을 만드는 시점에 이미 배열 안에 어떤 값을 넣을지 알고 있는 경우가 있음
		}
		{
			int[] arr = {10, 100, 1000};
			/*
			 int[] arr = new int[3];
			 arr = {10,100,1000}; //불가능
			 */
			//선언과 동시에 사용해야하고 나중에 따로 중괄호를 사용하여 넣어줄 수 없다
			System.out.println(arr[0]);
			//배열을 만드는 시점에 이미 배열 안에 어떤 값을 넣을지 알고 있는 경우가 있음
		}
		{
			int[] arr = new int[] {10,100,1000};
			arr = new int[] {20,200,2000}; //이건 나중에 값을 넣어줄 수 있음
			//이 방법은 단 한번 사용하는 배열일때 이 방법을 사용한다
		}
		
		System.out.println(arr[0]);
		
		Integer[] arr2 = new Integer[2];
		System.out.println(arr2[0]);
		//참조형이니까 주소값이 들어가야하는데, 주소값을 마음대로 줄 수 없으니, null이 들어감
		
		Ssafy[] arr3 = new Ssafy[2];
		System.out.println(arr3[0]); //null값출력
		//arr3은 Ssafy라는 참조형 데이터를 담는 배열임
		
		int[][] arr4 = new int[3][];
		System.out.println(arr4[0]);
		//arr4라는건 배열이고 이 배열은 뭘 담느냐하면, int[]을 담으니 참조형을 담는다
		//참조형이니 기본 자동 초기화가 null로 되어 null이 출력
	}

}
