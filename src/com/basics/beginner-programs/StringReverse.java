// Reverses the given dtring without using the inbuilt function.

package com.basics.beginnerprograms;

import java.util.Scanner;

public class StringReverse {
    public String reverseGivenString(String input){
        char[] charArray = convertToCharArr(input);
        String reversedString = "";
        for (int i = charArray.length - 1; i >= 0 ; i--) {
            reversedString += charArray[i];
        }
        return reversedString;
    }
    public char[] convertToCharArr(String str){
        //Method 1
        char[] arr = new char[str.length()];
        for (int i = 0; i < str.length(); i++) {
            arr[i] = str.charAt(i);
        }

        //Method 2
        /*
         * char[] arr = str.toCharArray();
         * */
        return arr;
    }

    public static void main(String[] args) {
        StringReverse sr = new StringReverse();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string");
        String input = sc.next();
        System.out.println("Reversed String: "+sr.reverseGivenString(input));
    }
}
