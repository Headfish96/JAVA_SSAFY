package com.ssafy.hw_01.step2;

import java.util.*;
public class UserTest {
	public static void main(String[] args) {
		
		String name;
		User user1 = new User();
		user1.setId("user1");
		user1.setPassword("user1");
		user1.setName("김싸피");
		user1.setEmail("ssafy1@ssafy.com");
		user1.setAge(27);

		User user2 = new User("user2", "user2", "박싸피", "ssafy2@ssafy.com", 28);
		
		UserManager um = new UserManager();
		
		//사용자를 등록한다.
		um.add(user1);
		um.add(user2);
		
		//등록된 사용자를 모두 출력한다.
		User[] userList = um.getList();
		for(int i=0; i < userList.length; i++) {
			System.out.println(userList[i].toString());
		}
		
		
		System.out.println(um.searchByName("kkk"));
	}
}
