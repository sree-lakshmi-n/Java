// Returns the count of vowels in a given string
// https://www.codewars.com/kata/54ff3102c1bad923760001f3
package com.codewars.sevenkyu;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class VowelCount {
    public static int getCount(String str) {
        List<Character> vowels = new ArrayList<>(Arrays.asList('a', 'e', 'i', 'o', 'u'));
        return (int)str.toLowerCase().chars().filter(ch -> vowels.contains((char)ch)).count();

        /*
        * Other methods from codewars:
        * 1.return str.replaceAll("(?i)[^aeiou]", "").length();
        * 2.return (int) str.chars().filter(c -> "aeiou".indexOf(c) >= 0).count();
         *3. return str.replaceAll("[^aeiou]","").length();
         * 4. (int)str.chars().mapToObj(i -> (char)i).filter(i -> "aeiou".contains(String.valueOf(i))).count();
        * */
    }

    public static void main(String[] args) {
        System.out.println(getCount("aeiou"));
        System.out.println(getCount("abracadabra"));
        System.out.println(getCount("Nope"));
        System.out.println(getCount(""));
    }
}
