// Course Registration
// https://www.codechef.com/START32D/problems/COURSEREG

package com.codechef.starters32;

import java.util.Scanner;

public class CourseRegistration {
    public static void main(String[] args) throws java.lang.Exception{
        try{
            Scanner sc = new Scanner(System.in);
            int t = sc.nextInt();
            for (int i = 0; i < t; i++) {
                int n = sc.nextInt();
                int m = sc.nextInt();
                int k = sc.nextInt();
                if(n+k<=m)
                    System.out.println("Yes");
                else
                    System.out.println("No");
            }
        }catch (Exception e){
            return;
        }
    }
}