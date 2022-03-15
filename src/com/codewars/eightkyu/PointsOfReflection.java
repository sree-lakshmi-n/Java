// Finds the reflected point
//https://www.codewars.com/kata/57bfea4cb19505912900012c
package com.codewars.eightkyu;

import java.util.Arrays;

public class PointsOfReflection {
    public int[] reflectPoint(int[] p, int[] q) {
        return new int[]{2*q[0]-p[0],2*q[1]-p[1]};
    }
    public static void main(String[] args) {
        PointsOfReflection pr = new PointsOfReflection();
        System.out.println(Arrays.toString(pr.reflectPoint(new int[]{0,0}, new int[]{1,1})));
        System.out.println(Arrays.toString(pr.reflectPoint(new int[]{2,6}, new int[]{-2,-6})));
        System.out.println(Arrays.toString(pr.reflectPoint(new int[]{10, -10}, new int[]{-10, 10})));
    }
}