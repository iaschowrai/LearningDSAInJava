package com.DataStructure.BasicProblems;

public class Palindrome {
    public static void main(String[] args) {

        String arr = "Madam";

        palindrome(arr);
        System.out.println("Simple Palindrome Checker: " + palindrome(arr));
        System.out.println();
        isPalindrome(arr);
        System.out.println("Palindrome Checker for any letter: " + isPalindrome(arr));

    }
    public static boolean palindrome(String arr){
        char[] charArray = arr.toCharArray();
        int start = 0;
        int end = arr.length()-1;

        while(start < end){
            if(charArray[start] != charArray[end]){
                return false;
            }
            start++;
            end--;
        }
        return true;
    }

    public static boolean isPalindrome(String str) {
        // Remove non-alphanumeric characters and convert to lowercase
        String cleanStr = str.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        // Compare the original and reversed strings
        String reversedStr = new StringBuilder(cleanStr).reverse().toString();
        return cleanStr.equals(reversedStr);
    }
}
