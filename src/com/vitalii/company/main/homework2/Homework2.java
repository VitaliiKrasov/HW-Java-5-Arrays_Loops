package com.vitalii.company.main.homework2;

import java.util.Random;

/**
 * Enter 10 integer numbers.
 * Calculate the sum of first 5 elements if they are positive
 * or product of last 5 element in the other case.
 */
public class Homework2 {
    public static void main(String[] args) {
        Random random = new Random();
        int[] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = -5 + random.nextInt(31);
            System.out.print(array[i] + " ");
        }

        System.out.println("\n" + Calculate(array));
    }

    private static int Calculate(int[] array) {
        int sumOfFirstFive = 0;
        int productOfLastFive = 1;
        boolean isFirstFivePositive = true;

        for (int i = 0; i < 5; i++) {
            if (array[i] > 0) {
                sumOfFirstFive += array[i];
            } else {
                isFirstFivePositive = false;
                break;
            }
        }

        if (isFirstFivePositive) {
            return sumOfFirstFive;
        } else for (int i = 5; i < 10; i++) {
            productOfLastFive *= array[i];
        }   return productOfLastFive;
    }
}
