package com.ssafy.ws_04.step2;

public class Movie {
	int id;
	String title;
	String director;
	String genre;
	int runningTime;

	//기본 생성자
	Movie() {}
	
	//인자를 받는 생성자
	Movie(int id, String title, String director, String genre, int runningTime) {
		this.id = id;
		this.title = title;
		this.director = director;
		this.genre = genre;
		this.runningTime = runningTime;
	}
	
}
