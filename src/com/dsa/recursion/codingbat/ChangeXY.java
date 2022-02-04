/*
* Given a string, compute recursively (no loops)
* a new string where all the lowercase 'x' chars have been changed to 'y' chars.
* */
package com.dsa.recursion.codingbat;

public class ChangeXY {
    public String changeXY(String str) {
        if(str.equals("")) return str;
        if(str.charAt(0) == 'x')
            return changeXY('y'+ str.substring(1));
        return str.charAt(0)+changeXY(str.substring(1));
    }
    public static void main(String[] args) {
        ChangeXY xy = new ChangeXY();
        String[] test = {"codex","","h","x","xxx","hihi","hiy","yyhxyi","xhixhix","xxhixx"};
        for (String s: test) {
            System.out.println(s + " -> "+ xy.changeXY(s));
        }
    }
}