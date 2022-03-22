// Swapping Chefs Way
// https://www.codechef.com/START30D/problems/SWAPCW
package com.codechef.starters30;

import java.util.Arrays;
import java.util.Scanner;

public class SwappingChefsWay {
    public static void main(String[] args) throws java.lang.Exception {
        try{
            Scanner sc = new Scanner(System.in);
            int t = sc.nextInt();
            for (int i = 0; i < t; i++) {
                int n = sc.nextInt();
                String s = sc.next();
                char[] tempArr = s.toCharArray();
                char[] charArr = s.toCharArray();
                Arrays.sort(charArr);
                // sorting the array to compare with the chefsorted array later
                String sortedStr = new String(charArr);
                // the string with which we'll compare the chefsorted string later
                for (int j = 0; j < n/2; j++) {
                    // n/2 because swapping is needed only for the half array. The other half elements will already be swapped.
                   if(tempArr[j] > tempArr[n-j-1]){
                       char temp = tempArr[j];
                       tempArr[j] = tempArr[n-j-1];
                       tempArr[n-j-1] = temp;
                   }
                }
                String chefSorted = new String(tempArr);
                if(chefSorted.equals(sortedStr))
                    System.out.println("YES");
                else
                    System.out.println("NO");
            }
        }catch (Exception e){
            return;
        }
    }
}