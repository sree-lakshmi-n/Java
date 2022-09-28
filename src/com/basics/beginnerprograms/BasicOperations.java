package com.basics.beginnerprograms;

import java.util.Scanner;

public class BasicOperations {
    // to check whether the given number is even or odd
    private String evenOrOdd(int num){
        return num%2==0?"even":"odd";
    }
    // to convert the temperature in Degree Centigrade to Fahrenheit
    private float CelsiusToFahrenheit(float celsius){
        return (celsius*9/5)+32;
    }
    // to find out the average of three integers
    private float getAverage(int num1, int num2, int num3){
        return (num1+num2+num3)/3;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BasicOperations bo = new BasicOperations();
        System.out.println("********* Even/Odd ***************");
        System.out.println("Enter a number: ");
        int num = sc.nextInt();
        System.out.println(bo.evenOrOdd(num));
        System.out.println("********* Celsius to Fahrenheit Converter ***************");
        System.out.println("Enter temperature in °C");
        float celsius = sc.nextFloat();
        System.out.println(celsius+"°C = "+bo.CelsiusToFahrenheit(celsius)+"F");
        System.out.println("********* Average of 3 numbers ***************");
        System.out.println("Enter first number: ");
        int num1 = sc.nextInt();
        System.out.println("Enter second number: ");
        int num2 = sc.nextInt();
        System.out.println("Enter third number: ");
        int num3 = sc.nextInt();
        System.out.println("Average: "+bo.getAverage(num1,num2,num3));
    }
}
