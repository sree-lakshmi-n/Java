//Disemvowel Trolls: https://www.codewars.com/kata/52fba66badcd10859f00097e/java
//Removing vowels from given string

package com.codewars;

class DisemvowelTrolls{
    // To check whether given char is vowel or not
    private boolean isVowel(char c){
        String str = "AEIOUaeiou";
        for(int i=0; i<str.length(); i++){
            if(c == str.charAt(i)){
                return true;
            }
        }
        return false;
    }
    //Copying non vowels into a stringbuilder and converting that to a string.
    public String disemvowel(String str){
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            if(isVowel(str.charAt(i)))  continue;
            else sb.append(str.charAt(i));
        }
        return sb.toString();
    }
    public void print(Object result){
        System.out.println(result);
    }
}

public class DisemvowelTrollsTest {
    public static void main(String[] args) {
        DisemvowelTrolls dt = new DisemvowelTrolls();
        dt.print(dt.disemvowel("No offense but,\\nYour writing is among the worst I've ever read"));
        dt.print(dt.disemvowel("This website is for losers LOL!"));
        dt.print(dt.disemvowel("What are you, a communist?"));
    }
}