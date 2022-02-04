/*
* Given an array of ints, compute recursively if the array contains a 6.
* We'll use the convention of considering only the part of the array that
* begins at the given index. In this way, a recursive call can pass index+1
* to move down the array. The initial call will pass in index as 0.
 * */
package com.dsa.recursion.codingbat;

public class FindSix {
    public boolean array6(int[] nums, int index) {
        if(index == nums.length) return false;
        if(nums[index]==6) return true;
        return array6(nums,index+1);
    }
    public static void main(String[] args) {
        FindSix fs = new FindSix();
        System.out.println(fs.array6(new int[]{1, 6, 4},0));
        System.out.println(fs.array6(new int[]{1, 4},0));
        System.out.println(fs.array6(new int[]{6},0));
        System.out.println(fs.array6(new int[]{6,2,2},0));
        System.out.println(fs.array6(new int[]{},0));
        System.out.println(fs.array6(new int[]{1, 9, 4, 6, 6},0));
        System.out.println(fs.array6(new int[]{2, 5},0));
        System.out.println(fs.array6(new int[]{2, 5, 6},0));
    }
}