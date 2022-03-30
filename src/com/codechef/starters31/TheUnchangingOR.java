// The Unchanging OR
// https://www.codechef.com/START31D/problems/UNCHANGEDOR
package com.codechef.starters31;

import java.util.Scanner;

public class TheUnchangingOR {
    private int bitwiseOr(int n){       // F(i) = 1|2|...|i
        int res = 1;
        for (int i = 2; i <= n; i++) {
            res = res | i;      // bitwise or operation
        }
        return res;
    }
    private int unchangedORCountMethod1(int n){         // Throws TLE Error
        int count = 0;
        for (int j = 2; j <= n; j++) {
            if(bitwiseOr(j)==bitwiseOr(j-1))
                count+=1;
        }
        return count;
    }
    /*
    When we apply F(i) = 1|2|...|i
    F(1) -> 1       //1
    F(2) -> 3       //10
    F(3) -> 3       //11
    F(4) -> 7       //100
    F(5) -> 7       //101
    F(6) -> 7       //110
    F(7) -> 7       //111
    F(8) -> 15      //1000
    F(9) -> 15      //1001
    F(10) -> 15     //1010
    F(11) -> 15     //1011
    F(12) -> 15     //1100
    F(13) -> 15     //1101
    F(14) -> 15     //1110
    F(15) -> 15     //1111
    F(16) -> 31     //10000
    F(17) -> 31     //10001
    F(18) -> 31     //10010
    F(19) -> 31     //10011
    F(20) -> 31     //10100
    F(21) -> 31     //10101
    F(22) -> 31     //10110
    F(23) -> 31     //10111
    F(24) -> 31     //11000
    F(25) -> 31     //11001
    F(26) -> 31     //11010
    F(27) -> 31     //11011
    F(28) -> 31     //11100
    F(29) -> 31     //11101
    F(30) -> 31     //11110
    F(31) -> 31     //11111
    F(32) -> 63     //100000
    We can infer that F(i) changes only when a new bit is added.
If n = 2, ans = 0
n = 3 -> ans = 1
n = 4 -> ans = 1
n = 5 -> ans = 1+
     */
    private int unchangedORCountMethod2(int n){
        return n-(int)(Math.log(n) / Math.log(2))-1;    // n-1-log2(n)
    }
    public static void main(String[] args) throws java.lang.Exception {
        try{
            Scanner sc = new Scanner(System.in);
            TheUnchangingOR or = new TheUnchangingOR();
            int t = sc.nextInt();
            for (int i = 0; i < t; i++) {
                int n = sc.nextInt();
                System.out.println("Method 1 -> " + or.unchangedORCountMethod1(n));
                System.out.println("Method 2 -> " + or.unchangedORCountMethod2(n));
            }
        }catch (Exception e){
            return;
        }
    }
}