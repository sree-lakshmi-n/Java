/*
* Given a string, compute recursively a new string where all the 'x' chars have been removed.
 * */
package com.dsa.recursion.codingbat;

public class NoX {
    public String noX(String str) {
        if(str.length()<1) return "";
        if(str.charAt(0) == 'x') return noX(str.substring(1));
        return str.charAt(0) + noX(str.substring(1));
    }
    public static void main(String[] args) {
        NoX nx = new NoX();
        String[] test = {"ab","Hellox","axxbxx","","xx","abc","xaxb"};
        for (String str:test) {
            System.out.println(str + " -> " + nx.noX(str));
        }
    }
}