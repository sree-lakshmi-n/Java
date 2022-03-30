// Finding Shoes
// https://www.codechef.com/START32D/problems/FINDSHOES
package com.codechef.starters32;

import java.util.Scanner;

public class FindingShoes {
    public static void main(String[] args) throws java.lang.Exception {
        try {
            Scanner sc = new Scanner(System.in);
            int t = sc.nextInt();
            for (int i = 0; i < t; i++) {
                int n = sc.nextInt();
                int m = sc.nextInt();
                if (n <= m)
                    System.out.println(n);
                else
                    System.out.println(2 * n - m);
            }
        } catch (Exception e) {
            return;
        }
    }
}