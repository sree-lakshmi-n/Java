// Displays average of all array elements

package com.basics.arrays;

import java.util.Arrays;

public class AverageOfArrayElements {
    public float calcAvg(int[] arr){
        int sum = 0;
        for (int i: arr) {
            sum += i;
        }
        float avg = (float)sum/ arr.length;
        return avg;
    }

    public static void main(String[] args) {
        AverageOfArrayElements avg = new AverageOfArrayElements();
        int[] arr = {2,3,0,2,8};
        System.out.println("Given Array: "+ Arrays.toString(arr));
        System.out.println("Average of array elements: "+avg.calcAvg(arr));
    }
}
