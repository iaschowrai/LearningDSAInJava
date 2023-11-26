package com.DataStructure.BasicProblems;

import java.util.Scanner;

public class SimpleFib {


    public static void printFibonacciSequence(int limit) {
        int first = 0;
        int second = 1;

        while (first <= limit) {
            System.out.print(first + " ");

            int next = first + second;
            first = second;
            second = next;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the limit for Fibonacci sequence: ");
        int limit = scanner.nextInt();

        System.out.println("Fibonacci sequence up to " + limit + ":");
        printFibonacciSequence(limit);

        scanner.close();
    }

}
