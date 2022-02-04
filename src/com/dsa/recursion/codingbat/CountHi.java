/*
 Given a string, compute recursively (no loops)
 the number of times lowercase "hi" appears in the string.
 https://codingbat.com/prob/p184029
*/
package com.dsa.recursion.codingbat;

public class CountHi {
    public int countHi(String str) {
        if(str.equals("")||str.length()==1) return 0;
        if(str.charAt(0)=='h'&&str.charAt(1)=='i')
            return 1+countHi(str.substring(2));
        return countHi(str.substring(1));
    }
    public static void main(String[] args) {
        CountHi hi = new CountHi();
        String[] test = new String[]{"ship","h","hi","","xxhixx","xhixhix","hihih","hiAAhi12hi",
                "ihihihihihi","ihihihihih","xhixhxihihhhih"};
        for (int i = 0; i <test.length ; i++) {
            System.out.println(hi.countHi(test[i]));
        }
    }
}