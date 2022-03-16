// Chef and Chocolates
// https://www.codechef.com/START30D/problems/CHEFCHOCO
package com.codechef.starters30;

import java.util.Scanner;

public class ChefAndChocolates {
    public static void main(String[] args) throws java.lang.Exception {
        try{
            Scanner sc = new Scanner(System.in);
            int t = sc.nextInt();
            for (int i = 0; i < t; i++) {
                int c = sc.nextInt();
                int x = sc.nextInt();
                int y = sc.nextInt();
                System.out.println((c-x)*y);
            }
        }catch (Exception e){
            return;
        }
    }
}
