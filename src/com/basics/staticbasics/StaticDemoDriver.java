// Familiarising with static variables, static blocks, and static methods
package com.basics.staticbasics;

class StaticDemo{
    public static int counter;
    static{
        System.out.println("Static block");
        counter = 10;
    }
    static {
        System.out.println("Static block 2");
        counter += 1;
    }
    public static void disp(Object elem){
        System.out.println("Static method");
        System.out.println(elem);
    }
}
public class StaticDemoDriver {
    public static void main(String[] args) {
        StaticDemo.disp(StaticDemo.counter);
        // no need to define objects. Static variables depend on class, not instances.
        StaticDemo.disp(StaticDemo.counter);
        // static block gets printed only once
    }
}