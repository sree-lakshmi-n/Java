/*
* Given a string, compute recursively (no loops) the number of lowercase 'x' chars in the string.
* https://codingbat.com/prob/p170371
* */
package com.dsa.recursion.codingbat;

public class CountXChars {
    public int countX(String str) {
        if(str.length()==0) return 0;
        if(str.charAt(0)=='x') return 1+countX(str.substring(1));
        return countX(str.substring(1));
    }
    public static void main(String[] args) {
        CountXChars cc = new CountXChars();
        String[] test = {"xxhixx","xhixhix","hi","h","x","","hihi","hiAAhi12hi"};
        for (String s:test) {
            System.out.println("No. of x's in "+s+": "+cc.countX(s));
        }
    }
}