/*
* Beginner Series #3 Sum of Numbers
* Given two integers a and b, which can be positive or negative, find the sum of all
* the integers between and including them and return it. If the two numbers are equal
* return a or b.
* Note: a and b are not ordered!
* https://www.codewars.com/kata/55f2b110f61eb01779000053/java
* */
package com.codewars.sevenkyu;

class Sum {
    public int GetSum(int a, int b) {
        int sum = 0;
        int low = (a<b)?a:b;
        int high = (a>b)?a:b;
        for(int i = low; i<=high; i++)
            sum +=i;
        return sum;
    }
}
public class BeginnerSeriesTest {
    public static void main(String[] args) {
        Sum s = new Sum();
        System.out.println(s.GetSum(0, -1)); // -1
        System.out.println(s.GetSum(0, 1));  // 1
        System.out.println(s.GetSum(5, -1));  // 14
        System.out.println(s.GetSum(505, 4)); // 127759
        System.out.println(s.GetSum(321, 123)); // 44178
        System.out.println(s.GetSum(-50, 0)); // -1275
        System.out.println(s.GetSum(-1, -5)); // -15
        System.out.println(s.GetSum(-5, -5)); // -5
        System.out.println(s.GetSum(-505, 4)); // -127755
        System.out.println(s.GetSum(-321, 123)); // -44055
        System.out.println(s.GetSum(0, 0)); // 0
        System.out.println(s.GetSum(-5, -1)); // -15
        System.out.println(s.GetSum(5, 1)); // 15
        System.out.println(s.GetSum(-17, -17)); // -17
        System.out.println(s.GetSum(17, 17)); // 17
    }
}
