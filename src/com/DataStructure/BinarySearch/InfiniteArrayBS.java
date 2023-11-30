package com.DataStructure.BinarySearch;

public class InfiniteArrayBS {
    public static void main(String[] args) {
        int[] arr = {2,4,5,6,9,11,12,17,19,21};
        int key = 22;
        int ascResult = infinitArray(arr, key);
        System.out.println("key found at index: " + ascResult);

    }

    private static int infinitArray(int[] arr, int key) {
        int start = 0;
        int end = 1;
        while(end < arr.length && key > arr[end]){
            int temp = end + 1;
            end = end + (end - start + 1) * 2;
            start = temp;
        }
        return bS(arr,key,start, end - 1);
    }

    private static int bS(int[] arr, int key, int start,int  end) {

        while(start <= end) {
            int mid = start + (end - start)  / 2;
            if(arr[mid] == key){
                return mid;
            }
            else if (arr[mid] > key ){
                end = mid - 1;

            }
            else{
                start = mid + 1;

            }
        }
        return -1;
    }
}
