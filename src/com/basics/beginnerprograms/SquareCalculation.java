// Program to calculate square of a given number.

package com.basics.beginnerprograms;

import java.util.Scanner;

public class SquareCalculation {
    public int getInput(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
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
        SquareCalculation sq = new SquareCalculation();
        int num = sq.getInput();
        num = sq.getValidNum(num);
        sq.display("The Square of "+ num + " is "+sq.calcSquare(num));
    }
}