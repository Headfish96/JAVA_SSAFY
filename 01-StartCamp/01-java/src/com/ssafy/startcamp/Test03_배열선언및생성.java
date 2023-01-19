package com.ssafy.startcamp;

public class Test03_배열선언및생성 {
	public static void main(String[] args) {
		int [] array = null; //주소를 나타내기 전에 값은 넣어주고 싶음. 아직까지 주소값이 없다는 것을 나타내는 값임
		//The local variable array may not have been initialized
		System.out.println(array);
		array = new int[3]; //int를 담는 배열 공간 생성
		
		array[0] = 1;
		array[1] = 10;
		array[2] = 100;
		
		System.out.println(array[1]);
		
		String[] arr2 = new String[2];
		arr2[0] = "hello";
		arr2[1] = "java";
		/*
		 * int[]	[] a; //참조형임(int[])는 대괄호가 붙었느니 참조형 / 주소값이 담긴다.
		 * int   	[] b; //기본형임 값이 담긴다.
			String	[] c; //참조형임
		 * 
		 */
		char[] arr3 = new char[2];
		arr3[0] = 'a';
		arr3[1] = 'b';
		
		
	}

}
