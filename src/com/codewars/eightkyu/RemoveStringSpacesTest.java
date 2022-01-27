/*
* Remove String Spaces
* Removes the spaces from the string, then returns the resultant string.
* https://www.codewars.com/kata/57eae20f5500ad98e50002c5
* */
package com.codewars.eightkyu;

class RemoveStringSpaces {
    public static String noSpace(final String x) {
        return x.replaceAll("\\s", "");
    }
}
public class RemoveStringSpacesTest {
    public static void main(String[] args) {
        RemoveStringSpaces rm = new RemoveStringSpaces();
        System.out.println(rm.noSpace("8 j 8   mBliB8g  imjB8B8  jl  B"));
        System.out.println(rm.noSpace("8 8 Bi fk8h B 8 BB8B B B  B888 c hl8 BhB fd"));
        System.out.println(rm.noSpace("8aaaaa dddd r     "));
        System.out.println(rm.noSpace("jfBm  gk lf8hg  88lbe8 "));
        System.out.println(rm.noSpace("8j aam"));
        System.out.println(rm.noSpace("abc defg hij klm no pq rstuvw xyz"));
    }
}
