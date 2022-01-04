// Typecasting examples

package com.basics.beginnerprograms;

public class TypeCasting {
    public static void main(String[] args) {
        /* Overflow
        byte num1 = 129;
        System.out.println("Overflow without typecasting: "+num1);
        // Throws error. java: incompatible types: possible lossy conversion from int to byte */

        byte num2 = (byte)129;
        System.out.println("Overflow with typecasting: "+num2);
        // Overflow with typecasting: -127
        // It'll wrap around the value

        int data = 128;
        byte res = (byte) data ; // value is -128
        int output = (int) res;
        System.out.println("Overflow due to conversion from int to byte: "+output);
        //the data overflowed when converting to byte. so once we changed it back to int, value remains the same.
        // The overflown value is lost.

        //Float to int
        float number = 56.7F;
        // Use F at the end of float and L at the end of long.
        int num = (int)number;
        System.out.println("Float to int typecasting: " +num);

        // int/int division
        float quotient = 15/2;
        System.out.println("Integer division without typecasting: "+quotient);
        float quo = (float) 15/2;
        System.out.println("Integer division with typecasting: "+quo);
    }
}
