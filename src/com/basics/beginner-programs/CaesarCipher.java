/*
* The Caesar Cipher technique is simply a type of substitution encryption technique, i.e.,
* each letter of a given text is replaced by a letter some fixed number of positions down
* the alphabet.
* For more info: https://www.geeksforgeeks.org/caesar-cipher-in-cryptography/
 * */

package com.basics.beginnerprograms;

import java.util.Scanner;

public class CaesarCipher {
    public String getInput(){
        Scanner sc = new Scanner(System.in);
        display("Enter a string: ");
        String input = sc.next();
        return input;
    }
    public int getStep(){
        Scanner sc = new Scanner(System.in);
        display("Enter step value: ");
        int step = sc.nextInt();
        return step;
    }
    public void caesarMethod1(String str, int step){
        String result = "";
        for (int i = 0; i < str.length(); i++){
            result += (char)(((int)str.charAt(i) + step - 97) % 26 + 97);
        }
        display("Method 1 result: "+result);
    }
    public void caesarMethod2(String str, int step){
        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        int position;
        display("Method 2 result: ");
        for (int i = 0; i < str.length(); i++){
            position = alphabet.indexOf(str.charAt(i));
            position = (position+step)%26;
            display(alphabet.charAt(position));
        }
    }
    public void display(Object result){
        System.out.print(result);
    }
    public static void main(String[] args) {
        CaesarCipher cc = new CaesarCipher();
        String str = cc.getInput().toLowerCase();
        int step = cc.getStep();
        cc.caesarMethod1(str,step);
        System.out.println();
        cc.caesarMethod2(str,step);
    }
}