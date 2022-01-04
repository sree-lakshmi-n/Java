package com.basics.arrays;

public class CopyOddNumsInArray{
    public static void main(String[] args) {
        int[] input = {2,6,3,8,1};
        int[] output = copyOddNums(input);
        for(int i:output){
            System.out.print(i+" ");
        }
    }
    public static int[] copyOddNums(int[] input){
        int[] output = new int[2];
        int j=0;
        for (int i: input) {
            if(i%2!=0){
                output[j] = i;
                j+=1;
            }
        }
        return output;
    }
}