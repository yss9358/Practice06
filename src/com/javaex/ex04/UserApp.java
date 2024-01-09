package com.javaex.ex04;

public class UserApp {

	public static void main(String[] args) {
		
		User[] uArray = new User[3];
		
		User u1 = new Customer("jws","j1234","정우성",1000);
		
		User u2 = new Customer(2000);
		
		u2.setId("yjs");
		u2.setPassword("y2345");
		u2.setName("이효리");
		
		User u3 = new Employee(5000000);
		
		u3.setId("master");
		u3.setPassword("m7788");
		u3.setName("운영자");
		
		uArray[0] = u1;
		uArray[1] = u2;
		uArray[2] = u3;
		
		for (int i=0; i<uArray.length; i++) {
			uArray[i].showInfo();
		}
		
		System.out.println("운영자의 월급은 5000000원 입니다.");
		

	}

}
