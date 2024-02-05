package com.itskios09.learnspringframework;

import com.itskios09.learnspringframework.game.MarioGame;
import com.itskios09.learnspringframework.game.GameRunner;
import com.itskios09.learnspringframework.game.PacMan;
import com.itskios09.learnspringframework.game.SuperContra;


public class AppGamingBasicJava {
    public static void main(String[] args){
//        var game = new MarioGame();
        var game = new PacMan();
//        var game = new SuperContra();
        var gameRunner = new GameRunner(game);
        gameRunner.run();
    }

}
