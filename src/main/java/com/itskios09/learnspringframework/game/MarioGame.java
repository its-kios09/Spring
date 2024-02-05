package com.itskios09.learnspringframework.game;

public class MarioGame implements GamingConsole{
    public void up(){
        System.out.println("Mario_Jump");
    }
    public void down(){
        System.out.println("Mario_Get into a hole");
    }
    public void left(){
        System.out.println("Mario_Go back");
    }
    public void right(){
        System.out.println("Mario_Run fast");
    }
}
