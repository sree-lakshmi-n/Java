// Checks whether the given matrix is a unit matrix
package com.basics.twodimensionalarrays;

public class UnitMatrix {
    int[][] arr;
    UnitMatrix(){
        arr = new int[3][3];
    }
    UnitMatrix(int size){
        arr = new int[size][size];
    }
    UnitMatrix(int row, int col){
        arr = new int[row][col];
    }
    UnitMatrix(int[][] arr){
        this.arr = arr;
    }
    public boolean isUnitMatrix(){
        boolean isUnit = false;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i].length!= arr.length)
                return false;
            for(int j = 0; j< arr[0].length; j++){
                if(i==j)
                    isUnit = (arr[i][j] == 1)? true: false;
                else
                    isUnit = (arr[i][j] == 0)? true: false;
            }
        }
        return isUnit;
    }
    public void printArr(){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
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