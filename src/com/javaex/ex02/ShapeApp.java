package com.javaex.ex02;

public class ShapeApp {

	public static void main(String[] args) {
		
		Shape s1 = new Shape("파랑", "파랑");
		System.out.println("================");
		
		Triangle t1 = new Triangle();
		System.out.println("================");
		
		Triangle t2 = new Triangle(3, 4);
		System.out.println("================");
		
		Shape t3 = new Triangle("빨강", "빨강", 15, 15);
		System.out.println("================");
		
	}
	
	/*
	
	Shape s1 은  생성자 Shape(0) 실행 
	
	Triangle t1 은 생성자 Shape(0) 실행 -> 생성자 Triangle(0) 실행
	
	Triangle t2 는 생성자 Triangle(2) 실행 가 실행되어야 하나 super("검정","검정") 때문에 실행되지 않음
	        -> super("검정","검정") 을 지우거나 파라미터에 String fillColor, String lineColor 을 추가하면 실행됨
	        -> 실행되면 생성자 Shape(2) 실행 -> 생성자 Triangle(2) 실행 가 나올거같음
	
	Shape t3 는 생성자 Shape(2) 실행 -> 생성자 Triangle(4) 실행
	
	
	
	
	
	
	
	*/
	
	
	

}

