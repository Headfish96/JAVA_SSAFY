package com.ssafy.day03;


class Single {
	//제공된 생성자를 건드리지 마시오
	//추가 생성자를 작성하지 마시오.
	private Single() {}
	
	private static Single instance;
	public static Single getInstance() {
		if (instance == null) {
			instance = new Single();
		}
		return instance;
	}
	//코드를 추가해서 아래의 코드가 에러가 발생하지 않도록 작성하시오.
}
public class Quiz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Single s = Single.getInstance();
		
	}

}
