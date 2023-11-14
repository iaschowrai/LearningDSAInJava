package com.DataStructure.BasicProblems;

import java.util.Arrays;

public class moveZero {
    public static void main(String[] args) {
        int[] arr = {0,1,0,4,2};
        moveZeros(arr);
    }

    public static void moveZeros(int[] arr){

        int changeValue = 0;

        for (int i = 0; i < arr.length; i++) {
            if(arr[i] != 0 && arr[changeValue] ==0){
                int temp = arr[i];
                arr[i] = arr[changeValue];
                arr[changeValue] = temp;
            }
            if(arr[changeValue] != 0 ){
                changeValue++;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
