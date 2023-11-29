package com.DataStructure.BinarySearch;

public class BinarySearch {
    public static void main(String[] args) {
        int[] ascArr = {2,4,5,6,9,11,12,17,19,21};
        int[] descArr = {21,19,16,14,12,11,8,5,3,1};
        int key = 19;
        int ascResult = ascBS(ascArr, key);
        int descResult = descBS(descArr, key );
        System.out.println("key found at index: " + ascResult);
        System.out.println("key found at index: " + descResult);

    }

    private static int descBS(int[] descArr, int key) {
        int start = 0;
        int end = descArr.length - 1;

        while(start <= end) {
            int mid = start + (end - start)  / 2;
            if(descArr[mid] == key){
                return mid;
            }
            else if (descArr[mid] > key ){
                start = mid + 1;
            }
            else{
                end = mid - 1;
            }
        }
        return -1;
    }

    private static int ascBS(int[] ascArr, int key) {
        int start = 0;
        int end = ascArr.length - 1;

        while(start <= end){
            int mid = start +  (end - start)  / 2;
            if(ascArr[mid] == key){
                return mid;
            }
            else if(ascArr[mid] > key){
                end = mid - 1;
            }
            else{
                start = mid + 1;
            }
        }
        return -1;
    }
}
