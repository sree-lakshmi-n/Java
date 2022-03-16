//Chef and Water Bottles
// https://www.codechef.com/START30D/problems/CHEFBOTTLE
package com.codechef.starters30;

import java.util.Scanner;

public class ChefAndWaterBottles {
    public static void main(String[] args) throws java.lang.Exception {
        try{
            Scanner sc = new Scanner(System.in);
            int t = sc.nextInt();
            for (int i = 0; i < t; i++) {
                int n = sc.nextInt();
                int x = sc.nextInt();
                int k = sc.nextInt();
                System.out.println(Math.min(n,k/x));
            }
        }catch (Exception e){
            return;
        }
    }
}