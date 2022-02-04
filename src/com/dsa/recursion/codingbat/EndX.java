/*
* Given a string, compute recursively a new string
* where all the lowercase 'x' chars have been moved to the end of the string.
 * */
package com.dsa.recursion.codingbat;

public class EndX {
    public String endX(String str) {
        if (str.length() == 0) return str;
        if (str.charAt(0) == 'x') return endX(str.substring(1)) + 'x';
        return str.charAt(0) + endX(str.substring(1));
    }
    public static void main(String[] args) {
        EndX ex = new EndX();
        String[] test = new String[]{"xxre", "xxhixx", "xhixhix", "hiy", "h", "x", "xx", "",
                "bxx", "bxax", "axaxax", "xxhxi"};
        for (String str:test) {
            System.out.println(str+" -> " + ex.endX(str));
        }
    }
}