package com.ssafy.d_encapsulation.p1;

public class SamePackageSomeClass {
	public void method() {
		// TODO: Parent 객체를 생성하고 이를 통해서 Parent의 멤버에 접근해보세요.
		Parent p = new Parent();
		p.publicVar = 10;
		p.protectVar = 10;
		p.defaultVar = 10;
		//p.privVar = 10; private 접근 불가능
		// END:
	}
}
