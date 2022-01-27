/*
* Sum of positive
* You get an array of numbers, return the sum of all of the positives ones.
* Note: if there is nothing to sum, the sum is default to 0.
* https://www.codewars.com/kata/5715eaedb436cf5606000381
 * */
package com.codewars.eightkyu;

import java.util.*;

class SumOfPositive{
    public static int sum(int[] arr){
        return Arrays.stream(arr).filter(i -> i > 0).reduce(0, (a, b) -> a + b);
    }
}

public class SumOfPositiveTest {
    public static void main(String[] args) {
        SumOfPositive sp = new SumOfPositive();
        System.out.println(sp.sum(new int[]{1,2,3,4,5}));  //15
        System.out.println(sp.sum(new int[]{1,-2,3,4,5}));  // 13
        System.out.println(sp.sum(new int[]{}));    // 0
        System.out.println(sp.sum(new int[]{-1,-2,-3,-4,-5}));  // 0
        System.out.println(sp.sum(new int[]{-1,2,3,4,-5}));   // 9
    }
}
