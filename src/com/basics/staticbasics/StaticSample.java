// Use of static blocks and how static variables differ from instance variables
package com.basics.staticbasics;

public class StaticSample {
    public static int count = 0;
//    count++;
    // If you try to modify static variables outside static block or methods,
    // it throws java: <identifier> expected error
    static {
        System.out.println("In static block "+(count++));
        // static blocks to modify static variables
    }
    static {
        System.out.println("In second static block "+(count++));
    }
    public static void main(String[] args) {
        System.out.println("Hello World");
        System.out.println("good "+(count++));
    }
}