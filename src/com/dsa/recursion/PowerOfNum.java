// Exponent operation using recursion
package com.dsa.recursion;

public class PowerOfNum {
    public long findPower(long base, long power){
        if(power == 0 || base == 1) return 1;
        if(power == 1) return base;
        return base*findPower(base,power-1);
    }

    public static void main(String[] args) {
        PowerOfNum pn = new PowerOfNum();
        for (int i = 0; i <= 10; i++) {
            for (int j = 1; j <= 5; j++) {
                System.out.println(i+"^"+j+" = "+pn.findPower(i,j));
            }
            System.out.println("----------------------------------");
        }
//        System.out.println("54^3 = "+pn.findPower(54,-3));
        // java.lang.StackOverflowError
    }
}
