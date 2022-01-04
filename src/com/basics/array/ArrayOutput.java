package com.basics.arrays;

import java.util.Arrays;

public class ArrayOutput {
    public static void main(String[] args) {
        int[] student_marks = new int[39];
        student_marks = new int[]{10,20,30};
        System.out.println("Student marks array: " + Arrays.toString(student_marks));
        int[] myarray = null;
        myarray = student_marks;
        System.out.println("My array: " + Arrays.toString(myarray));
        System.out.println("Myarray length: "+ myarray.length);
        System.out.println("Student marks array length: "+ student_marks.length);
    }
}
