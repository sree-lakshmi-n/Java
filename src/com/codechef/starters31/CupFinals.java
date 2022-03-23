package com.codechef.starters31;

import java.util.Collections;
import java.util.Scanner;

public class CupFinals {
    public static void main(String[] args) throws java.lang.Exception {
        try{
            Scanner sc = new Scanner(System.in);
            int t = sc.nextInt();
            for (int i = 0; i < t; i++) {
                int x = sc.nextInt();
                int y = sc.nextInt();
                int d = sc.nextInt();
                System.out.println(Math.abs(x-y)<=d? "YES":"NO");
            }
        }catch (Exception e){
            return;
        }
    }
}