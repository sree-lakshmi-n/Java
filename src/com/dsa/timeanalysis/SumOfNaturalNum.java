/*
 Time analysis comparison for different methods of finding sum
 of natural numbers upto given number
*/
package com.dsa.timeanalysis;

public class SumOfNaturalNum {
    // Iterative Method
    public long getSumMethodOne(int n){
        long sum = 0;
        for (int i = 1; i <= n ; i++) {
            sum += i;
        }
        return sum;
    }
    // Recursive Method
    public long getSumMethodTwo(int n){
        if(n == 0 || n == 1) return n;
        return n + getSumMethodTwo(n-1);
    }
    // Formula Method
    public long getSumMethodThree(int n){
        return (long)n*(n+1)/2;
    }
    public static void main(String[] args) {
        SumOfNaturalNum sn = new SumOfNaturalNum();
        long start1 = System.currentTimeMillis();
        System.out.println(sn.getSumMethodOne(10000));
        long end1 = System.currentTimeMillis();
        System.out.println("Iterative Method -> "+(end1-start1)+"ms");
        long start2 = System.currentTimeMillis();
        System.out.println(sn.getSumMethodTwo(10000));
        long end2 = System.currentTimeMillis();
        System.out.println("Recursive Method -> "+(end2-start2)+"ms");
        long start3 = System.currentTimeMillis();
        System.out.println(sn.getSumMethodThree(10000));
        long end3 = System.currentTimeMillis();
        System.out.println("Formula Method -> "+(end3-start3)+"ms");
    }
}
