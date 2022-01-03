// Array practice program

package com.basics.beginnerprograms;

import java.util.Arrays;

//Array practice
public class Tango {
    private void doubleQuotes(){
        int[] print = new int[]{0,1,2,3,4,5};
        System.out.print("\"Prints = ");
        System.out.print(print[0]+print[5]+print[2]+"\"");
        System.out.println();
    }
    private void allDimensionArrays(){
        int[] a1d = {};
        int[] b1d = {1,3};
        int[][] a2d = {};
        int[][] b2d = {{}};
        int[][] c2d = {{1,2},{5}};
        System.out.println(a1d.length+" "+ b1d.length+" ");
//        System.out.println(a2d.length+" "+a2d[0].length+" "+b2d.length+" "+b2d[0].length+" "); //a2d[0].length throws ArrayIndexOutOfBoundsException
        System.out.println(c2d.length+" "+c2d[0].length+" "+c2d[1].length);
    }
    private void active(){
        if(true){
            int[] str={5};
            String i = ""+str[0];
            System.out.print(i);
        }
        System.out.print("-");
        {
            int[] str = {1,2};
            System.out.println(str); // Don't print array like this. Gives random m/y location
            System.out.println(Arrays.toString(str));  //To print array
            System.out.print(str[1]);
        }
//        System.out.println(str); //Can't access str outside its block scope
        System.out.print("-");
        {
            String str = "I like Java programming language";
            System.out.print(str);
        }
        System.out.print("-");
        {
            int str = 124;
            System.out.print(str);
        }
    }
    public static void main(String[] args) {
        Tango t = new Tango();
        t.doubleQuotes();
        t.allDimensionArrays();
        t.active();
    }
}
