package com.basics.beginnerprograms;

import java.util.Scanner;

public class BasicOperations {
    private String evenOrOdd(int num){
        return num%2==0?"even":"odd";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BasicOperations bo = new BasicOperations();
        System.out.println("Enter a number: ");
        int num = sc.nextInt();
        System.out.println(bo.evenOrOdd(num));
    }
}
