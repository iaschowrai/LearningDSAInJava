package com.DataStructure.BasicProblems;

public class CountDuplicateValue {
    public static void main(String[] args) {
        int number = 11;

        countDuplicateNumber(number);
    }

    private static void countDuplicateNumber(int number){
        int count = 0;

        while (number > 0){
           int rem = number % 10;
           if(rem == 1){
               count++;
           }
            number = number / 10;
        }
        System.out.println(count);
    }
}
