/*
 * Count7
 * Given a non-negative int n, return the count of the
 * occurrences of 7 as a digit, so for example 717 yields 2. (no loops).
 * Note that mod (%) by 10 yields the rightmost digit (126 % 10 is 6),
 * while divide (/) by 10 removes the rightmost digit (126 / 10 is 12).
 * https://codingbat.com/prob/p101409
 * */
package com.dsa.recursion.codingbat;

public class CountSeven {
    public int count7(int n) {
        if(n==0||n==1) return 0;
        if(n == 7) return 1;
        if(n%10==7) return 1+count7(n/10);
        return count7(n/10);
    }

    public static void main(String[] args) {
        CountSeven cs = new CountSeven();
        int[] test = {717,7,123,77,7123,771237,771737,47571,777777,70701277,777576197,99999,99799};
        for (int i = 0; i < test.length; i++) {
            System.out.println("No. of 7's in "+test[i]+": "+cs.count7(test[i]));
        }
    }
}