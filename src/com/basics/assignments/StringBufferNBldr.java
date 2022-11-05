package com.basics.assignments;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class StringBufferNBldr {
    // 1. Java program to count number of words and duplicate words in String
    private void countWords(String str){
        String[] words = str.toLowerCase().split(" ");
        int noOfWords = words.length;
        Set<String> set = new HashSet<>();
        for (int i = 0; i < words.length-1; i++) {
            for(int j=1; j<words.length; j++){
                if(words[i].equals(words[j]) && i!=j){
                    set.add(words[i]);
                }
            }
        }
        System.out.println("Word count: "+noOfWords);
        System.out.println("Duplicate word count: "+set.size());
        return;
    }

    // 2. Java program to Merge two String Arrays and remove duplicate words
    private String[] mergeArraysRemoveDuplicates(String[] arr1, String[] arr2){
        String[] mergedArr = new String[arr1.length+ arr2.length];
        System.arraycopy(arr1,0,mergedArr,0,arr1.length);
        System.arraycopy(arr2,0,mergedArr,arr1.length,arr2.length);
        return mergedArr;
    }

    // 3. Java program to reverse a String ( 5 different ways)
    // Method 1
    private String reverseStr1(String str){
        char[] ch = str.toCharArray();
        String revstr = "";
        for (int i= ch.length-1; i>=0; i--){
            revstr += ch[i];
        }
        return revstr;
    }
    private String reverseStr1Bldr(String str){
        char[] ch = str.toCharArray();
        StringBuffer sb = new StringBuffer();
        for (int i= ch.length-1; i>=0; i--){
            sb.append(ch[i]);
        }
        return sb.toString();
    }
    private String reverseStr1Bffr(String str){
        char[] ch = str.toCharArray();
        StringBuilder sb = new StringBuilder();
        for (int i= ch.length-1; i>=0; i--){
            sb.append(ch[i]);
        }
        return sb.toString();
    }
    // Method 2
    private String reverseStr2Bldr(String str){
        StringBuilder sb = new StringBuilder(str);
        return sb.reverse().toString();
    }
    private String reverseStr2Bffr(String str){
        StringBuffer sb = new StringBuffer(str);
        return sb.reverse().toString();
    }
    // Method 3
    private String reverseStr3(String str){
        char[] ch = str.toCharArray();
        for(int left=0, right=ch.length-1;left<right;left++, right--){
            char temp = ch[left];
            ch[left] = ch[right];
            ch[right] = temp;
        }
        return String.valueOf(ch);
    }
    // Method 4
    private String reverseStr4(String str){
        char[] ch = str.toCharArray();
        for(int left=0, right=ch.length-1;left<right;left++, right--){
            char temp = ch[left];
            ch[left] = ch[right];
            ch[right] = temp;
        }
        return String.valueOf(ch);
    }

    // 5. Java program to find all permutations of a given string
    private void permutation(String prefix, String str){
        if(str.length()==0) {
            System.out.println(prefix);
            return;
        }
        else{
            for (int i = 0; i < str.length(); i++) {
                char ch = str.charAt(i);
                // Prefix = Given prefix + char at given position
                // str = whole of str other than char at given position
                permutation(prefix+ch,str.substring(0,i)+str.substring(i+1,str.length()));
            }
        }
    }

    public static void main(String[] args) {
        StringBufferNBldr sbb = new StringBufferNBldr();
        Scanner sc = new Scanner(System.in);

        System.out.println("+---------------------+");
        System.out.println("1. Java program to count number of words and duplicate words in String");
        System.out.println("+---------------------+");
        System.out.println("Enter a line");
        String str = sc.nextLine();
        sbb.countWords(str);

        System.out.println("+---------------------+");
        System.out.println("2. Java program to Merge two String Arrays and remove duplicate words");
        System.out.println("+---------------------+");
        System.out.println("Enter first array length");
        int arr1Len = sc.nextInt();
        System.out.println("Enter first array string elements one by one");
        String[] arr1 = new String[arr1Len];
        for(int i=0; i<arr1Len; i++){
            arr1[i] = sc.next();
        }
        System.out.println("Enter second array length");
        int arr2Len = sc.nextInt();
        System.out.println("Enter second array string elements one by one");
        String[] arr2 = new String[arr2Len];
        for(int i=0; i<arr2Len; i++){
            arr2[i] = sc.next();
        }
        System.out.println("Merged array: "+ Arrays.toString(sbb.mergeArraysRemoveDuplicates(arr1,arr2)));

        System.out.println("+---------------------+");
        System.out.println("Java program to reverse a String ( 5 different ways)");
        System.out.println("+---------------------+");
        System.out.println("Reversed String (Method 1): " + sbb.reverseStr1(str));
        System.out.println("Reversed String (Method 1 using String Builder): " + sbb.reverseStr1Bldr(str));
        System.out.println("Reversed String (Method 1 using String Buffer): " + sbb.reverseStr1Bffr(str));
        System.out.println("Reversed String (Method 2 using String Builder): " + sbb.reverseStr2Bldr(str));
        System.out.println("Reversed String (Method 2 using String Buffer): " + sbb.reverseStr2Bffr(str));
        System.out.println("Reversed String (Method 3): " + sbb.reverseStr3(str));
        System.out.println("Reversed String (Method 4): " + sbb.reverseStr4(str));

        System.out.println("+---------------------+");
        System.out.println("Java program to check the input String is a palindrome");
        System.out.println("+---------------------+");
        System.out.println("Is palindrome: " + sbb.reverseStr2Bldr(str).equals(str));

        System.out.println("+---------------------+");
        System.out.println("Java program to find all permutations of a given string");
        System.out.println("+---------------------+");
        System.out.println("Permutations: ");
        sbb.permutation("",str);

    }
}
