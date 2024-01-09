package com.javaex.ex03;

public class Shape {

	// 필드
	// private -> protected 로 변경 
	// Triangle 클래스에서 fillColor,lineColor 을 그대로 쓰려면 바꿔주어야함.

	protected String fillColor;
	protected String lineColor;

	// 생성자
	// Shape 의 default 생성자가 없어 Triangle 의 생성자가 진행되지 않아서 추가함.
	
	public Shape() {
		
	}
	
	public Shape(String fillColor, String lineColor) {
		this.fillColor = fillColor;
		this.lineColor = lineColor;
	}

	// 메소드 g/s

	public void setFillColor(String fillColor) {
		this.fillColor = fillColor;
	}

	public void setLineColor(String lineColor) {
		this.lineColor = lineColor;
	}

	// 메소드 일반


}
