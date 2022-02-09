// Printing 2D Arrays
package com.basics.twodimensionalarrays;

public class PrintTwoDimArray {
    int[][] data;
    public PrintTwoDimArray(int[][] data){
        this.data = data;
    }
    public void printArr(){
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data[i].length; j++) {
                System.out.print(data[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        PrintTwoDimArray twod1 = new PrintTwoDimArray(new int[][]{
                {1,2,3,4},{6,7,8,9},{2,3,4,5}
        });
        PrintTwoDimArray twod2 = new PrintTwoDimArray(new int[][]{
                {1,0,0},{0,1,0},{0,0,1}
        });
        PrintTwoDimArray twod3 = new PrintTwoDimArray(new int[][]{
                {9,8,7,6},{99,88,66,77,55,44},{0,1,23,4,56,88}
        });
        twod1.printArr();
        System.out.println("======================");
        twod2.printArr();
        System.out.println("======================");
        twod3.printArr();
    }
}