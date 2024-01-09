package com.javaex.ex07;

public class SmartPhone extends MusicPhone {
    
    public void execute(String str){
    	if (str.equals("통화")) {
    		System.out.println("통화기능시작");
    	} else if (str.equals("음악")) {
    		System.out.println("다운로드해서 음악재생");
    	} else {
    		apps();
    	}
  
    }
    public void apps() {
    	System.out.println("앱실행");
    }
    
    //메소드작성
    
    //메소드작성
    
    
    
}
