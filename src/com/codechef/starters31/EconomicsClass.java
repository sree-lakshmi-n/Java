// Economics Class
// https://www.codechef.com/START31D/problems/ECOCLASS
package com.codechef.starters31;

import java.util.Scanner;

public class EconomicsClass {
    public static void main(String[] args) throws java.lang.Exception {
        try{
            Scanner sc = new Scanner(System.in);
            int t = sc.nextInt();
            for (int i = 0; i < t; i++) {
                int n = sc.nextInt();
                int[] s = new int[n];
                int[] d = new int[n];
                int count = 0;
                for (int j = 0; j < n; j++) {
                    s[j] = sc.nextInt();
                }
                for (int j = 0; j < n; j++) {
                    d[j] = sc.nextInt();
                }
                for (int j = 0; j < n; j++) {
                    if(s[j] == d[j])
                        count += 1;
                }
                System.out.println(count);
            }
        }catch (Exception e){
            return;
        }
    }
}