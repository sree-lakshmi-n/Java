/*
* Find the unique number
* All numbers are equal in the array except for one.
* Program to find that unique number.
* https://www.codewars.com/kata/585d7d5adb20cf33cb000235/train/java
* */

package com.codewars.sixkyu;

import java.util.Arrays;

class UniqueNumber {
    public double uniqueNumMethodOne(double[] arr){
        double result = arr[0];
        for (int i = 1; i < arr.length; i++) {
            // If first element isn't equal to some element in the array, then either the
            // first element is the unique one or the element which is not equal to
            // the first element is unique.
            if(arr[i] != arr[0]){
                // If it's the last element, compare with previous element
                // Else, compare with succeeding element to make sure it isn't repeating.
                // If it's repeating, result remains unchanged as arr[0].
                if((i==arr.length-1 && arr[i] != arr[i-1])|| (i<arr.length-1 && arr[i] != arr[i+1])) {
                    result = arr[i];
                    break;
                }
                else if(i==arr.length-1)
                    break;
            }
        }
        return result;
    }
    public double uniqueNumMethodTwo(double[] arr){
        Arrays.sort(arr);
        if(arr[0] == arr[1])
            return arr[arr.length-1];
        else
            return arr[0];
    }
}
public class UniqueNumberTest {
    public static void main(String[] args) {
        UniqueNumber un = new UniqueNumber();
        System.out.println("Method 1");
        System.out.println(un.uniqueNumMethodOne(new double[]{0.0, 1.0, 0.0}));
        System.out.println(un.uniqueNumMethodOne(new double[]{1.0, 1.0, 1.0, 2.0, 1.0, 1.0}));
        System.out.println(un.uniqueNumMethodOne(new double[]{0.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0}));

        System.out.println("\nMethod 2");
        System.out.println(un.uniqueNumMethodTwo(new double[]{0.0, 1.0, 0.0}));
        System.out.println(un.uniqueNumMethodTwo(new double[]{1.0, 1.0, 1.0, 2.0, 1.0, 1.0}));
        System.out.println(un.uniqueNumMethodTwo(new double[]{0.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0}));
    }
}
