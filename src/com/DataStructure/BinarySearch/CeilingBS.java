package com.DataStructure.BinarySearch;

public class CeilingBS {
    public static void main(String[] args) {
        int[] sortedArray = {2,4,5,6,9,11,12,17,19,21};
//        int[] sortedArray = {21,19,17,12,11,9,6,5,4,2};

        int key = 1;
        int ans = ceilingSearch(sortedArray,key);
        System.out.println("Ceiling is located at index: " + ans);
    }

    private static int ceilingSearch(int[] sortedArray, int key) {
//        if key value ios more than 21 value then no ceiling in array
        if(key > sortedArray.length -1){
            return -1;
        }

        int start = 0;
        int end = sortedArray.length - 1;


        while(start <= end){
            int mid = start + (end - start) / 2;

            if(sortedArray[mid] == key){
                return mid;

            }else if(sortedArray[mid] < key){
                start = mid + 1;

            }else{
                end = mid - 1;
            }
        }
        return start;
    }
}
