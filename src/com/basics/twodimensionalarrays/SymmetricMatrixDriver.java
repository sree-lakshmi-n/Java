// Checks whether given matrix is symmetric
package com.basics.twodimensionalarrays;

class SymmetricMatrix {
    private int[][] arr;
    SymmetricMatrix(int[][] arr){
        this.arr = arr;
    }
    public String isSymmetricMatrix() {
        for (int i = 0; i < arr.length; i++) {
            if(arr.length!=arr[i].length)  // Checks if row length = column length
                return "This is not a symmetric matrix";
            for (int j = 0; j < arr[i].length; j++) {
                if(i!=j){
                    if(arr[i][j]!=arr[j][i])
                        return "This is not a symmetric matrix";
                }
            }
        }
        return "This is a symmetric matrix";
    }
    public void printArr(){
        if(arr.length<1)            // empty array check
            System.out.println("0");
        if(arr==null)
            System.out.println("Null");         // null array check
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}
public class SymmetricMatrixDriver{         // Tester class
    public static void main(String[] args) {
        int[][] arr1 = new int[][]{{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        int[][] arr2 = new int[][]{{1,0,0},{0,1,0},{0,0,1}};
        int[][] arr3 = new int[][]{{1,2,3},{2,1,4},{3,4,3}};
        int[][] arr4 = new int[][]{{3,5,8},{3,4,7},{8,5,3}};
        int[][] arr5 = new int[][]{};
        int[][] arr6 = new int[][]{{1,2},{3,4,5}};
        SymmetricMatrix sm1 = new SymmetricMatrix(arr1);
        sm1.printArr();
        System.out.println(sm1.isSymmetricMatrix());
        SymmetricMatrix sm2 = new SymmetricMatrix(arr2);
        sm2.printArr();
        System.out.println(sm2.isSymmetricMatrix());
        SymmetricMatrix sm3 = new SymmetricMatrix(arr3);
        sm3.printArr();
        System.out.println(sm3.isSymmetricMatrix());
        SymmetricMatrix sm4 = new SymmetricMatrix(arr4);
        sm4.printArr();
        System.out.println(sm4.isSymmetricMatrix());
        SymmetricMatrix sm5 = new SymmetricMatrix(arr5);
        sm5.printArr();
        System.out.println(sm5.isSymmetricMatrix());
        SymmetricMatrix sm6 = new SymmetricMatrix(arr6);
        sm6.printArr();
        System.out.println(sm6.isSymmetricMatrix());
    }
}