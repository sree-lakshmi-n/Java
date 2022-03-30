// Volume Control
// https://www.codechef.com/START32D/problems/VOLCONTROL

package com.codechef.starters32;

import java.util.Scanner;

public class VolumeControl {
    public static void main(String[] args) throws java.lang.Exception {
        try{
            Scanner sc = new Scanner(System.in);
            int t = sc.nextInt();
            for (int i = 0; i < t; i++) {
                int x = sc.nextInt();
                int y = sc.nextInt();
                System.out.println(Math.abs(x-y));
            }
        }catch (Exception e){
            return;
        }
    }
}