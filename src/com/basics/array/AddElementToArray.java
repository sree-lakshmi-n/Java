package com.basics.arrays;

import java.util.Arrays;

public class AddElementToArray {
    int count = 0;
    public void add(int[] arr, int data){
        if(count < arr.length){
            arr[count] = data;
            count += 1;
            System.out.println(Arrays.toString(arr));
        }
        else{
            System.out.println("Sorry! Array is full. Can't add any more elements.");
        }
    }
    public static void main(String[] args) {
        int[] arr = new int[6];
        AddElementToArray elem = new AddElementToArray();
        elem.add(arr,7);
        elem.add(arr,8);
        elem.add(arr,9);
        elem.add(arr,10);
        elem.add(arr,11);
        elem.add(arr,12);
        elem.add(arr,7); //Won't add element
    }
}