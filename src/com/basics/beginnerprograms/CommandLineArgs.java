// Playing with Commandline arguments

package com.basics.beginnerprograms;

import java.util.Scanner;

public class CommandLineArgs{
    public static void main(String... args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Hello");
        for(String i: args){
            System.out.println("Command line value is "+i);
        }
//        System.out.println(Integer.parseInt(args[0]));
//        int num = (int)args[0]; //Won't work as we need to convert from String to int and not just typecast from similar datatype like byte and such.
        // java: incompatible types: java.lang.String cannot be converted to int

        /* nextInt() nextLine() trouble*/

        System.out.println("Enter double value");
        double num = sc.nextDouble();
        System.out.println("Enter string");
        String line = sc.nextLine();
        System.out.println(num+" "+line);

        /* output comes as this */
        /*
        *   Enter double value
            0.0
            Enter string
            0.0
        * */

        // to fix this
        System.out.println("Enter double value");
        num = sc.nextDouble();
        sc.nextLine(); // reads extra newline character. Solves issue. Temp fix.
        System.out.println("Enter string");
        line = sc.nextLine();
        System.out.println(num+" "+line);
    }
}