// Constructor and method overloading

package com.basics.arrays;

import java.util.Arrays;

public class ArraySum {
    private int[] arrVariable;
    // Constructor Overloading
    public ArraySum(){
        this.arrVariable = new int[]{1,2,3,4,5};
    }
    public ArraySum(int size){
        this.arrVariable = new int[size];
    }
    public ArraySum(int[] arr){
        this.arrVariable = arr;
    }

    /* Sum function */
    private int sum(int[] arr){
        int sum = 0;
        for (int i: arr) {
            sum += i;
        }
        return sum;
    }

    // Method Overloading
    public int arrSum(){
        return sum(this.arrVariable);
    }
    public int arrSum(int[] arr){
        return sum(arr);
    }
    public int arrSum(ArraySum arr){
        int total = this.arrSum() + arr.arrSum();
        return total;
    }

    /* Display Functions */
    public void printArr(){
        System.out.println(Arrays.toString(this.arrVariable));
    }
    public void print(Object result){
        System.out.println(result);
    }

    public static void main(String[] args) {
        ArraySum ao = new ArraySum();
        ao.printArr();
        int[] arr = new int[]{4,5,6,7,8};

        ao.print(ao.arrSum());  // Gives sum of arrVariable
        ao.print(ao.arrSum(arr));  // Gives sum of arr

        ArraySum a1 = new ArraySum(arr);
        a1.print(ao.arrSum(a1.arrVariable));    // Gives sum of arr
        a1.print(a1.arrSum(ao.arrVariable));    // Gives sum of arrVariable

        ao.print("****************");

        ao.print(ao.arrSum());
        ao.print(a1.arrSum());
        ao.print(ao.arrSum(a1)); //We are adding this class's (own class's)
        // arrSum and user given class's arrSum and returning total.
    }
}
