package com.DataStructure.BasicProblems;

public class ReverseNumber {
    public static void main(String[] args) {
        int number = 123456789;
        String word = "Hello";
        reverseNumber(number);
        reverseString(word);

    }
    public static void reverseNumber( int number) {
        int original = number;
        int ans = 0;

        while (number > 0) {
            int rem = number % 10;
            number = number / 10;
            ans = ans * 10 + rem;
        }
        System.out.println(original + " to Reverse Number: " +  ans);
    }

    public static void reverseString(String word) {

        String str = new StringBuilder(word).reverse().toString();

        System.out.println(word +  " to Reverse word: " + str );
    }

}
