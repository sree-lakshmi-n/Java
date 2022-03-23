// Group Assignment
// https://www.codechef.com/START31D/problems/GROUPASSGN
package com.codechef.starters31;

import java.util.Scanner;

public class GroupAssignment {
    public static void main(String[] args) throws java.lang.Exception {
        try{
            Scanner sc = new Scanner(System.in);
            int t = sc.nextInt();
            for (int i = 0; i < t; i++) {
                int n = sc.nextInt();
                int x = sc.nextInt();
                System.out.println(2*n-x+1);
            }
        }catch (Exception e){
            return;
        }
    }
}