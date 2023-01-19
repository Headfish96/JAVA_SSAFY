package com.ssafy.hw_01.step2;

public class User {
	
	// 외부에서 객체 내부의 변수에 직접 접근하지 못하도록 접근 제한자 설정
	private String id;
	private String password;
	private String name;
	private String email;
	private int age;
	
	public User() {}
	
	public User(String id, String password, String name, String email, int age) {
		this.id = id; //this를 사용하는 이유는 위에 선언되어 있는 것에 접근하는 것임
		this.password = password;
		this.name = name;
		this.email = email;
		this.age = age;
	}
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}

	
	public void setPassword(String password) {
		this.password = password;
	}
	public String getPassword() {
		return password;
	}
	
	
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	
	
	public void setEmail(String email) {
		this.email = email;
	}
	public String getEmail() {
		return email;
	}
	
	
	public void setAge(int age) {
		this.age = age;
	}
	public int getAge() {
		return age;
	}
	
	@Override
	public String toString() {
		return "User [id=" + id + ", password=" + password + ", name=" + name + ", email=" + email + ", age=" + age + "]";
	}
	
}
