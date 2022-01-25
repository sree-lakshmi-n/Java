package com.basics.Strings;

import java.util.Arrays;

public class StringMethods {
    public static void main(String[] args) {
        String str = "Hippopotomonstrosesquippedaliophobia";
        System.out.println(str);

        System.out.println("charAt() -> Returns the character at the specified index (position)");
        System.out.println(str.charAt(6));
        System.out.println("codePointAt() -> Returns the Unicode of the character at the specified index");
        System.out.println(str.codePointAt(0));
        System.out.println("codePointBefore() -> Returns the Unicode of the character before the specified index");
        System.out.println(str.codePointBefore(1));
        System.out.println("codePointCount() -> Returns the number of Unicode values found in a string.");
        System.out.println(str.codePointCount(0,str.length()));
        System.out.println("indexOf() -> Returns the position of the first found occurrence of specified characters in a string");
        System.out.println(str.indexOf("o"));
        System.out.println("lastIndexOf() -> Returns the position of the last found occurrence of specified characters in a string");
        System.out.println(str.lastIndexOf("o"));
        System.out.println("length() -> Returns the length of a specified string");
        System.out.println(str.length());
        System.out.println("concat() -> Appends a string to the end of another string");
        System.out.println(str.concat("********"));
        System.out.println("getBytes() -> Encodes this String into a sequence of bytes using the named charset, storing the result into a new byte array");
        System.out.println(Arrays.toString(str.getBytes()));

        System.out.println("contains() -> Checks whether a string contains a sequence of characters");
        System.out.println(str.contains("popo"));
        System.out.println("endsWith() -> Checks whether a string ends with the specified character(s)");
        System.out.println(str.endsWith("popo"));
        System.out.println("hashCode() -> Returns the hash code of a string");
        System.out.println(str.hashCode());
        System.out.println("isEmpty() -> Checks whether a string is empty or not");
        System.out.println(str.isEmpty());
        System.out.println("valueOf() -> Returns the string representation of the specified value");
        System.out.println(str.valueOf(12));
        System.out.println("copyValueOf() -> Returns a String that represents the characters of the character array");
        System.out.println(str.copyValueOf(new char[]{'q','w','e','r','t','y'}));

        String s1 = "A";
        String s2 = "A";
        String s3 = new String("A");
        String s4 = "a";
        System.out.println( "== operator -> Used to compare two or more than two objects' references");
        System.out.println(s1==s2);
        System.out.println(s1==s3);
        System.out.println(s1==s4);
        System.out.println( ".equals() -> Compares the two given strings based on the data/content of the strings");
        System.out.println(s1.equals(s2));
        System.out.println(s1.equals(s3));
        System.out.println(s1.equals(s4));
        System.out.println( ".equalsIgnoreCase() -> Compares two strings, ignoring case considerations");
        System.out.println(s1.equalsIgnoreCase(s2));
        System.out.println(s1.equalsIgnoreCase(s3));
        System.out.println(s1.equalsIgnoreCase(s4));
        /*
        * The java compare two string is based on the Unicode value of each character in the strings.
        * If two strings are different, then they have different characters at some index that is a
        * valid index for both strings, or their lengths are different, or both.
        * Assuming index ‘i’ is where characters are different then compareTo() will return
        * firstString.charAt(i)-secondString.charAt(i).
        * */
        System.out.println("compareTo() -> Compares two strings lexicographically");
        System.out.println(s1.compareTo(s2)); // Returns 0 as they've same ASCII value
        System.out.println(s1.compareTo(s3)); // Returns 0 as they've same ASCII value
        System.out.println(s1.compareTo(s4)); // Returns -32 as they've diff ASCII value
        System.out.println("compareToIgnoreCase() -> Compares two strings lexicographically, ignoring case differences");
        System.out.println(s1.compareToIgnoreCase(s2)); // Returns 0 as they've same ASCII value
        System.out.println(s1.compareToIgnoreCase(s3)); // Returns 0 as they've same ASCII value
        System.out.println(s1.compareToIgnoreCase(s4)); // Returns -32 as they've diff ASCII value

        String sample = "Hello World";
        System.out.println("regionMatches() -> Tests if two string regions are equal");
        /*
        * public boolean regionMatches(int toffset, String other, int ooffset, int len)
        * public boolean regionMatches(boolean ignoreCase, int toffset, String other, int ooffset, int len)
        *     ignoreCase: if true, ignore the case when comparing characters.
        *     toffset: the starting offset of the subregion in this string.
        *     other: the string argument being compared.
        *     ooffset: the starting offset of the subregion in the string argument.
        *     len: the number of characters to compare.
        * https://www.geeksforgeeks.org/how-to-match-regions-in-strings-in-java/
        * */
        System.out.println(sample.regionMatches(0,"hello",0,5));
        System.out.println(sample.regionMatches(true,0,"hello",0,5));

        System.out.println("contentEquals() -> Checks whether a string contains the exact same sequence of characters of the specified CharSequence or StringBuffer");
        System.out.println(sample.contentEquals("Hello World"));
        System.out.println(sample.contentEquals("Hello"));
        System.out.println(sample.contentEquals("hello"));
    }
}
