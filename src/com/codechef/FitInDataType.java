/*
Fit in Data Type
* https://www.codechef.com/START25C/problems/DATATYPE
* */
package com.codechef;

import java.util.Scanner;

public class FitInDataType {
    public int memoryVal(int n, int x){
        if(x<=n) return x;
        return (x-n)%n-1;
    }
    public static void main(String[] args) {
        try{
            FitInDataType dt = new FitInDataType();
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter number of testcases");
            int t = sc.nextInt();
            int[] res = new int[t];
            System.out.println("Enter the maximum value of your data type and then " +
                    "the value you want to store with a space in between.");
            for(int i=0; i<t; i++){
                System.out.println("============\nTestcase "+(i+1));
                int n = sc.nextInt();
                int x = sc.nextInt();
                System.out.println("Result -> "+ dt.memoryVal(n,x));
            }
        }catch(Exception e){
            return;
        }
    }
}
