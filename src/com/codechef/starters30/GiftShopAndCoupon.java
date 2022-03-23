// Gift Shop and Coupon
// https://www.codechef.com/START30D/problems/GFTSHP
package com.codechef.starters30;

import java.util.Arrays;
import java.util.Scanner;

public class GiftShopAndCoupon {
    public static void main (String[] args) throws java.lang.Exception
    {
        // your code goes here
        try{
            Scanner sc = new Scanner(System.in);
            int t = sc.nextInt();
            for (int i = 0; i < t; i++) {
                int n = sc.nextInt();
                int k = sc.nextInt();
                int[] A = new int[n];
                int max = -1;
                int result = n;
                for (int j = 0; j < n; j++){
                    A[j] = sc.nextInt();
                }
                Arrays.sort(A);
                int sum = 0;
                for (int j = 0; j < n; j++){
                    if(sum + Math.ceil((float)A[j]/2) >k){
                        result = j;
                        break;
                    }
                    sum += A[j];
                }
                System.out.println(result);
            }
        }
        catch(Exception e){
            return;
        }
    }
}