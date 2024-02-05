package com.itskios09.learnspringframework;

import com.itskios09.learnspringframework.game.MarioGame;
import com.itskios09.learnspringframework.game.GameRunner;


public class AppGamingBasicJava {
    public static void main(String[] args){
        var marioGame = new MarioGame();
        var gameRunner = new GameRunner(marioGame);
        gameRunner.run();
    }

}
