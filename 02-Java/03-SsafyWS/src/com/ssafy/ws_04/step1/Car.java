package com.ssafy.ws_04.step1;

public class Car {
	// 1: 국가 2: 제작사 3: 차량구분 4: 차종 5: 세부차종 6: 차체형상 7: 안정장치
	// 8: 배기량 9: 확인란 10: 제작년도 11: 공장위치 12~17: 제작일련번호
	String VIN; 		// 자동차 등로 번호 17자리
	String modelName;	// 자동차 모델 이름
	String color; 		// 자동차 색상
	int mileage; 		// 주행거리

	//위에 있는건 변수를 생성한 것
	
	// 기본 생성자
	public Car() {
	}
	// 기본 생성자를 명시해줬으나, 자동으로 생성도 된다.
	// public을 안해도 자동으로 부여된다.
	
	// 인자를 받는 생성자
	public Car(String VIN, String modelName, String color, int mileage) {
		this.VIN = VIN;
		this.modelName = modelName;
		this.color = color;
		this.mileage = mileage;
	}
}
