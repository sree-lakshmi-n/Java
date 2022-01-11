/*
* Bit Counting
* Returns the number of bits that are equal to one in the binary representation
* of the given number.The input is non-negative.
* https://www.codewars.com/kata/526571aae218b8ee490006f4/train/java
* */

package com.codewars;

public class BitCountingTest {
    public static void main(String[] args) {
        BitCounting bit = new BitCounting();

        System.out.println("Using Method 1");
        System.out.println("1234 -> " + bit.countBitsNaiveApproach(1234));
        System.out.println("4 -> " + bit.countBitsNaiveApproach(4));
        System.out.println("7 -> " + bit.countBitsNaiveApproach(7));
        System.out.println("9 -> " + bit.countBitsNaiveApproach(9));
        System.out.println("10 -> " + bit.countBitsNaiveApproach(10));

        System.out.println("\nUsing Method 2");
        System.out.println("1234 -> " + bit.countBits(1234));
        System.out.println("4 -> " + bit.countBits(4));
        System.out.println("7 -> " + bit.countBits(7));
        System.out.println("9 -> " + bit.countBits(9));
        System.out.println("10 -> " + bit.countBits(10));
    }
}
class BitCounting{
    private static String toBinary(int num){
        StringBuilder sb = new StringBuilder();
        while (num>=1){
            sb.append(num%2);
            num = num/2;
        }
        return sb.reverse().toString();
    }
    public static int countBitsNaiveApproach(int n){
        String str = toBinary(n);
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i) == '1')
                count+=1;
        }
        return count;
    }
    public static int countBits(int n){
        return Integer.bitCount(n);
    }
}