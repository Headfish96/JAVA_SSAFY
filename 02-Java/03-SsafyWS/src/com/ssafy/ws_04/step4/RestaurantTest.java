package com.ssafy.ws_04.step4;

public class RestaurantTest {
	public static void main(String[] args) {
		Restaurant res1 = new Restaurant();
		res1.resId = 101;
		res1.name = "을밀대";
		res1.address = "서울";
		res1.signatureMenu = "냉면";
		res1.rate = 4;
		
		Restaurant res2 = new Restaurant(401, "도마29", "대구", "연어초밥", 3);
		
		
		Review view1 = new Review();
		view1.reviewId = 1;
		view1.resId = 101;
		view1.writer = "김싸피";
		view1.content = "너무 마시쪙!!!";
		
		
		Review view2 = new Review(2, 401, "나싸피","연어초밥 마시쪙");
		
		
		System.out.println(res1.toString());
	}
}
