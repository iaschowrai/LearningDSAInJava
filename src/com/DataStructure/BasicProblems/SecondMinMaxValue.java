package com.DataStructure.BasicProblems;

public class SecondMinMaxValue {
    public static void main(String[] args) {
        int[] arr = {4,3,9,1,2,22};
        secondMinValueInArray(arr);
        secondMaxValueInArray(arr);
    }

    public static void secondMinValueInArray(int[] arr){

        int firstMin = Integer.MAX_VALUE;
        int secondMin = Integer.MAX_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if(firstMin > arr[i]){
                secondMin=firstMin;
                firstMin = arr[i];
            }
            else if(arr[i] < secondMin && arr[i] != firstMin){
                secondMin = arr[i];
            }

        }
        System.out.println(firstMin);
        System.out.println(secondMin);

    }

    public static void secondMaxValueInArray(int[] arr){

    }
}
