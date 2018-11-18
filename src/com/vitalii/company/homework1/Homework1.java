package com.vitalii.company.homework1;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * Ask user to enter the number of month.
 * Read the value and write the amount of days in this month (create array with amount days of each month).
 */

public class Homework1 {
    final static int[] AMOUNT_DAYS_OF_MONTH = new int[] { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

    static int getAmountDayOfMonth(int i) throws Exception{
        return AMOUNT_DAYS_OF_MONTH[i - 1];
    }


    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter the number of month");
        int input = Integer.parseInt(reader.readLine());
        if(0 < input && input < 13 ) {
            System.out.println(getAmountDayOfMonth(input) + "\n");
        } else System.out.println("Enter int value 1 ... 12\n");
    }
}
