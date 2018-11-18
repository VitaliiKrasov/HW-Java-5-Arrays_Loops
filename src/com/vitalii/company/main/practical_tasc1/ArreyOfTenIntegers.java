package com.vitalii.company.main.practical_tasc1;

import java.util.Random;

/**
 * Create an array of ten integers.
 * Display:
 * - the biggest of these numbers;
 * - the sum of positive numbers in the array;
 * - the amount of negative numbers in the array.
 * What values there are more: negative or positive?
 */

public class ArreyOfTenIntegers {
    public static void main(String[] args) {
        int[] array = new int[10];

        Random random = new Random();
        System.out.print("[");
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(21) - 10;
            System.out.print(array[i]);
            if (i < array.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.print("]\n");

        int biggest = getBiggest(array);
        System.out.println("the biggest of these numbers is " + biggest);

        System.out.println("the sum of positive numbers in the array is: " + getSumOfPositive(array));
        System.out.println("the amount of negative numbers in the array: " + getAmountOfNegative(array));

        int compareAmounts = getCompareAmounts(getAmountOfPositive(array), getAmountOfNegative(array));

        if (compareAmounts > 0) {
            System.out.println("the positive values there are more then negative");
        } else if (compareAmounts < 0) {
            System.out.println("the negative values there are more then positive");
        } else {
            System.out.println("the amounts of positive and negative values there are equel");
        }


    }

    public static int getBiggest(int[] array) {
        int biggest;
        biggest = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > biggest) {
                biggest = array[i];
            }
        }
        return biggest;
    }

    public static int getSumOfPositive(int[] array) {
        int result = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > 0) {
                result += array[i];
            }
        }
        return result;
    }

    public static int getAmountOfNegative(int[] array) {
        int result = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] < 0) {
                result++;
            }
        }
        return result;
    }

    public  static int getAmountOfPositive(int[] array) {
        int result = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > 0) {
                result++;
            }
        }
        return result;
    }

    public static int getCompareAmounts(int amountOfPositive, int amountOfNegative) {
        return amountOfPositive - amountOfNegative;
    }
}
