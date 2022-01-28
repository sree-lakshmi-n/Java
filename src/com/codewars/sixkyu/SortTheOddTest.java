/*
* Sort The Odd
* You will be given an array of numbers. You have to sort the odd numbers in
* ascending order while leaving the even numbers at their original positions.
* https://www.codewars.com/kata/578aa45ee9fd15ff4600090d/train/java
* */
package com.codewars.sixkyu;

import java.util.Arrays;

class SortTheOdd {
    public static int[] sortArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if(array[i]%2 == 0) continue;
            else{
                for (int j = i+1; j < array.length; j++) {
                    if(array[j]%2 != 0){
                        if(array[i]>array[j]){
                            int temp = array[i];
                            array[i] = array[j];
                            array[j] = temp;
                        }
                    }
                }
            }
        }
        return array;
    }
}
public class SortTheOddTest {
    public static void main(String[] args) {
        SortTheOdd sd = new SortTheOdd();
        System.out.println(Arrays.toString(new int[]{ 5, 3, 2, 8, 1, 4 })+
                " -> "+Arrays.toString(sd.sortArray(new int[]{ 5, 3, 2, 8, 1, 4 })));
        System.out.println(Arrays.toString(new int[]{ 5, 3, 1, 8, 0 })+
                " -> "+Arrays.toString(sd.sortArray(new int[]{ 5, 3, 1, 8, 0 })));
        System.out.println(Arrays.toString(new int[]{})+
                " -> "+Arrays.toString(sd.sortArray(new int[]{})));
        System.out.println(Arrays.toString(new int[]{ 0, 1, 2, 3, 4, 5, 8, 7, 6, 9 })+
                " -> "+Arrays.toString(sd.sortArray(new int[]{ 0, 1, 2, 3, 4, 5, 8, 7, 6, 9 })));
        System.out.println(Arrays.toString(new int[]{ 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 })+
                " -> "+Arrays.toString(sd.sortArray(new int[]{ 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 })));
        System.out.println(Arrays.toString(new int[]{ 1, 2, 3, 4, 5, 6, 7, 8, 9, 0 })+
                " -> "+Arrays.toString(sd.sortArray(new int[]{ 1, 2, 3, 4, 5, 6, 7, 8, 9, 0 })));
        System.out.println(Arrays.toString(new int[]{ 1, 1, 5, 11, 2, 11, 111, 0 })+
                " -> "+Arrays.toString(sd.sortArray(new int[]{1, 1, 5, 11, 2, 11, 111, 0 })));
        System.out.println(Arrays.toString(new int[]{ 2, 22, 37, 11, 4, 1, 5, 0 })+
                " -> "+Arrays.toString(sd.sortArray(new int[]{2, 22, 37, 11, 4, 1, 5, 0})));
        System.out.println(Arrays.toString(new int[]{ 1, 3, 2, 8, 5, 4, 11 })+
                " -> "+Arrays.toString(sd.sortArray(new int[]{1, 3, 2, 8, 5, 4, 11})));
    }
}
