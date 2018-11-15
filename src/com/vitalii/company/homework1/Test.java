package com.vitalii.company.homework1;

import static org.testng.Assert.*;
public class Test {

    @org.testng.annotations.Test
    public void testGetAmountDayOfMonth() {
        assertEquals(28, Homework1.getAmountDayOfMonth(2));
        assertEquals(31, Homework1.getAmountDayOfMonth(3));
        assertEquals(31, Homework1.getAmountDayOfMonth(10));
        assertEquals(31, Homework1.getAmountDayOfMonth(12));
    }
}