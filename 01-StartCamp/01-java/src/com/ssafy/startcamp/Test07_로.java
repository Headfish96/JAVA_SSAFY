package com.ssafy.startcamp;

import java.util.Arrays;
import java.util.Random;

public class Test07_로 {
	public static void main(String[] args) {
		System.out.println(Arrays.toString(lotto1()));
		System.out.println(Arrays.toString(lotto2()));
		System.out.println(Arrays.toString(lotto3()));
		System.out.println(Arrays.toString(lotto4()));
	}
	
	static int[] lotto1() {
		Random r = new Random();
		int[] lotto = new int[6]; // 6자리의 lotto라는 이름의 1차원 배열을 만든다. 지금은 아무런 값이 들어가 있지 않다.
		lotto[0] = r.nextInt(45) + 1;
		/*
		 * r.nextInt(45)하면 0부터 44까지의 랜덤한 숫자를 가지고 오기 때문에 +1을 해서 1부터 45까지의 숫자 중에서 받아온다.
		 * 그렇게 가지고 온 숫자를 lotto라는 배열의 첫번째 박스인 lotto[0]에 넣어준다.
		 * lotto의 나머지 자리 lotto[1]부터 lotto[5]까지는 비어있다.
		 */
		outer: // 레이블을 선언하는 문법이 레이블명에 콜론(:)을 붙이는 것이다. ex) exit_labe:
			/**
			 * 레이블: 반복문 내부에 또 반복문을 사용할 때 레이블을 설정해 놓고 내부 반복문에서
			 * break 레이블 문을 사용하면 내부, 외부 반복문 모두 탈출할 수 있다.
			 */
		for (int i = 1; i < 6; i++) { //i가 0부터 5까지 6번 반복한다.
			int num = r.nextInt(45) + 1; //num은 1부터 45까지의 숫자 중 임의의 값을 가진다
			for (int j = 0; j < i; j++) { //j는 0부터 i보다 작을때 반복한다.
				if (num == lotto[j]) { //만약에 랜덤으로 뽑은 num이 lotto[j]와 같다면 
					--i;
					continue outer;
					/*
					 * 위에서 설정해놓은 레이블(여기서는 outer)를 이용한다.
					 * if문에서 만약 num의 값과 lotto[j]의 값이 같다면
					 * i의 값을 하나 줄이고 continue outer;로 인해서 outer가 표시되어 있는
					 * 맨 위로 올라가서 다시 시작한다.
					 * 따라서 레이블과 continue에 따라서 아래 lotto[i]=num과 return lotto가 실행되지 않는다.
					 */
				}
			}
			lotto[i] = num;
			/*
			 * 위에 int num = r.nextInt(45) + 1과 i가 1부터 5까지 6번반복하므로
			 * lotto라는 배열이 다 채워지게 된다.
			 */
		}
		return lotto;
	}
	
	static int[] lotto2() {
		Random r = new Random();
		//r.nextInt(45);	//0부터 44까지의 값을 준다. -< 1부터 45로 바꿔줘야한다. 나온거에 +1을 해준다.
		int[] lotto = new int[6];
		boolean[] used = new boolean[46];
			for (int i = 0; i < 6; i++) {
				int num = r.nextInt(45) + 1;
				if (used[num]) {
					--i;
					continue;
				}
				used[num] = true;
				lotto[i] = num;
			}	
			return lotto;
		}
	
	static int[] lotto4() {
		int[] lotto = new int[6];
		final int MAX_NUMBER = 45;
		int[] numbers = new int[MAX_NUMBER];
		for (int i=0; i<MAX_NUMBER; i++) numbers[i] = i+1;
		
		Random r = new Random();
		for (int i=0; i<6; i++) {
			int idx = r.nextInt(MAX_NUMBER -i);
			
			lotto[i] = numbers[idx];
			numbers[idx] = numbers[MAX_NUMBER -i-1];
		}
		return lotto;
	}
	static int[] lotto3() {
		Random r = new Random();
		//r.nextInt(45);	//0부터 44까지의 값을 준다. -< 1부터 45로 바꿔줘야한다. 나온거에 +1을 해준다.
		int[] lotto = new int[6];
		int[] numbers = new int[46];
		for (int i = 1; i < numbers.length; i++) {
			numbers[i] = i;
		}
		
		for (int i=0; i<1000; i++) {
			int num = r.nextInt(45) + 1;
			int temp = numbers[r.nextInt(45) + 1];
			numbers[num] = numbers[1];
			numbers[1] = temp;
		}
		
		for (int i = 1; i <= 6; i++) {
			lotto[i - 1] = numbers[i];
		}
		
			return lotto;
		}
}