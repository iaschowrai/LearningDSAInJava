package com.DataStructure.BinarySearch;

public class AgnosticBSearchRecursion {
    public static void main(String[] args) {
//        int[] ascArr = {2,4,5,6,9,11,12,17,19,21};
        int[] ascArr = {21,19,16,14,12,11,8,5,3,1};
        int key = 1;

        int start = 0;
        int end = ascArr.length -1;
        int index;

        if(chkagnostic(ascArr, start, end)){
            index = isAscending(ascArr, key, start, end);

        }else{
            index = isDescending(ascArr, key, start, end);

        }
        System.out.println("index located at : " + index);
    }
//  Agnostic Check
    private static boolean chkagnostic(int[] ascArr, int start,int end) {
        return ascArr[start] < ascArr[end];
    }
//    Ascending
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
//    Descending
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

}
