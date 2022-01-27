/*
* Descending Order
* Takes any non-negative integer as an argument and return it with its
* digits in descending order. Essentially, rearrange the digits to create the highest
* possible number.
* https://www.codewars.com/kata/5467e4d82edf8bbf40000155/java
 * */

package com.codewars.sevenkyu;

import java.util.*;
import java.util.stream.Collectors;

class DescendingOrder {
    public static int sortDescMethodOne(final int num) {
        String numStr = Integer.toString(num);
        int[] numArr = new int[numStr.length()];
        for(int i=0; i<numStr.length();i++){
            numArr[i] = (int)numStr.charAt(i) - '0';
        }
        Arrays.sort(numArr);
        int result = 0;
        for(int i=numArr.length-1; i>=0; i--){
            result = result * 10 + numArr[i];
        }
        return result;
    }
    public static int sortDescMethodTwo(final int num){
        return Integer.parseInt(String.valueOf(num).chars().
                mapToObj(c -> String.valueOf(Character.getNumericValue(c))).
                sorted(Comparator.reverseOrder()).collect(Collectors.joining()));
    }
}
public class DescendingOrderTest {
    public static void main(String[] args) {
        DescendingOrder desc = new DescendingOrder();
        System.out.println("Method 1");
        System.out.println(desc.sortDescMethodOne(0));
        System.out.println(desc.sortDescMethodOne(1));
        System.out.println(desc.sortDescMethodOne(15));
        System.out.println(desc.sortDescMethodOne(123));
        System.out.println(desc.sortDescMethodOne(1021));
        System.out.println(desc.sortDescMethodOne(123495678));

        System.out.println("Method 2");
        System.out.println(desc.sortDescMethodTwo(0));
        System.out.println(desc.sortDescMethodTwo(1));
        System.out.println(desc.sortDescMethodTwo(15));
        System.out.println(desc.sortDescMethodTwo(123));
        System.out.println(desc.sortDescMethodTwo(1021));
        System.out.println(desc.sortDescMethodTwo(123495678));
    }
}