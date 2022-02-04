/*
* Given a string, compute recursively a new string where
* identical chars that are adjacent in the original string
* are separated from each other by a "*".
 * */
package com.dsa.recursion.codingbat;

public class PairStar {
    public String pairStar(String str) {
        if(str.length()<=1) return str;
        if(str.charAt(0) == str.charAt(1))
            return str.charAt(0)+"*"+pairStar(str.substring(1));
        return   str.charAt(0)+pairStar(str.substring(1));
    }
    public static void main(String[] args) {
        PairStar ps = new PairStar();
        String[] test = {"hello","nonadjacent","abba","abbba","aaaa","aaab","a","","xxyy","hello"};
        for (String str:test) {
            System.out.println(str + " -> " + ps.pairStar(str));
        }
    }
}