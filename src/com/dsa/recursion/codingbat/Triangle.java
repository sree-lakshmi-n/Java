/*
* We have triangle made of blocks. The topmost row has 1 block,
* the next row down has 2 blocks, the next row has 3 blocks, and so on.
* Compute recursively (no loops or multiplication) the total number of
* blocks in such a triangle with the given number of rows.
* https://codingbat.com/prob/p194781
* */
package com.dsa.recursion.codingbat;

public class Triangle {
    public int triangle(int rows) {
        if(rows == 1 || rows == 0) return rows;
        return rows + triangle(rows-1);
    }
    public static void main(String[] args) {
        Triangle tri = new Triangle();
        for (int i = 0; i <= 10; i++) {
            System.out.println("No. of blocks for a triangle with "+i+" rows: "+tri.triangle(i));
        }
    }
}