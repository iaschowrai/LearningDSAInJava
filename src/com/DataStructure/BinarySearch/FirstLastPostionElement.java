package com.DataStructure.BinarySearch;

import java.util.Arrays;

public class FirstLastPostionElement {
    public static void main(String[] args) {
        int[] arr = {5,7,7,8,8,10};
        int target = 7;

        int[] ans = firstLastOccurance(arr, target);
        System.out.println("First and last occurance index at: " + Arrays.toString(ans));
    }

    private static int[] firstLastOccurance(int[] arr, int target) {
        int[] index = {-1, -1};

        index[0] = firstOccurance(arr,target, true);
        index[1] = firstOccurance(arr,target, false);

        return index;
    }

    private static int firstOccurance(int[] arr, int target, boolean firstIndexOccurance) {
        int index = -1;
        int start = 0;
        int end = arr.length -1;

        while(start <= end){
            int mid = start + (end - start) / 2;
// Over here check the the first and last index of occurance
            if(arr[mid] == target){
                index = mid;
                if(firstIndexOccurance){
                    end = mid -1;
                }else{
                    start = mid + 1;
                }

            }else if(arr[mid] < target){
                start = mid + 1;
            }else{
                end = mid - 1;
            }
        }
        return index;
    }
}
