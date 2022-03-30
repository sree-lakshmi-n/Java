// Binary String Cost
// https://www.codechef.com/START32D/problems/BSCOST
package com.codechef.starters32;

import java.util.Arrays;
import java.util.Scanner;

public class BinaryStringCost {
    public static void main(String[] args) throws java.lang.Exception{
        try {
            Scanner sc = new Scanner(System.in);
            int t = sc.nextInt();
            for (int i = 0; i < t; i++) {
                int n = sc.nextInt();
                int x = sc.nextInt();
                int y = sc.nextInt();
                String s = sc.next();
                char[] chArr = s.toCharArray();
                Arrays.sort(chArr);
                if (chArr[0]==chArr[n-1])
                    System.out.println(0);
                else
                    System.out.println(Math.min(x,y));
            }
        } catch (Exception e) {
            return;
        }
    }
}