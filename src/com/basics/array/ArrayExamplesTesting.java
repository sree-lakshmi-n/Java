// Various array operations

package com.basics.arrays;

import java.util.Arrays;

class ArrayExamples {
    private int[] arrVariable;

    /* Constructor Overloading */
    public ArrayExamples(){
        this.arrVariable = new int[]{1,2,3,4,5};
    }
    public ArrayExamples(int size){
        this.arrVariable = new int[size];
    }
    public ArrayExamples(int[] arr){
        this.arrVariable = arr;
    }

    /* Method Overloading */
    // Adds element at the end of an array
    public int[] addElement(int element){
        int arrLen = this.arrVariable.length;
        int[] newArr = new int[arrLen + 1];
        for (int i = 0; i<arrLen; i++) {
            newArr[i] = this.arrVariable[i];
        }
        newArr[arrLen] = element;
        this.arrVariable = newArr;
        return arrVariable;
    }
    // Adds element at a particular index of an array
    public int[] addElement(int element, int pos){
        int arrLen = this.arrVariable.length;
        int[] newArr = new int[arrLen + 1];
        for (int i = 0; i< newArr.length; i++) {
            if(i < pos) newArr[i] = this.arrVariable[i];
            else if(i == pos) newArr[i] = element;
            else newArr[i] = this.arrVariable[i-1];
        }
        this.arrVariable = newArr;
        return arrVariable;
    }

    private boolean isValidIndex(int index){
        if(this.arrVariable == null || index<0 || index>= this.arrVariable.length)
            return false;
        else return true;
    }
    // Deletes an element in given index
    public boolean deleteElement(int index){
        int arrLen = this.arrVariable.length;
        if(isValidIndex(index)){
            int[] newArr = new int[arrLen - 1];
            for (int i = 0; i < newArr.length; i++) {
                if(i < index) newArr[i] = arrVariable[i];
                else if(i == index) continue;
                else newArr[i-1] = arrVariable[i];
            }
            this.arrVariable = newArr;
            return true;
        }
        return false; // If index isn't valid, false is returned.
    }

    // Checks whether array contains the given element
    public boolean contains(int element){
        for (int i: this.arrVariable) {
            if(i == element) return true;
        }
        return false;
    }

    // Returns element at given index
    public int getElement(int index){
        if(isValidIndex(index))
            return this.arrVariable[index];
        else {
            print("Invalid index");
            return -1; // Workaround. Efficient method need to be found.
        }
    }

    // Modifies element at given index
    public int[] modifyElement(int element, int index){
        if(isValidIndex(index)){
            this.arrVariable[index] = element;
        }
        return this.arrVariable;
    }

    /* Method Overloading */
    // To find max of arrVariable
    public int max(){
        int max = arrVariable[0];
        for (int i: arrVariable) {
            if(i > max)
                max = i;
        }
        return max;
    }
    // To find max of given array
    public int max(int[] arr){
        int max = arr[0];
        for (int i: arr) {
            if(i > max)
                max = i;
        }
        return max;
    }
    // To find min of arrVariable
    public int min(){
        int min = arrVariable[0];
        for (int i: arrVariable) {
            if(i < min)
                min = i;
        }
        return min;
    }
    // To find min of given array
    public int min(int[] arr){
        int min = arr[0];
        for (int i: arr) {
            if(i < min)
                min = i;
        }
        return min;
    }

    /* Method Overloading */
    // Returns length of given array
    public int length(){
        return arrVariable.length;
    }
    public int length(int[] arr){
        return arr.length;
    }

    // To compare two arrays
    public boolean compareArray(int[] data){
        if(this.arrVariable.length == data.length){
            for (int i =0; i<this.arrVariable.length; i++) {
                if(arrVariable[i] == data[i]) {
                    continue;
                }
                else return false;
            }
            return true;
        }
        return false;
    }

    /* Print functions */
    public void print(Object result){
        System.out.println(result);
    }
    public void printArr(){
        System.out.println(Arrays.toString(this.arrVariable));
    }
    public void printArr(int[] arr){
        System.out.println(Arrays.toString(arr));
    }
}

public class ArrayExamplesTesting{
    public static void main(String[] args) {
        ArrayExamples a1 = new ArrayExamples();
        a1.print("a1 arrVariable: ");
        a1.printArr();

        a1.print("______________________________________");

        a1.print("Adding elements to a1 arrVariable");
        for (int j : new int[]{5, 50, 500, 578}) {
            a1.addElement(j);
            a1.printArr();
        }

        a1.print("______________________________________");

        ArrayExamples a2 = new ArrayExamples(6);
        a2.print("a2 arrVariable: ");
        a2.printArr();

        a1.print("______________________________________");

        a1.print("Adding elements at various indices to a2 arrVariable");
        a2.addElement(30,2);
        a2.printArr();
        a2.addElement(32,0);
        a2.printArr();
        a2.addElement(50,1);
        a2.printArr();
        a2.addElement(37,6);
        a2.printArr();
        a2.addElement(7,10);
//        a2.addElement(37,11); // throws ArrayIndexOutOfBoundsException
        a2.printArr();

        a1.print("______________________________________");

        a1.print("Deleting elements at various indices from a2 arrVariable");
        for (int j = 0; j < 3; j++) {
            if(a2.deleteElement(2)) a2.printArr();
        }
        if(a2.deleteElement(10)) a2.printArr(); // Won't print anything because of
        // ArrayIndexOutOfBoundsException

        a1.print("______________________________________");

        a1.print("Checking if array contains given value. ");
        if(a1.contains(1)) a1.print("Array contains given value");
        else a1.print("Array does not contain given value");
        if(a2.contains(1)) a1.print("Array contains given value");
        else a1.print("Array does not contain given value");
        if(a2.contains(0)) a2.print("Array contains given value");
        else a2.print("Array does not contain given value");

        a1.print("______________________________________");

        a2.print("Fetching given element from array. ");
        a1.print(a1.getElement(2));
        a1.print(a2.getElement(6));
        a1.print(a2.getElement(0));

        a1.print("______________________________________");

        a1.print("a3 arrVariable: ");
        int[] arr = new int[]{10,20,30,40,50};
        ArrayExamples a3 = new ArrayExamples(arr);
        a3.printArr();

        a1.print("______________________________________");

        a3.print("Modifying elements at given indices of a3 arrVariable");
        a3.modifyElement(3,3);
        a3.printArr();
        a3.modifyElement(90,4);
        a3.printArr();

        a1.print("______________________________________");

        a1.print("Length of arrVariables of objects a1, a2, and a3 respectively: ");
        for (ArrayExamples arrayExamples : Arrays.asList(a1, a2, a3)) {
            Integer length = arrayExamples.length();
            a1.print(length);
        }

        a1.print("______________________________________");

        a1.print("Max values of arrVariables of objects a1, a2, and a3 respectively: ");
        for (ArrayExamples arrayExamples : Arrays.asList(a1, a2, a3)) {
            a1.print(arrayExamples.max());
        }

        a1.print("______________________________________");

        a1.print("Min values of arrVariables of objects a1, a2, and a3 respectively: ");
        for (ArrayExamples arrayExamples : Arrays.asList(a1, a2, a3)) {
            a1.print(arrayExamples.min());
        }

        a1.print("______________________________________");

        int[] arr1 = new int[]{4,5,6,3,3};
        int[] arr2 = new int[]{34,67,12,45,78,34,24,5};
        int[] arr3 = new int[]{1,4,5,2,5,1,7,3,0,7,89,45};

        a1.print("arr1, arr2, and arr3 respectively: ");
        for (int[] ints : Arrays.asList(arr1, arr2, arr3)) {
            a1.printArr(ints);
        }

        a1.print("______________________________________");

        a1.print("Max elements of arr1, arr2, and arr3 , Min elements of arr1, arr2, and arr3 respectively. ");
        for (int i : new int[]{a1.max(arr1), a2.max(arr3), a3.max(arr2), a1.min(arr2), a2.min(arr3), a3.min(arr1)}) {
            a1.print(i);
        }

        a1.print("______________________________________");

        a1.print("arr1 compared with a1's arrVariable: ");
        if(a1.compareArray(arr1))
            a1.print("Both arrays are equal");
        else
            a1.print("Both arrays are not equal");

        a1.print("______________________________________");

        int[] arr4 = {10, 20, 30, 3, 90};
        a1.print("arr4: ");
        a1.printArr(arr4);
        a1.print("arr4 compared with a3's arrVariable: ");
        if(a3.compareArray(arr4))
            a3.print("Both arrays are equal");
        else
            a3.print("Both arrays are not equal");

        a1.print("______________________________________");
    }
}