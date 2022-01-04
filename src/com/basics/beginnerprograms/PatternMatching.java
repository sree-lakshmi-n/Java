/*
 Checks whether a particular string is there in a given paragraph.
 If present, it returns the position(s) of that string.
*/

package com.basics.beginnerprograms;

import java.util.Scanner;

//Pattern Matching
public class PatternMatching {
    private String getInput(){
        Scanner sc = new Scanner(System.in);
        display("Enter a Paragraph");
        String paragraph = sc.nextLine();
        return paragraph;
    }
    private String getPattern(){
        Scanner sc = new Scanner(System.in);
        display("Enter the string you want to search for");
        String pattern = sc.next();
        return pattern;
    }
    private void display(Object result){
        System.out.println(result);
    }
    public static void main(String[] args) {
        PatternMatching pm = new PatternMatching();
        String paragraph = pm.getInput().toLowerCase();
        String pattern = pm.getPattern().toLowerCase();
        int index=0;
        int i=0;
        while(i<paragraph.length()){
            index = paragraph.indexOf(pattern,i);
            if(i==0 && index == -1){
                pm.display(pattern + " not found anywhere in the given paragraph");
                break;
            }
            else if(index==-1){
                break;
            }
            else {
                pm.display(index);
                i = index + pattern.length();
            }
        }
    }
}