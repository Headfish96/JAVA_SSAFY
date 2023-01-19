package com.ssafy.startcamp;

import java.util.Arrays;

public class Test06_배열요소확인 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr = {1,2,3};
		System.out.println("1.4까지 주로 사용");
		for (int i=0; i<arr.length; i++) {
			System.out.println(arr[i]);
		}
		
		System.out.println("1.5버전에 추가된 향상된 for");
		for (int v : arr) { //v는 readonly값이다 v를 바꾼다고해서 달라지지 않는다.
			System.out.println();
		}
		
		System.out.println("1.5버전에 추가된 Arrays.toString 활용");
		System.out.println(Arrays.toString(arr));
		
		System.out.println("1.8버전에 추가된 Arrays.stream을 활용한 배열요소 확인");
		Arrays.stream(arr).forEach(v -> System.out.println(v));
		
		System.out.println("stream2");
		Arrays.stream(arr).forEach(System.out::println);
		
		int[][] arr2 = {
				{1},
				{2,3}
		};
		System.out.println(Arrays.toString(arr2)); //이렇게 쓰면 주소 값이 찍힌다.
		//2차원 배열은 1차원 배열의 주소 값을 가지고 있는 것
		//그렇다면 주소에 들어가 있는 실재 값을 출력하려면 어떻게 해야할까? 아래와 같다.
		System.out.println(Arrays.deepToString(arr2));
	}

}
