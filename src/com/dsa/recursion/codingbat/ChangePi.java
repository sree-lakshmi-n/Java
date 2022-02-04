/*
* Given a string, compute recursively (no loops) a new string where all
* appearances of "pi" have been replaced by "3.14".
 * */
package com.dsa.recursion.codingbat;

public class ChangePi {
    public String changePi(String str) {
        if(str.length()<=1) return str;
        if(str.startsWith("pi"))
            return 3.14 + changePi(str.substring(2));
        return str.charAt(0) + changePi(str.substring(1));
    }
    public static void main(String[] args) {
        ChangePi cp = new ChangePi();
        String[] test = {"xpix","","x","p","hip","pi","pixx","xyzzy","pip","pipi"};
        for (String str : test) {
            System.out.println(str + " -> " + cp.changePi(str));
        }
    }
}