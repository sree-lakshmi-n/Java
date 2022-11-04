package com.basics.assignments;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class StringBufferNBldr {
    // Java program to count number of words and duplicate words in String
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

    public static void main(String[] args) {
        StringBufferNBldr sbb = new StringBufferNBldr();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a line");
        String str = sc.nextLine();
        sbb.countWords(str);
    }
}
