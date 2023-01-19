package com.ssafy.ws_04.step3;
/**
 * 도서 정보를 나타내는 클래스
 */
public class Book {
//Book 정보를 저장할 클래스를 생성한다.
//isbn, title, author, publisher, price, desc

	
//책의 정보를 저장하는 책의 정보를 여기에 변수로 선언
	String isbn;
	String title;
	String author;
	String publisher;
	int price;
	String desc;
	
	Book() {}
	//기본 생성자 생성함
	Book(String isbn, String title, String author, String publisher,
			int price,String desc) {
		this.isbn = isbn;
		this.title = title;
		this.author = author;
		this.publisher = publisher;
		this.price = price;
		this.desc = desc;
	}
	
	public String toString() {
		return "*********************도서목록*********************\n"
			 + this.isbn + " | " + this.title + " | " + this.author + " | "
			 + this.publisher + " | " + this.price + " | " + this.desc;
	}
	
}

