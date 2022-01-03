// Returns sum of digits of the given number

package com.basics.beginnerprograms;

import java.util.Scanner;

public class SumOfDigits {
    public int getInput(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = sc.nextInt();
        return num;
    }
    public int calcSumOfDigits(int num){
        int sum = 0;
        if(num==0){
            return 0;
        }
        while(num>0){
            sum+=num%10;
            num/=10;
        }
        return sum;
    }
    public void display(Object result){
        System.out.println(result);
    }
    public static void main(String[] args) {
        SumOfDigits sd = new SumOfDigits();
        int num = sd.getInput();
        if(num>=0){
            sd.display("The Sum of Digits of "+ num + " is "+sd.calcSumOfDigits(num));
        }
        else{
            sd.display("Enter a valid number");
        }
    }
}