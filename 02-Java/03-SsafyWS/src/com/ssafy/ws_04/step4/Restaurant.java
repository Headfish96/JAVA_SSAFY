package com.ssafy.ws_04.step4;

public class Restaurant {
	int resId;
	String name;
	String address;
	String signatureMenu;
	int rate;
	
	Restaurant(){}
	Restaurant(int resId, String name, String address, String signatureMenu, int rate){
		this.resId = resId;
		this.name = name;
		this.address = address;
		this.signatureMenu = signatureMenu;
		this.rate = rate;
	}
	
	public String toString(){
		return "************맛집목록************";
	}
}
