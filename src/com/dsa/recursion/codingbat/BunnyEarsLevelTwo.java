/*
 Bunny Ears II
 We have bunnies standing in a line, numbered 1, 2, ...
 The odd bunnies (1, 3, ..) have the normal 2 ears.
 The even bunnies (2, 4, ..) we'll say have 3 ears, because they each have a raised foot.
 Recursively return the number of "ears" in the bunny line 1, 2, ... n
 (without loops or multiplication).
 https://codingbat.com/prob/p107330
*/
package com.dsa.recursion.codingbat;

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