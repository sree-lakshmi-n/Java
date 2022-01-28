/*
Working of Access Modifiers
https://www.javatpoint.com/access-modifiers
*/
package com.basics.accesmodifier;

import com.basics.beginnerprograms.AccessModifierInitialising;

public class AccessModifierTest {
    public static void main(String[] args) {
        AccessModifierInitialising acc = new AccessModifierInitialising();
//        System.out.println(acc.rollNum);
        // java: rollNum has private access in com.basics.beginnerprograms.AccessModifierInitialising
        /***********************/
        System.out.println(acc.name);
        /***********************/
//        System.out.println(acc.mailId);
        // java: mailId has protected access in com.basics.beginnerprograms.AccessModifierInitialising
        /***********************/
//        System.out.println(acc.phoneNum);
        // java: mailId has protected access in com.basics.beginnerprograms.AccessModifierInitialising

        /***********************/
//        AccessModifierInitialising accarg = new AccessModifierInitialising(2);
        // AccessModifierInitialising(int) has private access in com.basics.beginnerprograms.AccessModifierInitialising

        Access a1 = new Access();
        a1.disp();
        // Accessing protected members using child class
    }
}
class Access extends AccessModifierInitialising{
    public void disp(){
        System.out.println(mailId); // Accessing protected members using child class
    }
    // Method overriding
//    void printResult(){
//        System.out.println("Hello World");
//    }
    // attempting to assign weaker access privileges; was protected
    // The default modifier is more restrictive than protected.
    // That is why, there is a compile-time error.
}
