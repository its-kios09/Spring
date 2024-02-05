package com.itskios09.learnspringframework.game;

public class SuperContra  implements GamingConsole{
    public void up(){
        System.out.println("Contra_Jump");
    }
    public void down(){
        System.out.println("Contra_set down");
    }
    public void left(){
        System.out.println("Contra_Go back");
    }
    public void right(){
        System.out.println("Contra_shoot a bullet");
    }
}
