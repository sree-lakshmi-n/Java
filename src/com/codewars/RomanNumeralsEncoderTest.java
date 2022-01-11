/*
* Roman Numerals Encoder
* https://www.codewars.com/kata/51b62bf6a9c58071c600001b
* */

package com.codewars;

public class RomanNumeralsEncoderTest {
    public static void main(String[] args) {
        Conversion roman = new Conversion();
        System.out.println(roman.solution(1000));
        System.out.println(roman.solution(1));
        System.out.println(roman.solution(4));
        System.out.println(roman.solution(6));
        System.out.println(roman.solution(146));
        System.out.println(roman.solution(52));
        System.out.println(roman.solution(55));
    }
}
class Conversion {
    private String getRomanNumeral(int num){
        switch(num){
            case 1000: return "M";
            case 2000: return "MM";
            case 3000: return "MMM";
            case 100: return "C";
            case 200: return "CC";
            case 300: return "CCC";
            case 400: return "CD";
            case 500: return "D";
            case 600: return "DC";
            case 700: return "DCC";
            case 800: return "DCCC";
            case 900: return "CM";
            case 10: return "X";
            case 20: return "XX";
            case 30: return "XXX";
            case 40: return "XL";
            case 50: return "L";
            case 60: return "LX";
            case 70: return "LXX";
            case 80: return "LXXX";
            case 90: return "XC";
            case 1: return "I";
            case 2: return "II";
            case 3: return "III";
            case 4: return "IV";
            case 5: return "V";
            case 6: return "VI";
            case 7: return "VII";
            case 8: return "VIII";
            case 9: return "IX";
            default: return "";
        }
    }

    public String solution(int n) {
        StringBuilder sb = new StringBuilder();
        int numLen = new Integer(n).toString().length();
        int rem;
        for(int i=0; i<=(numLen-1); i++){
            rem = n%10;
            sb.insert(0,getRomanNumeral(rem*(int)Math.pow(10,i)));
            n = n/10;
        }
        return sb.toString();
    }
}