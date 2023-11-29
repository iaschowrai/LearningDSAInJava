package com.DataStructure.BinarySearch;

public class FloorBS {
    public static void main(String[] args) {
        int[] sortedArray = {2,4,5,6,9,11,12,17,19,21};
        int key = 20;
        int ans = floorSearch(sortedArray,key);
        System.out.println("Floor is located at index: " + ans);
    }

    private static int floorSearch(int[] sortedArray, int key) {
//        if key value ios more than 2 value then no floor in array
        if(key < sortedArray.length -1){
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
        return end;
    }
}
