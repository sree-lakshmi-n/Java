package com.basics.accesmodifier;

import com.basics.beginnerprograms.AccessModifierInitialising;

public class AccessModifierTest {
    public static void main(String[] args) {
        AccessModifierInitialising acc = new AccessModifierInitialising();
//        System.out.println(acc.rollNum);
        // java: rollNum has private access in
        // com.basics.beginnerprograms.AccessModifierInitialising
        /***********************/
        System.out.println(acc.name);
        /***********************/
//        System.out.println(acc.mailId);
        // java: mailId has protected access in
        // com.basics.beginnerprograms.AccessModifierInitialising
        /***********************/
//        System.out.println(acc.phoneNum);
        // java: mailId has protected access in
        // com.basics.beginnerprograms.AccessModifierInitialising
    }
}
