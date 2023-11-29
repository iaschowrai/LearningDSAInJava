package com.DataStructure.Easy;

public class AgnosticBinarySearch {
    public static void main(String[] args) {
//        int[] ascArr = {2,4,5,6,9,11,12,17,19,21};
        int[] ascArr = {21,19,16,14,12,11,8,5,3,1};
        int key = 19;
        int start = 0;
        int end = ascArr.length -1;
        int index;
        if(chkagnostic(ascArr, start, end)){
            index = isAscending(ascArr, key, start, end);

        }else{
            index = isDescending(ascArr, key, start, end);

        }
        System.out.println("index located at : " + index);

//        int indexAsc = agnosticBinarySearch(ascArr, key);
//        int indexDesc = agnosticBinarySearch(ascArr, key);
//
//        System.out.println("Index in Ascending Order: " + indexAsc);
//        System.out.println("Index in Descending Order: " + indexDesc);

    }

    private static boolean chkagnostic(int[] ascArr, int start,int end) {
        return ascArr[start] < ascArr[end];
    }
    private static int isAscending(int[] ascArr, int key, int start, int end) {
        if(start > end){
            return -1;
        }
        int mid = start + (end - start) / 2;

        if (ascArr[mid] == key){
            return mid;
        }else if (ascArr[mid] > key){
            return isAscending(ascArr,key,start,mid - 1);
        }else {
            return isAscending(ascArr,key,mid + 1, end);
        }
    }
    private static int isDescending(int[] ascArr, int key, int start, int end) {
        if(start > end){
            return -1;
        }
        int mid = start + (end - start) / 2;

        if (ascArr[mid] == key){
            return mid;
        }else if (ascArr[mid] > key){
            return isDescending(ascArr,key,mid + 1,end);
        }else {
            return isDescending(ascArr,key,start, mid - 1);
        }
    }

//    private static int agnosticBinarySearch(int[] arr, int key) {
//        int start = 0;
//        int end = arr.length - 1;
//
//        boolean isAsc = arr[start] <= arr[end];
//
//        while (start <= end) {
//            int mid = start + (end - start) / 2;
//
//            if (arr[mid] == key) {
//                return mid;
//            }
//
//            if (isAsc) {
//                if (arr[mid] < key) {
//                    start = mid + 1;
//                } else {
//                    end = mid - 1;
//                }
//            } else {
//                if (arr[mid] < key) {
//                    end = mid - 1;
//                } else {
//                    start = mid + 1;
//                }
//            }
//        }
//
//        return -1; // Element not found
//    }
}
