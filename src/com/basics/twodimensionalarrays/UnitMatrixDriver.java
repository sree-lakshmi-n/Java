// Checks whether the given matrix is a unit matrix
package com.basics.twodimensionalarrays;

class UnitMatrix {
    int[][] arr;
    /* Constructor Overloading */
    UnitMatrix() {              // Non-parameterized constructor
        arr = new int[3][3];
    }
    UnitMatrix(int size) {      // Parameterized constructor
        arr = new int[size][size];
    }
    UnitMatrix(int row, int col) {  // Parameterized constructor
        arr = new int[row][col];
    }
    UnitMatrix(int[][] arr) {       // Parameterized constructor
        this.arr = arr;
    }
    public boolean isUnitMatrix() {     // Checks whether given matrix is unit matrix
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].length != arr.length)    // checks if no. of cols = no. of rows
                return false;
            for (int j = 0; j < arr[0].length; j++) {
                if (i == j) {
                    if (arr[i][j] != 1) return false;       // Every diagonal element should be 1
                } else if (arr[i][j] != 0) return false;   // Every non diagonal element should be 0
            }
        }
        return true;
    }
    public void printArr(){             // Prints the array
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}
public class UnitMatrixDriver{      // Driver class to test functionality of UnitMatrix class
    public static void main(String[] args) {
        UnitMatrix un1 = new UnitMatrix();
        System.out.println("Matrix 1");
        un1.printArr();
        if(un1.isUnitMatrix())
            System.out.println("This is a unit matrix");
        else
            System.out.println("This is not a unit matrix");

        UnitMatrix un2 = new UnitMatrix(6);
        System.out.println("Matrix 2");
        un2.printArr();
        if(un2.isUnitMatrix())
            System.out.println("This is a unit matrix");
        else
            System.out.println("This is not a unit matrix");

        UnitMatrix un3 = new UnitMatrix(3,4);
        System.out.println("Matrix 3");
        un3.printArr();
        if(un3.isUnitMatrix())
            System.out.println("This is a unit matrix");
        else
            System.out.println("This is not a unit matrix");

        UnitMatrix un4 = new UnitMatrix(new int[][]{
                {1,2,3,4},{6,7,8,9},{2,3,4,5}});
        System.out.println("Matrix 4");
        un4.printArr();
        if(un4.isUnitMatrix())
            System.out.println("This is a unit matrix");
        else
            System.out.println("This is not a unit matrix");

        UnitMatrix un5 = new UnitMatrix(new int[][]{
                        {1,0,0},{0,1,0},{0,0,1} });
        System.out.println("Matrix 5");
        un5.printArr();
        if(un5.isUnitMatrix())
            System.out.println("This is a unit matrix");
        else
            System.out.println("This is not a unit matrix");

        UnitMatrix un6 = new UnitMatrix(new int[][]{
                {1,0,0,0,0},{0,1,0,0,0},{0,0,1,0,0},{0,0,0,1,0},{0,0,0,0,1} });
        System.out.println("Matrix 6");
        un6.printArr();
        if(un6.isUnitMatrix())
            System.out.println("This is a unit matrix");
        else
            System.out.println("This is not a unit matrix");

        UnitMatrix un7 = new UnitMatrix(new int[][]{
                {-1,0,0},{0,-1,0},{0,0,-1} });
        System.out.println("Matrix 7");
        un7.printArr();
        if(un7.isUnitMatrix())
            System.out.println("This is a unit matrix");
        else
            System.out.println("This is not a unit matrix");
    }
}