/*
* Counting sheep...
* https://www.codewars.com/kata/54edbc7200b811e956000556/java
* */
package com.codewars.eightkyu;

import java.util.Arrays;
import java.util.Collections;

class Counter {
    public int countSheepsMethodOne(Boolean[] arrayOfSheeps) {
        return (int) Arrays.asList(arrayOfSheeps).stream().filter(e -> e!=null&&e!=false).count();
        // return Arrays.stream(arrayOfSheeps).mapToInt(b -> b ? 1 : 0).sum();
    }
    public int countSheepsMethodTwo(Boolean[] arrayOfSheeps) {
        return Collections.frequency(Arrays.asList(arrayOfSheeps), true);
    }
}
public class CounterTest {
    public static void main(String[] args) {
        Counter c = new Counter();
        Boolean[] array1 = {true,  true,  true,  false,
                true,  true,  true,  true ,
                true,  false, true,  false,
                true,  false, false, true ,
                true,  true,  true,  true ,
                false, false, true,  true };
        Boolean[] array2 = new Boolean[500];
        for(Boolean b: array2){
            b = null;
        }
        Boolean[] array3 = new Boolean[1500];
        for(int i = 0; i< array3.length; i++){
            if(i%12 == 0) array3[i] = true;
            else if(i%3==0) array3[i] = false;
            else array3[i] = null;
        }
        System.out.println("Method 1");
        System.out.println(c.countSheepsMethodOne(array1)); // 17
        System.out.println(c.countSheepsMethodOne(array2)); // 0
        System.out.println(c.countSheepsMethodOne(array3)); // 125
        System.out.println("Method 2");
        System.out.println(c.countSheepsMethodTwo(array1)); // 17
        System.out.println(c.countSheepsMethodTwo(array2)); // 0
        System.out.println(c.countSheepsMethodTwo(array3)); // 125

    }
}
