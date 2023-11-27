package com.DataStructure.OOP;
// Importing Scanner class for user input

import java.util.Scanner;
public class RewardsConverter {
     public static void main(String[] args) {
         // Creating a Scanner object for user input
         var scanner = new Scanner(System.in);

         // Welcome message
         System.out.println("Welcome to the Credit Card Rewards Converter!");
         System.out.println("Please enter a cash value to convert to airline miles: ");

         // Reading user input for cash value
         var input_value = scanner.nextLine();
         double cashValue;

         // Handling potential NumberFormatException if the input is not a valid double
         try {
             cashValue = Double.parseDouble(input_value);
         } catch (NumberFormatException exception) {
             System.out.println("Could not parse input value as a double, exiting");
             return;
         }


         // Displaying conversion information
         System.out.println("Converting $" + input_value + " to miles");

         // Creating a RewardValue object with the provided cash value
         var rewardsValue = new RewardValue(cashValue);

         // Displaying the converted miles value
         System.out.println("$" + input_value + " is worth " + rewardsValue.getMilesValue() + " miles");

     }
}


