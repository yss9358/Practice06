package com.javaex.ex07;

public class MusicPhone extends Phone{
    
    public void execute(String str){
        
        if("음악".equals(str)){
            playMusic();
        }else{
            super.execute(str);
        }
        
    }
    
    protected void playMusic(){
        System.out.println("Mp3플레이어에서 음악재생");
    }
}
