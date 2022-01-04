// Displays all the perfect squares upto the given number

package com.basics.beginnerprograms;

import java.lang.*;
import java.util.Scanner;

public class SquareUptoGivenNum {
    public int getInput(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number between 1 to 20");
        int num = sc.nextInt();
        return num;
    }
    public int getValidNum(int num){
        while((num>=1 && num<=20) ==false){
            System.out.println("Please provide input within the range");
            num = getInput();
        }
        return num;
    }
    public int calcSquare(int num){
        return num*num;
    }
    public void display(Object result){
        System.out.println(result);
    }
    public static void main(String[] args) {
        SquareUptoGivenNum sq = new SquareUptoGivenNum();
        int num = sq.getInput();
        num = sq.getValidNum(num);
        for(int i=1; i<=num; i++){
            sq.display("Square of "+ i+ ": "+ sq.calcSquare(i));
        }
    }
}