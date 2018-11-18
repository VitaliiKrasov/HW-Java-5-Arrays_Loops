package com.vitalii.company.main.homework3;

import java.io.IOException;
import java.util.Scanner;

/**
 * Enter 5 integer numbers. Find
 * - position of second positive number;
 * - minimum and its position in the array.
 * Organize entering integers until the first negative number.
 * Count the product of all entered even numbers.
 */
public class Homework3 {

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[5];
        System.out.println("Enter five integers:");
        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }
        System.out.println("\nPosition of second positive number: " + getPositive(array, 2));
        int min = getMinimum(array);
        System.out.println("\nMinimum and its position in the array: " + min + getAllPositions(array, min));
    }

    static int getMinimum(int[] array) {
        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (min > array[i]) {
                min = array[i];
            }
        }
        return min;
    }

    static String getAllPositions(int[] array, int value) {
        String result = "";
        for (int i = 0; i < array.length; i++) {
            if (array[i] == value) {
                result += (",[" + i + "]");
            }
        }
        return result;
    }

    static String getPositive(int[] array, int order) {
        int count = 0;
        String result = "not find";
        for (int i = 0; i < array.length; i++) {
            if (array[i] > 0) {
                count++;
                if (count == order) {
                    result = "[" + i + "]";
                    break;
                }
            }
        }
        return result;
    }
}
