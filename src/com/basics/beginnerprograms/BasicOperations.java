package com.basics.beginnerprograms;

import java.util.Scanner;

public class BasicOperations {
    // to check whether the given number is even or odd
    private String evenOrOdd(int num){
        return num%2==0?"even":"odd";
    }
    // to convert the temperature in Degree Centigrade to Fahrenheit
    private int CelsiusToFarenheit(int celsius){
        return celsius*(9/5)+32;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BasicOperations bo = new BasicOperations();
        System.out.println("Enter a number: ");
        int num = sc.nextInt();
        System.out.println(bo.evenOrOdd(num));
    }
}
