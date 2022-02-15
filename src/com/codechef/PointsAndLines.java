/*
Points and Lines
* https://www.codechef.com/START25C/problems/POLIN
* */

package com.codechef;

import java.util.HashSet;
import java.util.Scanner;

public class PointsAndLines {
    public static int noOfDistinctLines(int[] x, int[] y){
        HashSet<Integer> distinctX = new HashSet<>();
        HashSet<Integer> distinctY = new HashSet<>();
        for (int i = 0; i < x.length; i++) {
            if(!distinctX.contains(x[i]))
                distinctX.add(x[i]);
            if(!distinctY.contains(y[i]))
                distinctY.add(y[i]);
        }
        return distinctX.size()+distinctY.size();
    }
    public static void main (String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no. of testcases");
        int t = sc.nextInt();
        for (int i = 0; i < t; i++){
            System.out.println("Enter no. of points");
            int n = sc.nextInt();
            int[] x = new int[n];
            int[] y = new int[n];
            System.out.println("Enter x and y coordinates with a space in between");
            for (int j = 0; j < n; j++) {
                x[j] = sc.nextInt();
                y[j] = sc.nextInt();
            }
            System.out.println("No. of distinct lines -> "+noOfDistinctLines(x,y));
        }
    }
}
