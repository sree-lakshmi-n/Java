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
                int result = 0;
                for (int j = 0; j < n; j++){
                    A[j] = sc.nextInt();
                }
                Arrays.sort(A);
                int sum = 0;
                for (int j = 0; j < n; j++){
                    sum += A[j];
                    result = j;
                    if(sum > k){
                        result--;
                        sum -= A[j]/2;
                        if(sum <=k)
                            result++;
                        break;
                    }

                }
                System.out.println(result+1);
            }
        }
        catch(Exception e){
            return;
        }
    }
}