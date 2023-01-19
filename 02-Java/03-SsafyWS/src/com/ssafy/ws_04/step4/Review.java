package com.ssafy.ws_04.step4;

public class Review {
	int reviewId;
	int resId;
	String writer;
	String content;
	
	Review(){}
	Review(int reviewId, int resId, String writer, String content){
		this.reviewId = reviewId;
		this.resId = resId;
		this.writer = writer;
		this.content = content;
	}
	
	public String toString() {
		return "************리뷰목록************";
	}
	
}
