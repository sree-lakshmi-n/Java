// Displays sum of all array elements

package com.basics.arrays;

import java.util.Arrays;

public class SumOfNumbersInArray {
    public int getSum(int[] arr){
        int sum = 0;
        for (int i: arr) {
            sum += i;
        }
        return sum;
    }
    public void display(Object result){
        System.out.println(result);
    }
    public static void main(String[] args) {
        SumOfNumbersInArray sum = new SumOfNumbersInArray();
        int[] arr = {1,2,3,4,5};
        sum.display("Given array: " + Arrays.toString(arr));
        sum.display("Sum of array elements: "+ sum.getSum(arr));
    }
}