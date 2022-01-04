// Checks whether given number is prime or not.

package com.basics.beginnerprograms;

import java.util.Scanner;

public class PrimeNumber{
    private boolean isPrime(int num){
        boolean result = true;
        for (int i = 2; i < (num/2) + 1; i++) {
            if(num%i==0){
                result = false;
                break;
            }
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PrimeNumber p = new PrimeNumber();
        System.out.println("Enter a number: ");
        int num = Math.abs(sc.nextInt());
        if(num==0||num==1){
            System.out.println(num+ " is neither prime nor composite.");
        }
        else{
            System.out.println(p.isPrime(num)?num+" is prime":num+" is not prime.");
        }
    }
}