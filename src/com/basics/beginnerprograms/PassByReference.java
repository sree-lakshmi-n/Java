package com.basics.beginnerprograms;

import java.util.Arrays;

// Pass By Reference
/* Arrays are always passed by reference. Hence, after the function call is over,
    array values change in main function. => Formal and Actual parameters change.
    Reference variables (non-primitive) always pass by reference.

    new always allocates memory address.
 */

class Update{
    int[] updateArray(int[] formalArr){
        formalArr[2] = 99;
        formalArr[3] = 999;
        return formalArr;
    }
    String updateString(String formalStr){
        formalStr = "Hello";
        return formalStr;
    }
}
public class PassByReference {
    public static void main(String[] args) {
        Update au = new Update();
        int[] actualArr = new int[]{1,2,3,4,5,6};
        // actualArr is the object for itself.
        // actualArr, in turn, is instance variable of PassByReference class.
        System.out.println(Arrays.toString(actualArr));
        au.updateArray(actualArr);
        System.out.println(Arrays.toString(actualArr));

        // If you don't want your array to be changed, make a copy and send that
        // copy as the argument.
        int[] tempArr = new int[actualArr.length];
        au.updateArray(tempArr);

        System.out.println(Arrays.toString(actualArr)); // actualArr is unchanged.
        // Since it's never passed.
        System.out.println(Arrays.toString(tempArr));

        /************************************************************/
        /* String isn't primitive. It is also passed as reference. */

        String actualStr = "Hi";
        System.out.println(actualStr);
        au.updateString(actualStr);
        System.out.println(actualStr);
    }
}
