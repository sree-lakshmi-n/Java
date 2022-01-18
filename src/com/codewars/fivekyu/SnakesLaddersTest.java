/* Snakes and Ladders
* https://www.codewars.com/kata/587136ba2eefcb92a9000027
* */

package com.codewars.fivekyu;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.IntStream;

class SnakesLadders{
    private int player;
    public int playerOneSqNum;
    public int playerTwoSqNum;
    int[] laddersBottomSq;
    int[] laddersTopSq;
    int[] snakesTopSq;
    int[] snakesBottomSq;
    boolean playerToggle;

    public SnakesLadders() {
        player = 1;
        playerOneSqNum = 0;
        playerTwoSqNum = 0;
        laddersBottomSq = new int[]{2, 7, 8, 15, 21, 28, 36, 51, 71, 78, 87}; //ladder starting square
        laddersTopSq = new int[]{38, 14, 31, 26, 42, 84, 44, 67, 91, 98, 94}; // ladder ending square
        snakesTopSq = new int[]{16, 46, 49, 62, 64, 74, 89, 92, 95, 99}; // snake starting square
        snakesBottomSq = new int[]{6, 25, 11, 19, 60, 53, 68, 88, 75, 80}; // snake ending square
        playerToggle = false;
    }
    public void playerTurnOver() {      // Decides current player
        playerToggle = !playerToggle;
        if(playerToggle)
            player = 2;
        else
            player = 1;
    }
    // Decides whether the square you've reached has a ladder/ snake
    private String isSnakeOrLadder(int sqNum){
        if(IntStream.of(laddersBottomSq).anyMatch(n -> n == sqNum))
            return "ladder";
        else if(IntStream.of(snakesTopSq).anyMatch(n -> n == sqNum))
            return "snake";
        else
            return "none";
    }
    // Returns the end point square of current ladder/ snake
    private int getValue(String str, int key){
        Map<Integer,Integer> ladderMap = new HashMap<>();
        Map<Integer,Integer> snakeMap = new HashMap<>();
        for (int i = 0; i < laddersBottomSq.length; i++) {
            ladderMap.put(laddersBottomSq[i],laddersTopSq[i]);
        }
        for (int i = 0; i < snakesTopSq.length; i++) {
            snakeMap.put(snakesTopSq[i],snakesBottomSq[i]);
        }
        if(str.equals("ladder"))
            return ladderMap.get(key);
        else
            return snakeMap.get(key);
    }
    public String play(int die1, int die2) {
        int squareNum = 0;
        String result = "";
        // Decides which player's square number has to be incremented
        squareNum = (player == 1)? playerOneSqNum:playerTwoSqNum;
        if(squareNum == 100)          // SquareNum being 100 implies a player has already won
            return "Game over!";
        // You should roll the exact number to reach 100. Else, you'll bounce back.
        if(squareNum + die1 + die2 >100)
            squareNum = 100 - (die1 + die2 - (100 - squareNum));
        else
            squareNum += (die1 + die2);
        if(die1 == die2)
            result = "Player " + player + " is on square " + squareNum;
        if(isSnakeOrLadder(squareNum)!="none"){     // Updating square num whether you've met a ladder/ snake
            squareNum = getValue(isSnakeOrLadder(squareNum),squareNum);
            result = "Player " + player + " is on square " + squareNum;
        }
        if(squareNum == 100)        // If you reached 100 by rolling the exact number, you win :-)
            result = "Player " + player + " Wins!";
        if(player == 1)
            playerOneSqNum = squareNum;
        else
            playerTwoSqNum = squareNum;
        if(die1 != die2 && squareNum != 100){
            result = "Player "+ player +" is on square "+squareNum;
            playerTurnOver();  //Changing the current player
        }
        return result;
    }

}
public class SnakesLaddersTest {
    public static void main(String[] args) {
        SnakesLadders sl = new SnakesLadders();
//        System.out.println(sl.play(1,1));
//        System.out.println(sl.play(1,5));
//        System.out.println(sl.play(6,2));
//        System.out.println(sl.play(1,1));

        System.out.println(sl.play(4,5));
        System.out.println(sl.play(4,2));
        System.out.println(sl.play(3,5));
        System.out.println(sl.play(1,6));
        System.out.println(sl.play(6,1));
        System.out.println(sl.play(3,1));
        System.out.println(sl.play(3,3));
        System.out.println(sl.play(5,6));
        System.out.println(sl.play(6,6));
        System.out.println(sl.play(2,1));
        System.out.println(sl.play(6,2));
        System.out.println(sl.play(3,5));
        System.out.println(sl.play(5,5));
        System.out.println(sl.play(1,5));
        System.out.println(sl.play(2,6));
        System.out.println(sl.play(3,5));
        System.out.println(sl.play(4,4));
        System.out.println(sl.play(6,2));
        System.out.println(sl.play(6,6));
        System.out.println(sl.play(1,4));
        System.out.println(sl.play(3,5));
        System.out.println(sl.play(3,6));
        System.out.println(sl.play(5,2));
        System.out.println(sl.play(3,2));
        System.out.println(sl.play(4,6));
        System.out.println(sl.play(1,6));
        System.out.println(sl.play(5,1));
        System.out.println(sl.play(6,1));
        System.out.println(sl.play(2,6));
        System.out.println(sl.play(2,4));
        System.out.println(sl.play(1,2));
    }
}