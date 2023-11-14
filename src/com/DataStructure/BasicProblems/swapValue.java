package com.DataStructure.BasicProblems;

import java.util.Arrays;

public class swapValue {
    public static void main(String[] args) {
        int[] arr = { 2, 9, 3, 6};
        swapValueInArray(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void swapValueInArray(int[] arr){
        int start = 0;
        int end = arr.length - 1;
        int temp;

        temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
    }
}
