/*
* Keep Hydrated!
* https://www.codewars.com/kata/582cb0224e56e068d800003c/train/java
* */
package com.codewars.eightkyu;

class KeepHydrated  {
    public int liters(double time)  {
        return (int)Math.round(Math.abs(time - 1)/2);
    }
}
public class KeepHydratedTest {
    public static void main(String[] args) {
        KeepHydrated kh = new KeepHydrated();
        System.out.println(kh.liters(2));  // 1
        System.out.println(kh.liters(0.97));  // 0
        System.out.println(kh.liters(14.64));  // 7
        System.out.println(kh.liters(1600.20)); // 800
        System.out.println(kh.liters(80));  // 40
    }
}
