/* Checks whether the given character is a vowel */

package com.basics.beginnerprograms;

import java.util.Scanner;

public class VowelCheck {
    private boolean isVowel(char ch){
        String vowel = "aeiouAEIOU";
        if(vowel.indexOf(ch)>=0) return true;
        else return false;
    }
    public void display(Object result){
        System.out.println(result);
    }
    public static void main(String[] args) {
        VowelCheck vw = new VowelCheck();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a character");
        char ch = sc.next().charAt(0);
        if(vw.isVowel(ch)) vw.display(ch+" is a vowel");
        else vw.display(ch+ " is not a vowel");
    }
}
