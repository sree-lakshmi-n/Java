package com.basics.beginnerprograms;

// Pass By Value
/* Variables are passed by value. Hence, after the function call is over, variable value remains
*  the same in main function. => Formal parameter changes are not reflected in actual parameters.
* Primitive data types always pass by value.
* */
public class PassByValue {
    public static void call(int number) {
        System.out.println("Number in the beginning: " + number);
        number += 1;
        System.out.println("Number in the end: " + number);
    }
    public static void main(String[] args) {
        int number = 1;
        call(number);
        System.out.println("Number still: " + number);
    }
}