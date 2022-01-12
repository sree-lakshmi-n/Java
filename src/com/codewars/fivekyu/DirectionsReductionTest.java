/*
* Directions Reduction
* https://www.codewars.com/kata/550f22f4d758534c1100025a
* */
package com.codewars.fivekyu;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class DirectionsReductionTest {
    public static void main(String[] args) {
        System.out.println("Method 1");
        DirectionsReduction dr = new DirectionsReduction();
        System.out.println(Arrays.toString(dr.dirReduc(new String[]{"NORTH", "SOUTH", "SOUTH", "EAST", "WEST", "NORTH", "WEST"})));
        System.out.println(Arrays.toString(dr.dirReduc(new String[]{"NORTH","SOUTH","SOUTH","EAST","WEST","NORTH"})));
        System.out.println(Arrays.toString(dr.dirReduc(new String[]{"NORTH", "SOUTH", "EAST", "WEST"})));

        System.out.println("\nMethod 2");
        DirReduction dir = new DirReduction();
        System.out.println(Arrays.toString(dir.dirReduc(new String[]{"NORTH", "SOUTH", "SOUTH", "EAST", "WEST", "NORTH", "WEST"})));
        System.out.println(Arrays.toString(dir.dirReduc(new String[]{"NORTH","SOUTH","SOUTH","EAST","WEST","NORTH"})));
        System.out.println(Arrays.toString(dir.dirReduc(new String[]{"NORTH", "SOUTH", "EAST", "WEST"})));
    }
}
class DirectionsReduction{
    private static String[] removeElem(String[] arr, int index){
        String[] str = new String[arr.length-2];
        for (int i = 0; i < arr.length; i++) {
            if(i<index)
                str[i] = arr[i];
            else if(i == index || i==index+1)
                continue;
            else
                str[i-2] = arr[i];
        }
        return str;
    }
    private static boolean checkArrEquality(String[] a, String[] b){
        if(a.length != b.length)
            return false;
        for (int i = 0; i < a.length; i++) {
            if(a[i] != b[i])
                return false;
        }
        return true;
    }
    private static String[] checkDir(String[] arr){
            for (int i = 0; i < arr.length-1 ; i++) {
                if((Objects.equals(arr[i], "NORTH") && Objects.equals(arr[i + 1], "SOUTH")) ||
                        (Objects.equals(arr[i], "SOUTH") && Objects.equals(arr[i + 1], "NORTH")) ||
                        (Objects.equals(arr[i], "EAST") && Objects.equals(arr[i + 1], "WEST")) ||
                        (Objects.equals(arr[i], "WEST") && Objects.equals(arr[i + 1], "EAST"))){
                    arr = removeElem(arr,i);
                }
            }
          return arr;
    }
    public static String[] dirReduc(String[] arr){
        if(arr.length == 0 || arr.length == 1)
            return arr;
        while(arr.length > 1){
            String[] tempArr = arr;
            tempArr = checkDir(arr);
            if(checkArrEquality(tempArr,arr))
                break;
            arr = tempArr;
        }
        return arr;
    }
}

/* Method 2 */
class DirReduction {
    public static String[] dirReduc(String[] arr) {
        List<String> dirs = new ArrayList<String>(Arrays.asList(arr));
        for (int i = 0; i + 1 < dirs.size(); i++) {
            if ("NORTHSOUTH,SOUTHNORTH,EASTWEST,WESTEAST".contains(dirs.get(i) + dirs.get(i + 1))) {
                dirs.remove(i + 1);
                dirs.remove(i);
                i = -1;
            }
        }
        return dirs.toArray(new String[dirs.size()]);
    }
}