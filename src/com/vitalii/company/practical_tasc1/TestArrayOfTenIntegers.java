package com.vitalii.company.practical_tasc1;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class TestArrayOfTenIntegers {

    @Test
    public void testGetCompareAmounts() {
        assertEquals(8, ArreyOfTenIntegers.getCompareAmounts(9,1));
        assertEquals(0, ArreyOfTenIntegers.getCompareAmounts(3,3));
        assertEquals(-2, ArreyOfTenIntegers.getCompareAmounts(4,6));

    }

    @Test
    public void testGetBiggest() {
        int[] arr1 = {-1, 3, 0, 3, 4, 1};
        assertEquals(4 , ArreyOfTenIntegers.getBiggest(arr1));
        int[] arr2 = {-1, -5, -4, -2, -11, -22};
        assertEquals(-1 , ArreyOfTenIntegers.getBiggest(arr2));
        int[] arr3 = {0};
        assertEquals(0 , ArreyOfTenIntegers.getBiggest(arr3));
    }
}