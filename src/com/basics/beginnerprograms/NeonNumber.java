/* Checks whether given number is a neon number or not */

package com.basics.beginnerprograms;

import java.util.Scanner;

public class NeonNumber {
    private int getInput(){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        return num;
    }
    private boolean checkIfValid(int num){
        if(num>=1){
            return true;
        }
        else return false;
    }
    private int calcDigitSum(int num){
        int sum = 0;
        while(num!=0){
            sum += num%10;
            num/=10;
        }
        return sum;
    }
    private int calcSquare(int num){
        return num*num;
    }
    private boolean isNeon(int digitSum, int square){
        if(digitSum == square) return true;
        else return false;
    }
    public void display(Object result){
        System.out.println(result);
    }
    public static void main(String[] args) {
        NeonNumber neon = new NeonNumber();
        neon.display("Enter a natural number");
        int num = neon.getInput();
        if(neon.checkIfValid(num)){
            if(neon.isNeon(num,neon.calcDigitSum(neon.calcSquare(num)))){
                neon.display(num + " is a neon number.");
            }
            else neon.display(num + " is not a neon number.");
        }
        else neon.display("Enter a valid number. Try again.");
    }
}