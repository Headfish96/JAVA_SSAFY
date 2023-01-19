// @@DELETE_FILE:
package com.ssafy.b_abstraction.person;

public class PersonTest {

	@SuppressWarnings("static-access")
    public static void main(String[] args) {
    	//객체사용
    	Person p = new Person();
    	p.age //person에 선언되어 있는 int 타입의 변수 age
    	p.name = "홍길동";
    	p.isHungry = true;
    	p.eat();
    	
        Person person1 = new Person(); //person 타입의 p
        person1.name = "홍길동";
        person1.isHungry = true;
        System.out.printf("name: %s, isHungry: %b%n", person1.name, person1.isHungry);
        person1.eat();
        
        //System.out.printf("name: %s, isHungry: %b%n", person1.name, person1.isHungry);
        p.printInto();
        
        Person person2 = new Person();
        person2.name = "임꺽정";
        person2.isHungry = true;
        System.out.printf("name: %s, isHungry: %b%n", person2.name, person2.isHungry);
        System.out.printf("name: %s, isHungry: %b%n", person1.name, person1.isHungry);
    }
}
