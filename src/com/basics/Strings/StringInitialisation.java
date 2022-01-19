package com.basics.Strings;

public class StringInitialisation {
    public static void main(String[] args) {
        String s1 = "Hello";
        char[] data = {'H','e','l','l','o'};
        String s2 = new String(data);
        byte[] values = {72,101,108,108,111};
        String s3 = new String(values);
        System.out.println(s1+" "+s2+" "+s3);
    }
}
