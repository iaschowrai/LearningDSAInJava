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
                secondMin = firstMin;
                firstMin = arr[i];
            }
            else if(arr[i] < secondMin && arr[i] != firstMin){
                secondMin = arr[i];
            }

        }
        System.out.println("Find Minimum Number ");
        System.out.println("First Min Value : " + firstMin);
        System.out.println("Second Min Value : " + secondMin);
        System.out.println();

    }

    public static void secondMaxValueInArray(int[] arr){
        int firstMax = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if(firstMax < arr[i]){
                secondMax = firstMax;
                firstMax = arr[i];
            }
            else if(arr[i] < secondMax && arr[i] != firstMax){
                secondMax = arr[i];
            }

        }

        System.out.println("Find Maximum Number ");
        System.out.println("First Max Value : " + firstMax);
        System.out.println("Second Max Value : " + secondMax);
    }
}
