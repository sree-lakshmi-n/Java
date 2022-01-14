/*
* Give me a Diamond
*  Return a diamond shaped string for the given number input.
* https://www.codewars.com/kata/5503013e34137eeeaa001648/train/java
* */

package com.codewars.sixkyu;

import java.util.Scanner;

public class DiamondStringTest {
    public static void main(String[] args) {
        Diamond d = new Diamond();
        System.out.println(d.print(3));
        System.out.println(d.print(5));
        System.out.println(d.print(1));
        System.out.println(d.print(2));
        System.out.println(d.print(0));
        System.out.println(d.print(-2));
        System.out.println(d.print(9));
        System.out.println("Enter a number: ");
        Scanner sc = new Scanner(System.in);
        System.out.println(d.print(sc.nextInt()));
    }
}
class Diamond {
    public static String print(int n) {
        // TODO your code here
        if(n%2 ==0 || n<=0){
            return null;
        }
        StringBuilder sb = new StringBuilder();
        for(int i=1; i<=n; i+=2){
            sb.append(" ".repeat((n-i)/2));
            sb.append("*".repeat(i));
            sb.append("\n");
        }
        for(int i=n-2; i>0; i-=2){
            sb.append(" ".repeat((n-i)/2));
            sb.append("*".repeat(i));
            sb.append("\n");
        }
        return sb.toString();
    }
}