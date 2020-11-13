package net.boardgames.sal;

import static net.boardgames.sal.Dice.rollDice;

public class App {

    public static void main(String[] args) throws Exception {

        SnakesAndLaddersSinglePlayer sal = new SnakesAndLaddersSinglePlayer();


        while(!sal.isGameDone()){
            sal.move(rollDice());
            System.out.println(sal.getMessage());
            System.out.println("-----------");
        }

        System.out.println("done!");
        System.out.println("Total moves made: "  + sal.totalMoves());

    }
}
