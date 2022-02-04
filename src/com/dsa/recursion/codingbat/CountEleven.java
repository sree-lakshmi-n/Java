/*
* Given an array of ints, compute recursively if the array contains a 6.
* We'll use the convention of considering only the part of the array that
* begins at the given index. In this way, a recursive call can pass index+1
* to move down the array. The initial call will pass in index as 0.
 * */
package com.dsa.recursion.codingbat;

public class CountEleven {
    public int array11(int[] nums, int index) {
        if(index == nums.length) return 0;
        if(nums[index]==11) return 1 + array11(nums,index+1);
        return array11(nums,index+1);
    }
    public static void main(String[] args) {
        CountEleven fs = new CountEleven();
        System.out.println(fs.array11(new int[]{1, 2, 11},0));
        System.out.println(fs.array11(new int[]{11, 11},0));
        System.out.println(fs.array11(new int[]{1, 2, 3, 4},0));
        System.out.println(fs.array11(new int[]{1, 11, 3, 11, 11},0));
        System.out.println(fs.array11(new int[]{11, 2, 3, 4, 11, 5},0));
        System.out.println(fs.array11(new int[]{11, 5, 11},0));
        System.out.println(fs.array11(new int[]{},0));
        System.out.println(fs.array11(new int[]{11},0));
        System.out.println(fs.array11(new int[]{1},0));
    }
}