package com.ssafy.day03;

import java.util.Random;

class MyRandom extends Random {
	public int nextInt(int num) {
		return num;
		//return nextInt(num); 이렇게하면 그냥 재귀
		//return super.nextInt(num) + 1;
	}
}

public class Exam04_Final연습2 {
	public static void main(String[] args) {
		Random r1 = new MyRandom(); //변수의 형 변환처럼 형 변환 가능. 묵시적 형 변환, 암시적 형변환, 업캐스팅
		//MyRandom r1 = new Random(); //안되지만 이게 가능해지는 경우가 있다.
		MyRandom r = (MyRandom)r1; //다운캐스팅
		int num = r.nextInt(10); //nextInt(10)의 접근 제한자 public, protected 까지 가능
		long num2 = r.nextLong();
	}

}

//