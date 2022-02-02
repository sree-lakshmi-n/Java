/*Bunny Ears
* We have a number of bunnies and each bunny has two big floppy ears.
* We want to compute the total number of ears across all the bunnies recursively.
* */
package com.dsa.recursion.codingbat;

public class BunnyEars {
    public int bunnyEars(int bunnies) {
        if(bunnies == 0) return 0;
        return 2 + bunnyEars(bunnies-1);
    }

    public static void main(String[] args) {
        BunnyEars be = new BunnyEars();
        for (int i = 0; i <= 20; i++) {
            System.out.println(i+" bunnies have "+be.bunnyEars(i)+" ears");
        }
    }
}
