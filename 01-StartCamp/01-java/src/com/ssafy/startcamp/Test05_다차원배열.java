package com.ssafy.startcamp;

public class Test05_다차원배열 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] arr = new int[3][];
		System.out.println(arr.length);
		//3
		System.out.println(arr[0]);
		//null값이 찍힌다
		arr[0] = new int[2]; //공간을 초기화했으니, 자동 초기화가 발생
		System.out.println(arr[0].length);
		//2가 출력된다.
		System.out.println(arr[0][0]); // 0출력
		System.out.println(arr[0][1]); // 0출력
		
		int[][] arr2 = new int[3][];
		arr2[0] = new int[] {1};
		arr2[1] = new int[] {2,3};
		arr2[2] = new int[] {4,5,6};
		System.out.println(arr2[0]);
		System.out.println(arr2[1]);
		System.out.println(arr2[2]);
		/*
		 * int [][] arr2 = {
		 * 			{1},
		 * 			{1,2},
		 * 			{1,2,3}
		 * };
		 */
		//int[][] arr2; arr2 = new int[][] {{1},{2,3},{4,5,6}};
		//위의 주석 처리한 방식도 가능함
		
		
	}
}
