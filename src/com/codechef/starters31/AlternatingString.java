// Alternating String
// https://www.codechef.com/START31D/problems/ALTSTR
package com.codechef.starters31;

import java.util.Scanner;

public class AlternatingString {
    public static void main(String[] args) throws java.lang.Exception {
        try{
            Scanner sc = new Scanner(System.in);
            int t = sc.nextInt();
            for (int i = 0; i < t; i++) {
                int n = sc.nextInt();
                String s = sc.next();
                int count0 = (int) s.codePoints().filter(ch -> ch == '0').count();
                int count1 = (int) s.codePoints().filter(ch -> ch == '1').count();
                int min = Math.min(count0,count1);
                if(min == 0){                       // Case 1 -> eg. 000
                    System.out.println(1);
                }
                else if(count0 == count1){          // Case 2 -> eg. 1010
                    System.out.println(n);
                }
                else{
                    System.out.println(2*min+1);    // Case 3 -> eg. 101010111
                }
                /*
                * Method 2
                * System.out.println(2*min+count0!=count1);
                * It works for all 3 cases.
                * In cases 1 & 3, count0 and count1 are diff => count0 != count1 -> true = 1
                * In case 2, count0 = count1 -> false = 0
                 * */
            }
        }catch (Exception e){
            return;
        }
    }
}