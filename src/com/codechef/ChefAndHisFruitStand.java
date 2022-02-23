/*
* Chef and His Fruit Stand
* https://www.codechef.com/START25C/problems/FRUITCHAAT
* */

package com.codechef;

import java.util.Scanner;

public class ChefAndHisFruitStand
{
    public int getNumOfFruitChaats(int x, int y){
        return Math.min(x/2,y);
    }
    public static void main (String[] args) throws java.lang.Exception
    {
        try{
            ChefAndHisFruitStand hcf = new ChefAndHisFruitStand();
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter number of testcases");
            int t = sc.nextInt();
            System.out.println("Enter no. of bananas and apples respectively with a space in between");
            for(int i=0; i<t; i++){
                int bananas = sc.nextInt();
                int apples = sc.nextInt();
                System.out.println("No. of fruit chaats -> "+hcf.getNumOfFruitChaats(bananas,apples));
            }
        }catch(Exception e){
            return;
        }
    }
}
