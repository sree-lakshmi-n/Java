package com.basics.Strings;

public class StringImmutability {
    public static void main(String[] args) {
        // Immutability of Strings
        String str = "Hello";  // m/y address, say 444
        str = str.concat("World"); // m/y address becomes diff, say 690
        str = "Hi"; //m/y address changes to say, 1000
        /*
         * String only stores last updated reference of the string.
         * Previous references are lost. JVM reallocates m/y for unused references.
         * => String is not preferred in applns where string needs to be
         * continuously altered/ modified.
         * Use StringBuilder or StringBuffer for such applns.
         * */

        final int num = 16;
        // final makes a variable constant
        // In java, String class is defined as final. Hence, strings are immutable.
        // We can't change the value of something declared as final.
//        System.out.println(num++); // throws 'cannot assign a value to final variable num' error
    }
}