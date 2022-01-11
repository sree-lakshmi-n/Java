/*
* Simple Pig Latin
* Move the first letter of each word to the end of it,
* then add "ay" to the end of the word. Leave punctuation marks untouched.
 * https://www.codewars.com/kata/520b9d2ad5c005041100000f
* */

package com.codewars;

public class SimplePigLatinTest {
    public static void main(String[] args) {
        SimplePigLatin pig = new SimplePigLatin();
        System.out.println(pig.pigIt("Pig latin is cool"));
        System.out.println(pig.pigIt("Hello world !"));
    }
}
class SimplePigLatin{
    private static boolean isSpecial(char ch){
        if(Character.isDigit(ch)||Character.isLetter(ch)||Character.isWhitespace(ch))
            return false;
        return true;
    }
    public static String pigIt(String str) {
        // Write code here
        StringBuilder sb = new StringBuilder();
        String[] strArr = str.split(" ");
        for(String s: strArr){
            if(isSpecial(s.charAt(0))){
                sb.append(s.charAt(0)+" ");
                continue;
            }
            s = s.substring(1) + s.charAt(0) + "ay";
            sb.append(s + " ");
        }
        return sb.toString().trim();
    }
}