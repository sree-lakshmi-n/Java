/*
Highest and Lowest
* Returns the highest and lowest number
* https://www.codewars.com/kata/554b4ac871d6813a03000035
* */

import java.util.Arrays;

public class HighestAndLowest {
    public static int[] toInt(String strArr){
        String[] strSplitedArr = strArr.split(" ");
        int[] intArr = new int[strSplitedArr.length];
        for(int i=0; i<intArr.length; i++){
            intArr[i] = Integer.parseInt(strSplitedArr[i]);
        }
        return intArr;
    }
    public static String highAndLow(String numbers) {
        // Code here or
        int[] numArr = toInt(numbers);
        int max = Arrays.stream(numArr).max().getAsInt();
        int min = Arrays.stream(numArr).min().getAsInt();
        return max+" "+min;
    }

    public static void main(String[] args) {
        HighestAndLowest hl = new HighestAndLowest();
        System.out.println(hl.highAndLow("1 2 3 4 5"));
        System.out.println(hl.highAndLow("1 2 -3 4 5"));
        System.out.println(hl.highAndLow("1 9 3 4 -5"));
    }
}