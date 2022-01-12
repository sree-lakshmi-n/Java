/*
 Your Order, please
 Sort a given string. Each word in the string will contain a single number.
 This number is the position the word should have in the result.
 https://www.codewars.com/kata/55c45be3b2079eccff00010f
*/

package com.codewars.sixkyu;

public class SortAccordingToNumTest {
    public static void main(String[] args) {
        Order sort = new Order();
        System.out.println(sort.order("is2 Thi1s T4est 3a"));
        System.out.println(sort.order("4of Fo1r pe6ople g3ood th5e the2"));
    }
}
class Order {
    private static String findNum(String str){
        str = str.replaceAll("[^\\d]", " ").trim().replaceAll(" +", "");
        return str;
    }
    public static String order(String words) {
        // ...
        if(words.isEmpty()){
            return words;
        }
        String[] strArr = words.split(" ");
        String digits = findNum(words);
        String[] orderedArr = new String[strArr.length];
        int num;
        String orderedStr = "";
        for(int i=0; i<digits.length(); i++){
            num = Character.getNumericValue(digits.charAt(i));
            orderedArr[num-1] = strArr[i];
        }
        for(String s:orderedArr){
            orderedStr = orderedStr + " "+s;
        }
        return orderedStr.trim();
    }
}