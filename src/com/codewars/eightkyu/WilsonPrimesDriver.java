package com.codewars.eightkyu;

class WilsonPrimes {
    public static boolean am_i_wilson(double n) {
        //your code here
        return n==5||n==13||n==563;
    }
}
public class WilsonPrimesDriver {
    public static void main(String[] args) {
        System.out.println(WilsonPrimes.am_i_wilson(563));
    }
}