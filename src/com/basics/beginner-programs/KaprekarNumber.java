/*
* A Kaprekar number is a number whose square when divided into two parts and
* such that sum of parts is equal to the original number and none of the parts
* has value 0.
* Explanation: https://www.geeksforgeeks.org/kaprekar-number/
 * */

package com.basics.beginnerprograms;

import java.util.Scanner;

public class KaprekarNumber {
    private int getInput(){
        Scanner sc = new Scanner(System.in);
        print("Enter a number: ");
        int num = Math.abs(sc.nextInt());
        return num;
    }
    public void print(Object result){
        System.out.println(result);
    }
    private int countDigits(int num){
        String numString = Integer.toString(num);
        return numString.length();
    }
    private boolean isKaprekar(int num){
        if(num == 0) return false;
        if(num == 1) return true;

        int sq = num*num;
        int noOfDigits = countDigits(sq);
        int partOne;
        int partTwo;
        int sum;

        for(int i = noOfDigits-1; i>0; i--){
            partOne = sq/(int)Math.pow(10,i);
            partTwo = sq%(int)Math.pow(10,i);
            if(partOne == 0 || partTwo == 0) continue;
            sum = partOne + partTwo;
            if(sum == num) return true;
        }
        return false;
    }
    public static void main(String[] args) {
        KaprekarNumber kn = new KaprekarNumber();
        int num = kn.getInput();
        if(kn.isKaprekar(num)) kn.print(num + " is Kaprekar number");
        else kn.print(num + " is not a Kaprekar number");
    }
}
