//Century from year
// Given a year, returns the century it is in.
// https://www.codewars.com/kata/5a3fe3dde1ce0e8ed6000097/train/java

package com.codewars.eightkyu;

public class CenturyFromYear {
    public static int century(int number) {
        return number%100==0?number/100:number/100+1;
    }

    public static void main(String[] args) {
        System.out.println("1705 -> "+century(1705));
        System.out.println("1900 -> "+century(1900));
        System.out.println("1601 -> "+century(1601));
        System.out.println("2000 -> "+century(2000));
        System.out.println("89 -> "+century(89));
    }
}
