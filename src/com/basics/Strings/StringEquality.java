package com.basics.Strings;

public class StringEquality {
    public static void main(String[] args) {
        String str = "Hello";
        String str1 = str;
        String str2 = "Hello";
        String str3 = new String("Hello");
        // new keyword creates a new String object whose reference will be stored
        // in the String variable.
        // Hence, str == str3 is false because str3 has a different address.
        System.out.println("Using == \n (str == str1) -> " + (str == str1)
                + "\n (str == str2) -> " + (str == str2)
                + "\n (str == str3) -> " + (str == str3));
        // = checks the references/ addresses of the string variables.
        // If the addresses are the same, returns true.
        System.out.println("Using equals() \n str.equals(str1) -> "
                + str.equals(str1) +"\n str.equals(str2) -> " +
                str.equals(str2) +"\n str.equals(str3) -> " +
                str.equals(str3));
    }
}
