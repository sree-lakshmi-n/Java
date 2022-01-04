// Displays product of all array elements

package com.basics.arrays;

import java.util.Arrays;

public class ProductOfArrayElements {
    public int calcProduct(int[] arr){
        int product = 1;
        for (int i: arr) {
            product *= i;
        }
        return product;
    }

    public static void main(String[] args) {
        ProductOfArrayElements pdt = new ProductOfArrayElements();
        int[] arr = {2,6,3,8,1};
        System.out.println("Given Array: "+ Arrays.toString(arr));
        System.out.println("Product of array elements: "+ pdt.calcProduct(arr));
    }
}
