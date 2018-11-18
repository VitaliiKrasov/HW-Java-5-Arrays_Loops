package com.vitalii.company.test;

import org.testng.annotations.Test;

import static com.vitalii.company.main.practical_tasc1.ArreyOfTenIntegers.*;
import static org.testng.Assert.assertEquals;

public class ArrayOfTenIntegersTest {
    int[] arr1 = {-1, 3, 0, 3, 4, -1};
    int[] arr2 = {1, 3, 0, 3, 4, 1};
    int[] arr3 = {-1, -1, -2, -3, -5, -8};
    int[] arr4 = {-1, -1, 0, -3, -5, -8};
    @Test
    public void testGetBiggest() {
        assertEquals(4 , getBiggest(arr1));
        assertEquals(4 , getBiggest(arr2));
        assertEquals(-1 , getBiggest(arr3));
        assertEquals(0 , getBiggest(arr3));
    }
    @Test
    public void testGetAmountOfNegative() {
        assertEquals(2 , getAmountOfNegative(arr1));
        assertEquals(0 , getAmountOfNegative(arr2));
        assertEquals(6 , getAmountOfNegative(arr3));
        assertEquals(5 , getAmountOfNegative(arr3));
    }
    @Test
    public void testGetAmountOfPositive() {
        assertEquals(3 , getAmountOfPositive(arr1));
        assertEquals(5 , getAmountOfPositive(arr2));
        assertEquals(0 , getAmountOfPositive(arr3));
        assertEquals(0 , getAmountOfPositive(arr3));
    }
    @Test
    public void testSumOfPositive() {
        assertEquals(10 , getSumOfPositive(arr1));
        assertEquals(12 , getSumOfPositive(arr2));
        assertEquals(0 , getSumOfPositive(arr3));
        assertEquals(0 , getSumOfPositive(arr3));
        assertEquals(0 , getSumOfPositive(arr3));
    }
    @Test
    public void testGetCompareAmounts() {
        assertEquals(8, getCompareAmounts(9,1));
        assertEquals(0, getCompareAmounts(3,3));
        assertEquals(-2, getCompareAmounts(4,6));

    }
}