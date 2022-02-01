/*
 Bunny Ears II
 We have triangle made of blocks. The topmost row has 1 block,
 the next row down has 2 blocks, the next row has 3 blocks, and so on.
 Compute recursively (no loops or multiplication) the total number of
 blocks in such a triangle with the given number of rows.
 https://codingbat.com/prob/p194781
*/
package com.dsa.recursion;

public class BunnyEarsLevelTwo {
    public int bunnyEars2(int bunnies) {
        if(bunnies == 0) return 0;
        if(bunnies%2==0) return 3+bunnyEars2(bunnies-1);
        return 2+bunnyEars2(bunnies-1);
    }

    public static void main(String[] args) {
        BunnyEarsLevelTwo bet = new BunnyEarsLevelTwo();
        for (int i = 0; i <= 15; i++) {
            System.out.println(i + " bunnies have " + bet.bunnyEars2(i) + " ears");
        }
    }
}
