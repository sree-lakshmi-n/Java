/* Transform To Prime
    Given a List [] of n integers , find minimum number
    to be inserted in a list, so that sum of all elements of list should equal the closest prime number .
    https://www.codewars.com/kata/5a946d9fba1bb5135100007c/train/java
* */
package com.codewars.sixkyu;

import java.util.Arrays;
class TransformToPrime {
    public static boolean isPrime(int num){
        if(num == 1) return false;
        for(int i=2; i<=Math.sqrt(num);i++){
            if(num%i==0)
                return false;
        }
        return true;
    }
    public static int nextPrime(int num){
        while(!isPrime(num+=1)){
        }
        return num;
    }
    public static int minimumNumber(int[] numbers) {
        int sum = Arrays.stream(numbers).sum();
        if(isPrime(sum)) return 0;
        else return (nextPrime(sum)-sum);
    }
}
public class TransformToPrimeTest {
    public static void main(String[] args) {
        TransformToPrime tp = new TransformToPrime();
        System.out.println(tp.minimumNumber(new int[]{3,1,2}));
        System.out.println(tp.minimumNumber(new int[]{5,2}));
        System.out.println(tp.minimumNumber(new int[]{1,1,1}));
        System.out.println(tp.minimumNumber(new int[]{2,12,8,4,6}));
        System.out.println(tp.minimumNumber(new int[]{50,39,49,6,17,28}));
    }
}
