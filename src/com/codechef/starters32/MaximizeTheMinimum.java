// Maximize the Minimum
// https://www.codechef.com/START32D/problems/MAXTHEMIN
package com.codechef.starters32;

import com.basics.constructors.Arr;

import java.util.Arrays;
import java.util.Scanner;

public class MaximizeTheMinimum {
    public static void main(String[] args) throws java.lang.Exception{
        try {
            Scanner sc = new Scanner(System.in);
            int t = sc.nextInt();
            for (int i = 0; i < t; i++) {
                int n = sc.nextInt();
                int k = sc.nextInt();
                int[] A = new int[n];
                for (int j = 0; j < n; j++) {
                    A[j] = sc.nextInt();
                }
                Arrays.sort(A);
                if(k>=n)
                    System.out.println(A[n-1]);
                else {
                    System.out.println(A[k]);
                }
            }
        } catch (Exception e) {
            return;
        }
    }
}