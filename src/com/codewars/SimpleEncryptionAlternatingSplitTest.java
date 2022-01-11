/*
Simple Encryption - Alternating Split
 Implement a pseudo-encryption algorithm which given a string S and an integer N
 concatenates all the odd-indexed characters of S with all the even-indexed
 characters of S, this process should be repeated N times.
 https://www.codewars.com/kata/57814d79a56c88e3e0000786/train/java
*/

package com.codewars;

public class SimpleEncryptionAlternatingSplitTest {
    public static void main(String[] args) {
        SimpleEncryptionAlternatingSplit alt = new SimpleEncryptionAlternatingSplit();

        // Encryption tests
        System.out.println("\nEncryption tests");
        System.out.println(alt.encrypt("135024",3));
        System.out.println(alt.encrypt("01234",3));
        System.out.println(alt.encrypt("This is a test!",3));
        System.out.println(alt.encrypt("01234",0));
        System.out.println(alt.encrypt("01234",1));
        System.out.println(alt.encrypt("01234",2));
        System.out.println(alt.encrypt("01234",3));
        System.out.println(alt.encrypt("01234",4));
        System.out.println(alt.encrypt("01234",-1));
        System.out.println(alt.encrypt("This kata is very interesting!",1));

        // Null or Empty tests
        System.out.println("\n _____________________\n");
        System.out.println("Null or Empty tests");
        System.out.println(alt.encrypt("", 0));
        System.out.println(alt.decrypt("", 1));
        System.out.println(alt.encrypt(null, 1));
        System.out.println(alt.decrypt(null, 1));

        // Decryption tests
        System.out.println("\n _____________________ \n");
        System.out.println("Decryption tests");
        System.out.println(alt.decrypt("20314",3));
        System.out.println(alt.decrypt("012345",3));
        System.out.println(alt.decrypt("This is a test!",0));
        System.out.println(alt.decrypt("hsi  etTi sats!",1));
        System.out.println(alt.decrypt("s eT ashi tist!",2));
        System.out.println(alt.decrypt(" Tah itse sits!",3));
        System.out.println(alt.decrypt("This is a test!",4));
        System.out.println(alt.decrypt("This is a test!",-1));
        System.out.println(alt.decrypt("hskt svr neetn!Ti aai eyitrsig",1));
    }
}

class SimpleEncryptionAlternatingSplit{
    /*
     Checking whether given string in null/ void/ length of string is 1.
     Also, checks if no. of iterations is greater than 0.
     If any of these is true, we just need to return the text during
     encryption/ decryption.
    */
    private static boolean isStringAndNumValid(String str, int num){
        if (str==null || str.trim().equals("") || str.length()==1 || num<=0)
            return true;
        return false;
    }

    /* Encryption */
    private static String encode(String str){
        StringBuilder sbOdd = new StringBuilder();
        StringBuilder sbEven = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            if(i%2==0)
                sbEven.append(str.charAt(i));
            else
                sbOdd.append(str.charAt(i));
        }
        return sbOdd.append(sbEven).toString();
    }
    public static String encrypt(final String text, final int n){
        if (isStringAndNumValid(text,n))
            return text;
        String temp = text;
        for (int i = 0; i < n; i++)
            temp = encode(temp);
        return temp;
    }

    /* Decryption */
    public static String decode(String str){
        int mid = str.length()/2;
        StringBuilder sb = new StringBuilder();
        int index = 1;
        for (int i = mid; i < str.length(); i++)
                sb.append(str.charAt(i));
        for (int i = 0; i < mid; i++){
            sb.insert(index,str.charAt(i));
            index +=2;
        }
        return sb.toString();
    }
    public static String decrypt(final String encryptedText,final int n){
        if (isStringAndNumValid(encryptedText,n))
            return encryptedText;
        String temp = encryptedText;
        for (int i = 0; i < n; i++)
            temp = decode(temp);
        return temp;
    }
}