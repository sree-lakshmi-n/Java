package com.basics.Strings;

public class MemoryAddress {
    public static void main(String[] args) {
        String s1 = "Java";
        String s2 = "Professional";
        System.out.println(s1.concat("*").concat(s2));
        // 5 string variables are created in memory
        // 1 -> s1, 2 -> s2, 3 -> *, 4 -> s1.concat("*") 5-> s1.concat("*").concat(s2)

        String str1 = "good";
        String str2 = "good";
        String str3 = new String("good");
        System.out.println(str1 == str2);
        System.out.println(str1 == str3);

        //Memory address
        System.out.println("\n"+System.identityHashCode(str1)+" "+str1.hashCode());
        System.out.println(System.identityHashCode(str2)+" "+str2.hashCode());
        // str1 and str2 has same memory address. Hence, str1 == str2 is true.

        System.out.println("\n"+System.identityHashCode(str1)+" "+str1.hashCode());
        System.out.println(System.identityHashCode(str3)+" "+str3.hashCode());
        // new keyword creates a new String object whose reference will be stored
        // in the String variable.
        // Hence, str == str3 is false because str3 has a different address.
    }
}
