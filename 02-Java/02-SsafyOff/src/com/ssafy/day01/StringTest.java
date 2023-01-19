package com.ssafy.day01;

import java.util.Arrays;

public class StringTest {
	/*
	 * 자바의 문자열 관련 API 클래스
	 * 
	 * 불변
	 * String
	 * 자기가 가지고 있는 공간의 문자열 값을 변경할 수 없다.
	 *
	 * 
	 * 
	 * 
	 * 가변
	 * StringBuffer
	 * StringBuilder
	 * 
	 * 숫자에 f를 주면 float d를 주면 double l을 주면 long
	 */			
	
	public static void main(String[] args) {
		
		String s = "3:2:3:1:2";
		String[] arr = s.split(":"); //자주 사용될 예정
		System.out.println(Arrays.toString(arr));
		
		s = "http://www.naver.com";
		System.out.println(s.startsWith("http://")); //이 문자열로 시작하면 true 시작 안하면 false
		
		s = "flower.jpg";
		System.out.println(s.endsWith(".jpg"));
		
		String contextPath = "/myserver";
		s = "/myserver/login?id=a&pass=b";
		
		System.out.println(s.substring(contextPath.length()));
		
		//정규 표현식 언어란?
		//exam01();
		//exam02();
		//MyString s = new MyString("java");
		exam03(); // API method
		System.out.println(exam04("H11124324i"));
		System.out.println(exam04("12H11124324i"));
		System.out.println(exam04("12H11124346424i"));
	}
	
	private static void exam01() {
		String str1 = "a";
		StringBuffer str2 = new StringBuffer("a");
		StringBuilder str3 = new StringBuilder("a");
		
		System.out.println(str1.concat("b"));
		//System.out.println(str1 = str1.concat("b"));
		System.out.println(str2.append("b"));
		System.out.println(str3.append("b"));
		
		str1 = str1.concat("b");
		
		System.out.println(str1);
		System.out.println(str2);
		System.out.println(str3);
		
		String str4 = "a";
		String str5 = "a";
		String str6 = new String("a");
		System.out.println(str4 == str5); // True
		System.out.println(str5 == str6); // False
		System.out.println(str5.equals(str6)); //True
	}
	
	private static void exam02() {
		String s1 = "a";
		System.currentTimeMillis();
		for (int i = 0; i < 100000; i++) {
			s1 += i;
		}
		long s;
		System.out.println("String 걸린 시간 : " + (System.currentTimeMillis() - s) / 1000d);
		
		StringBuffer s2 = new StringBuffer("a");
		s = System.currentTimeMillis();
		for (int i = 0; i < 100000; i++) {
			s2.append(i);
		}
		System.out.println("StringBuffer 걸린 시간 : " + (System.currentTimeMillis() - s) / 1000d);
		
		StringBuilder s3 = new StringBuilder("a");
		s = System.currentTimeMillis();
		for (int i = 0; i < 100000; i++) {
			s3.append(i);
		}
		System.out.println("StringBuilder 걸린 시간 : " + (System.currentTimeMillis() - s) / 1000d);
	}
	
	private static void exam03() {
		String s = "Hello";
		char ch = s.charAt(0); //s로부터 캐릭터 하나를 뽑겠다. 0번째에 있는 것으로
		System.out.println(ch);
		
		System.out.println(s.length());
		
		for (int i = 0; i < s.length(); i++) {
			System.out.println(s.charAt(i));
		}
		
		s = "19278140";
		char[] arr = s.toCharArray();
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		
		s = "Hello";
		if (s.equals("hello")) {
			System.out.println("equals 는 대소문자 비교");
		}
		if (s.equalsIgnoreCase("hello")) {
			System.out.println("equalsIgnoreCase 는 대소문자 비교");
		}
		//위에는 문자열 내용 비교
		
		s = s.toUpperCase();
		System.out.println(s);
		
		s = s.toLowerCase();
		System.out.println(s);
		
		s = "HelloJava";
		int ind = s.indexOf("llo");
		System.out.println(ind);
		
		ind = s.indexOf("a", ind + 1);
		System.out.println(ind);
		
		ind = s.lastIndexOf("a");
		System.out.println(ind);
		
		boolean find = s.contains("llo");
		System.out.println(find);
		
		//문자열로 만들기 +, valueOf
		String data = 100 + "";
		data = String.valueOf(100);
		
		data = " H e l l o ";
		data = data.trim();
		System.out.println(data);
		
		data.replace(" ","");
		System.out.println(data);
		
		
	}
	
	private static String exam04(String data) {
		return "Hi";
	}

	static class MyString{
		String data;
		MyString(String data) {
			this.data = data;
		}
	}

}
