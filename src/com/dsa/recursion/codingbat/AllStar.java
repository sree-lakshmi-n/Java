/*
* Given a string, compute recursively a new string
* where all the adjacent chars are now separated by a "*".
 * */
package com.dsa.recursion.codingbat;

public class AllStar {
    public String allStar(String str) {
        if(str.length()<=1) return str;
        return str.charAt(0)+"*"+allStar(str.substring(1));
    }
    public static void main(String[] args) {
        AllStar star = new AllStar();
        String[] test = {"hello","abc","ab","a","","3.14","1234","Chocolate"};
        for (String str :test) {
            System.out.println(str + " -> " + star.allStar(str));
        }
    }
}