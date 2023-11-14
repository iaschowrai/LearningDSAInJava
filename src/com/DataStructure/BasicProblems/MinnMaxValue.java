package com.DataStructure.BasicProblems;

public class MinnMaxValue {
    public static void main(String[] args) {
        int[] arr = {4,6,8,9,5,2};
        minValueInArray(arr);
        maxValueInArray(arr);

    }

    public static void minValueInArray(int[] arr) {

        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(min > arr[i]){
                min = arr[i];
            }
        }
        System.out.println(min + " is minimum Value in Array");

    }
    public static void maxValueInArray(int[] arr) {

        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(max < arr[i]){
                max = arr[i];
            }
        }
        System.out.println(max + " is maximum Value in Array");

    }
}
