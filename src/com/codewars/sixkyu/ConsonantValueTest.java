/*
* Consonant Value
* Given a lowercase string that has alphabetic characters only
* and no spaces, return the highest value of consonant substrings.
* https://www.codewars.com/kata/59c633e7dcc4053512000073/train/java
 * */
package com.codewars.sixkyu;

import java.util.*;

class ConsonantValue {
    /* Method 1*/
    private static int getValue(char key){
        Map<Character,Integer> map = new HashMap<>();
        char ch = 'a';
        for (int i = 1; i <= 26; i++) {
            map.put(ch,i);
            ch+=1;
        }
        return map.get(key);
    }
    private static String[] getConsonantArr(String str) {
        String[] consonantArr = str.split("[AaEeIiOoUu]");
        consonantArr = Arrays.stream(consonantArr).
                filter(value -> value != null && value.length() > 0)
                .toArray(size -> new String[size]);
        return consonantArr;
    }
    public static int solveOne(final String s) {
        String[] consonantArr = getConsonantArr(s);
        int result = 0;
        int sum = 0;
        for (String subArr:consonantArr) {
            for (int i = 0; i < subArr.length(); i++) {
                sum += getValue(subArr.charAt(i));
            }
            if(sum>result){
                result = sum;
            }
            sum = 0;
        }
        return result;
    }
    /* Method 2*/
    public static int solveTwo(final String s) {
        int sum = 0, maxsum = 0;
        char[] arr = s.toCharArray();
        for (char c : arr) {
            if ("aeiou".indexOf(c)>=0) sum = 0;
            else {
                sum += c-'a'+1;
                maxsum = Math.max(sum, maxsum);
            }
        }
        return maxsum;
    }
}
public class ConsonantValueTest{
    public static void main(String[] args) {
        ConsonantValue cv = new ConsonantValue();
        System.out.println(cv.solveOne("chruschtschov"));
        System.out.println(cv.solveOne("zodiac"));
        System.out.println(cv.solveOne("khrushchev"));
        System.out.println(cv.solveOne("strength"));
        System.out.println(cv.solveOne("catchphrase"));
        System.out.println(cv.solveOne("twelfthstreet"));
        System.out.println(cv.solveOne("mischtschenkoana"));
        System.out.println(cv.solveOne("fmgvwcydbdmcktxj"));
        System.out.println(cv.solveOne("wvrt"));
        System.out.println(cv.solveOne("fizzbuzzy"));

        System.out.println(cv.solveOne("chruschtschov"));
        System.out.println(cv.solveOne("zodiac"));
        System.out.println(cv.solveOne("khrushchev"));
        System.out.println(cv.solveOne("strength"));
        System.out.println(cv.solveOne("catchphrase"));
        System.out.println(cv.solveOne("twelfthstreet"));
        System.out.println(cv.solveOne("mischtschenkoana"));
        System.out.println(cv.solveOne("fmgvwcydbdmcktxj"));
        System.out.println(cv.solveOne("wvrt"));
        System.out.println(cv.solveOne("fizzbuzzy"));
    }
}