// Returns the nth fibonacci number
package com.dsa.recursion;

public class FibonacciNum {
    public int fibonacci(int n) {
        if(n==0 || n==1) return n;
        return fibonacci(n-1)+fibonacci(n-2);
    }
    public static void main(String[] args) {
        FibonacciNum fs = new FibonacciNum();
        for (int i = 0; i <= 15; i++) {
            System.out.println("fibonacci("+i+") = "+fs.fibonacci(i));
        }
    }
}