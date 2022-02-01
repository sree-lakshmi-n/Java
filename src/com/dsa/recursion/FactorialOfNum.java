// Prints factorial of numbers from 1 to 20 using recursion
package com.dsa.recursion;

public class FactorialOfNum {
    public long getFactorial(int num){
        if(num == 1 || num == 0) return 1;
        return num*getFactorial(num-1);
    }

    public static void main(String[] args) {
        FactorialOfNum fn = new FactorialOfNum();
        for (int i = 0; i <= 20 ; i++) {
            System.out.println(i+"! = "+fn.getFactorial(i));
        }
    }
}