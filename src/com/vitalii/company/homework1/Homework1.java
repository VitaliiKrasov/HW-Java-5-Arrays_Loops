package com.vitalii.company.homework1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Ask user to enter the number of month.
 * Read the value and write the amount of days in this month (create array with amount days of each month).
 * Enter 10 integer numbers.
 * Calculate the sum of first 5 elements if they are positive or product of last 5 element in the other case.
 */

public class Homework1 {
    final static int[] amountDaysOfMonth = new int[] { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

    static int getAmountDayOfMonth(int i) {
        return amountDaysOfMonth[i - 1];
    }


    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter the number of month");
        int input = Integer.parseInt(reader.readLine());
        System.out.println(getAmountDayOfMonth(input));

    }
}
