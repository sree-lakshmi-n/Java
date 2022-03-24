// Sign Moves
// https://www.codechef.com/START31D/problems/SIGNMOVE
package com.codechef.starters31;

import java.util.Scanner;

public class SignMoves {
    private int getCurrCoordMethod1(int n){     // Throws Time Limit Exceeded (TLE) error
        int coord = 0;
        for (int j = 1; j <= n; j++) {
            if(coord < 0)
                coord += j;
            else
                coord -= j;
        }
        return coord;
    }
    private int getCurrCoordMethod2(int n){
        int res = (n+1)/2;  // To get Math.ceil functionality.
        /* Noticing a pattern that
        N
        1   -1                                              ->      -1
        2   -1+2                                            ->      1
        3   -1+2-3                                          ->      -2
        4   -1+2-3+4                                        ->      2
        5   -1+2-3+4-5                                      ->      -3
        6   -1+2-3+4-5+6                                    ->      3
        => If n is even, coord = n/2
        If n is odd, coord = -1 * Math.ceil(n/2)
        (n+1)/2 is done to mimic Math.ceil functionality.
        Since n+1 and 2 are integers, integer division will happen and we'll get the whole number part.
         */
        return n%2==0? res :-1*res;
    }
    public static void main(String[] args) throws java.lang.Exception {
        try{
            Scanner sc = new Scanner(System.in);
            int t = sc.nextInt();
            SignMoves sm = new SignMoves();
            for (int i = 0; i < t; i++) {
                int n = sc.nextInt();
                System.out.println(sm.getCurrCoordMethod1(n));
                System.out.println(sm.getCurrCoordMethod2(n));
            }
        }catch (Exception e){
            return;
        }
    }
}
