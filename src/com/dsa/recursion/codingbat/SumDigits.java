/* Finds sum of digits of given number using recursion */
package com.dsa.recursion.codingbat;

public class SumDigits {
    public int sumDigits(int n) {
        if(n==0|| n== 1) return n;
        return n%10 + sumDigits(n/10);
    }
    public static void main(String[] args) {
        SumDigits sd = new SumDigits();
        for (int i = 0; i <= 5040; i+=67) {
            System.out.println("Digit sum of "+ i +" = "+sd.sumDigits(i));
        }
    }
}
