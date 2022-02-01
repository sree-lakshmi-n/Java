// finding square of a number using recursion
package com.dsa.recursion;

public class SquareOfNum {
    public long findSquare(long base){
        /*
        * (x-1)^2 = x^2 + 1 - 2x
        * => x^2 = (x-1)^2  + 2x - 1
        *       * */
        if(base == 1 || base == 0) return base;
        return findSquare(base-1) + 2*base - 1;
    }

    public static void main(String[] args) {
        SquareOfNum sq = new SquareOfNum();
        for (int i = 0; i <= 30; i++) {
            System.out.println(i+"\u00b2 = "+sq.findSquare(i));
        }
    }
}
