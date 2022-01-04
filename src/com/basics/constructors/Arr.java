package com.basics.constructors;

import java.util.Arrays;

public class Arr {
    private int[] ar;
    public Arr(){
        this.ar = new int[]{1,2,3,4};
    }
    public Arr(int size){
        this.ar = new int[size];
    }
    public Arr(int[] arr){
        this.ar = arr;
    }
    public int getSum(int[] arr){
        int sum = 0;
        for (int i: arr) {
            sum += i;
        }
        return sum;
    }
    private int arrSum(){
        return getSum(this.ar);
    }
    private int arrSum(int[] arr){
        return getSum(arr);
    }
    public void disp(Object result){
        System.out.println(result);
    }
    public static void main(String[] args) {
        Arr ar1 = new Arr();
        ar1.disp(Arrays.toString(ar1.ar));
        ar1.disp(ar1.arrSum());
        int[] newArr = new int[]{4,5,6,7,8,9};
        ar1.disp(ar1.arrSum(newArr));
        Arr ar2 = new Arr(6);
        ar2.disp(Arrays.toString(ar2.ar));
        Arr ar3 = new Arr(new int[]{4,5,6,7,8});
        ar3.disp(Arrays.toString(ar3.ar));
        ar1.disp(ar1.arrSum(ar3.ar));
    }
}
