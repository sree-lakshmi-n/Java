// Equal sides of an array: https://www.codewars.com/kata/5679aa472b8f57fb8c000047
// Finds the index, if any, which splits the given array to equal sum parts

package com.codewars;

import java.util.Arrays;

class EqualSidesOfAnArray {
    // Returns string representation of array
    public String getArr(int[] arr){
        return Arrays.toString(arr);
    }
    // Splits given array into two, to the left and right of given pos. Excludes pos.
    private Object[] splitArr(int[] arr, int pos){
        int[] partOne = new int[pos];
        int[] partTwo = new int[arr.length - pos - 1]; // To exclude value at pos
        for(int i=0; i<partOne.length; i++){
            partOne[i] = arr[i];
        }
        for(int i = 0; i< partTwo.length; i++){
            partTwo[i] = arr[pos+i+1]; // To exclude value at pos
        }
        return new Object[]{partOne, partTwo};
    }
    // Returns sum of given array
    private int arrSum(int[] arr){
        int sum = 0;
        for (int item:arr) {
            sum += item;
        }
        return sum;
    }
    // Checks whether arraysum of two arrays are equal
    private boolean isArrSumEqual(int[] arr1, int[] arr2){
        if (arrSum(arr1) == arrSum(arr2))
            return true;
        return false;
    }
    // Checks whether an array has equal sum parts
    public int findEvenIndex(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            Object[] obj = splitArr(arr,i);
            int[] partOne = (int[]) obj[0];
            int[] partTwo = (int[]) obj[1];
            if (isArrSumEqual(partOne,partTwo)){
                return i;
            }
        }
        return -1;
    }
}
public class EqualSidesOfAnArrayTest{
    // Driver function
    public static void main(String[] args) {
        int[] arr1 = {35,15,10,10,-80,10,20};
        int[] arr2 = {20,10,-80,10,10,15,35};
        int[] arr3 = {1,2,3,4,3,2,1};
        int[] arr4 = {1,100,50,-51,1,1};
        int[] arr5 = {1,2,3,4,5,6};

        EqualSidesOfAnArray eq = new EqualSidesOfAnArray();

        for (int[] eqarr : Arrays.asList(arr1, arr2, arr3,arr4,arr5)) {
            int result = eq.findEvenIndex(eqarr);
            if(result >= 0){
                System.out.println("The index which splits array, "+ eq.getArr(eqarr)+
                        " to equal sum parts is: " + eq.findEvenIndex(eqarr));
            }
            else
                System.out.println("No index found which splits given array, " +
                        eq.getArr(eqarr) + " to equal sum parts");
        }
    }
}