/*
* Shopping Change
* https://www.codechef.com/START27D/submit/SHOPCHANGE
* */

package com.codechef.starters27;
import java.util.Scanner;

public class ShoppingChange {
    public static void main (String[] args) throws java.lang.Exception {
        try{
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter no. of testcases: ");
            int t = sc.nextInt();
            for(int i = 0; i < t; i++){
                System.out.println("Enter the total price of items Chef purchased: ");
                int x = sc.nextInt();
                System.out.println("The money Chef has to receive back: "+(100-x));
            }
        }catch(Exception e){
            return;
        }
    }
}
