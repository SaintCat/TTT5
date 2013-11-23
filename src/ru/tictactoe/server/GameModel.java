package ru.tictactoe.server;

import java.util.Random;

public class GameModel implements PlayerIngameInterface{
    static final int EMPTY = 0,
                     CROSS = 1,
                     ROUND = 2;

    int[][] Board;

    GameModel(int size){
        //TODO create a bord of {@link size}
    }

    public void LeaveGame(){

    }

    public void MakeATurn(int row, int column){

    }

    class Arbiter extends Thread{

        volatile boolean monitor;



        Arbiter(){
            this.setDaemon(true);
            this.run();
        }

        @Override
        public void run(){

        }
    }
    //TODO: ANALYSE MODEL
}
