package com.DataStructure.BinarySearch;

public class StringGreaterTarget {
    public static void main(String[] args) {
        char[] letters = {'c', 'f', 'j' };
        char key = 'k';
        char ans = smallestLetter(letters,key);
        System.out.println("smallest letter is located at index: " + ans);
    }

    private static char smallestLetter(char[] letters, char key) {
        int start = 0;
        int end = letters.length - 1;

        while(start <= end){

            int mid = start + (end - start) / 2;

            if(letters[mid] < key){
                start = mid + 1;

            }else{
                end = mid - 1;
            }
        }
//        return letters[start % letters.length];
        return start < letters.length ? letters[start] : letters[0];
    }

}
