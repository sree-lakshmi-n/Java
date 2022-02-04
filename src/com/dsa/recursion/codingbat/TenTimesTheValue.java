/*
* Given an array of ints, compute recursively if the array contains somewhere a
* value followed in the array by that value times 10. We'll use the convention
* of considering only the part of the array that begins at the given index.
* In this way, a recursive call can pass index+1 to move down the array.
* The initial call will pass in index as 0.
* */
package com.dsa.recursion.codingbat;

public class TenTimesTheValue {
    public boolean array220(int[] nums, int index) {
        if(nums.length<=1 || index == nums.length-1) return false;
        if(nums[index+1]==10*nums[index]) return true;
        return array220(nums,index+1);
    }
    public static void main(String[] args) {
        TenTimesTheValue tn = new TenTimesTheValue();
        System.out.println(tn.array220(new int[]{1, 2, 20},0));
        System.out.println(tn.array220(new int[]{3, 30},0));
        System.out.println(tn.array220(new int[]{3},0));
        System.out.println(tn.array220(new int[]{},0));
        System.out.println(tn.array220(new int[]{3, 3, 30, 4},0));
        System.out.println(tn.array220(new int[]{2, 19, 4},0));
        System.out.println(tn.array220(new int[]{20, 2, 21},0));
        System.out.println(tn.array220(new int[]{20, 2, 21, 210},0));
        System.out.println(tn.array220(new int[]{2, 200, 2000},0));
        System.out.println(tn.array220(new int[]{0, 0},0));
        System.out.println(tn.array220(new int[]{1, 2, 3, 4, 5, 6},0));
        System.out.println(tn.array220(new int[]{1, 2, 3, 4, 5, 50, 6},0));
        System.out.println(tn.array220(new int[]{1, 2, 3, 4, 5, 51, 6},0));
        System.out.println(tn.array220(new int[]{1, 2, 3, 4, 4, 50, 500, 6},0));
    }
}