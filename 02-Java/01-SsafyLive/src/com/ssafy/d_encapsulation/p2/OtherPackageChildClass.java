package com.ssafy.d_encapsulation.p2;

import com.ssafy.d_encapsulation.p1.Parent;

class OtehrPackageChildClass extends Parent {
	public void test() {
		this.publicVar = 10;
		//다른 패키지에 있더라도 상속한 경우 protected 까지 접근이 가능하다.
		
		this.protectVar = 10;
		//this.defaultVar = 10;
		//this.privVar = 10;
	}

// TODO: Parent를 상속받고 Parent의 member들에 접근해보세요.
    // END:
}
