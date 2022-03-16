// Balanced Reversals
// https://www.codechef.com/START30D/submit/BALREV
package com.codechef.starters30;

import java.util.Collections;
import java.util.Scanner;

public class BalancedReversals {
    public static void main(String[] args) throws java.lang.Exception {
        try{
            Scanner sc = new Scanner(System.in);
            int t = sc.nextInt();
            for (int i = 0; i < t; i++) {
                int n = sc.nextInt();
                String a = sc.next();
                int countOne = 0;
                for (int j = 0; j < a.length(); j++) {
                    if(a.charAt(j)=='1')
                        countOne++;
                }
                System.out.println(String.join("", Collections.nCopies(a.length()-countOne, "0"))+String.join("", Collections.nCopies(countOne, "1")));
            }
        }catch (Exception e){
            return;
        }
    }
}