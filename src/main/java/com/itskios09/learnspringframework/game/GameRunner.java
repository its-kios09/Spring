package com.itskios09.learnspringframework.game;

public class GameRunner {
    private GamingConsole game;
    public GameRunner (GamingConsole game ){
        this.game = game;
    }
    public void running_game(String x){
        System.out.println("Runnng game: " + x );
    }
    public void run(){
        running_game(game.toString());
        game.up();
        game.down();
        game.left();
        game.right();
    }
}
