package com.DataStructure.OOP;

public class RewardValue {
        // Private field to store the cash value of the reward
        private final double cashValue;


        // Constant representing the conversion rate from miles to cash
        public static final double MILES_TO_CASH_CONVERSION_RATE = 0.0035;

        // Constructor to initialize the RewardValue with a cash value
        public RewardValue(double cashValue) {
            this.cashValue = cashValue;
        }

        // Constructor to initialize the RewardValue with miles, converting from miles to cash
        public RewardValue(int milesValue) {
            this.cashValue = convertToCash(milesValue);
        }

        // Private method to convert cash value to miles
        private static int convertToMiles(double cashValue) {
            return (int) (cashValue / MILES_TO_CASH_CONVERSION_RATE);
        }

        // Private method to convert miles to cash value
        private static double convertToCash(int milesValue) {
            return milesValue * MILES_TO_CASH_CONVERSION_RATE;
        }

        // Getter method to retrieve the cash value of the reward
        public double getCashValue() {
            return cashValue;
        }

        // Getter method to convert the cash value to miles
        public int getMilesValue() {
            return convertToMiles(this.cashValue);
        }
    }


