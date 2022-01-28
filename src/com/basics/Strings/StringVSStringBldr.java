/*
* Illustrates difference in processing time of String v/s StringBuilder
* when subjected to multiple additions/ editing.
* */
package com.basics.Strings;

public class StringVSStringBldr {
    public static void main(String[] args) {
        String str = "";
        StringBuilder sb = new StringBuilder();
        long strStart = System.currentTimeMillis();
        for (int i = 0; i<100000; i++){
            str += "a";
        }
        long strEnd = System.currentTimeMillis();
        System.out.println("Timen taken by String: "+(strEnd-strStart)/60);
        long sbStart = System.currentTimeMillis();
        for (int i = 0; i<100000; i++){
            sb.append("a");
        }
        long sbEnd = System.currentTimeMillis();
        System.out.println("Timen taken by StringBuilder: "+(sbEnd-sbStart)/60);
    }
}
