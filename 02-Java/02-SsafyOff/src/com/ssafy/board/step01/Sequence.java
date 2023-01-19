package com.ssafy.board.step01;

//클래스는 변수와 메소드로 이뤄짐
// 변수가 막히면 메소드만 남음
class Sequence {
	private static int no = 1;
	static int nextVal() {
		return no++;
	}
}
