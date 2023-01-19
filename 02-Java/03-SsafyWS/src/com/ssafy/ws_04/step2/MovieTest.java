package com.ssafy.ws_04.step2;

public class MovieTest {

	public static void main(String[] args) {
		//코드를 작성해주세요. 
		
		Movie movie1 = new Movie();
		Movie movie2 = new Movie(120, "Bvator", "james", "Action", 240);
		
		movie1.director = "james";
		movie1.genre = "Action";
		movie1.id = 123;
		movie1.runningTime = 120;
		movie1.title = "Avator";
		
		
		System.out.println("영화 제목 : " + movie1.title);
		System.out.println("영화 장르 : " + movie1.genre);
		System.out.println("영화 감독 : " + movie1.director);
		System.out.println("영화 러닝타임 : " + movie1.runningTime);
		System.out.println("영화 번호 : " + movie1.id);
		
		System.out.println("영화 제목 : " + movie2.title);
		System.out.println("영화 장르 : " + movie2.genre);
		System.out.println("영화 감독 : " + movie2.director);
		System.out.println("영화 러닝타임 : " + movie2.runningTime);
		System.out.println("영화 번호 : " + movie2.id);
	}

}
