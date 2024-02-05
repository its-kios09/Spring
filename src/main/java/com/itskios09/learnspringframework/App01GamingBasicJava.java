package com.itskios09.learnspringframework;

import com.itskios09.learnspringframework.game.GameRunner;
import com.itskios09.learnspringframework.game.PacMan;


public class App01GamingBasicJava {
    public static void main(String[] args){
//        var game = new MarioGame();
        var game = new PacMan();
//        var game = new SuperContra();
        var gameRunner = new GameRunner(game);
//
        gameRunner.run();
    }

}
