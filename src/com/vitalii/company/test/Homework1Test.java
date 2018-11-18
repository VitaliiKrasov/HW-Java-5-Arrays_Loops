package com.vitalii.company.test;

import com.vitalii.company.main.homework1.Homework1;
import org.testng.Assert;

import static org.testng.Assert.*;
public class Homework1Test {

    @org.testng.annotations.Test
    public void testGetAmountDayOfMonth() throws Exception {
        Assert.assertEquals(31, Homework1.getAmountDayOfMonth(1));
        assertEquals(28, Homework1.getAmountDayOfMonth(2));
        assertEquals(31, Homework1.getAmountDayOfMonth(3));
        assertEquals(31, Homework1.getAmountDayOfMonth(10));
        assertEquals(31, Homework1.getAmountDayOfMonth(12));
    }

}