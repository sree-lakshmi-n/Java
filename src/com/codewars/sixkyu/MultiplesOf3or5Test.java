/*
 Multiples of 3 or 5
 Returns the sum of all the multiples of 3 or 5 below the number passed in.
 https://www.codewars.com/kata/514b92a657cdc65150000006
*/

package com.codewars.sixkyu;

public class MultiplesOf3or5Test {
    public static void main(String[] args) {
        Solution sol = new Solution();
        System.out.println(sol.solution(10));
    }
}
class Solution {
    public int solution(int number) {
        if(number == 0)
            return 0;
        int sum = 0;
        for(int i=0; i<number; i++){
            if(i%3 == 0 && i%5 == 0){
                sum += i;
            }
            else if(i%3 == 0 || i%5 == 0){
                sum += i;
            }
        }
        return sum;
    }
}