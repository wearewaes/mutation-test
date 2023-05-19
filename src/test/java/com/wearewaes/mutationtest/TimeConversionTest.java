package com.wearewaes.mutationtest;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class TimeConversionTest {

    @Test
    public void testConversionFrom_11pm_to_24h_format() {
        TimeConversion timeConversion = new TimeConversion();
        assertEquals("23:00:00", timeConversion.convert("11:00:00PM"));
    }

    @Test
    public void testTimeConversion_18AM_to_24h_format() {
        TimeConversion timeConversion = new TimeConversion();
        assertEquals("06:00:00", timeConversion.convert("18:00:00AM"));
    }

    @Test
    public void testTimeConversion_09am_to_24h_format() {
        TimeConversion timeConversion = new TimeConversion();
        assertEquals("09:00:00", timeConversion.convert("09:00:00AM"));
    }

    @Test
    public void testTimeConversionFail() {
        TimeConversion timeConversion = new TimeConversion();
        assertNotEquals("24:00:00", timeConversion.convert("12:00:00PM"));
    }


    @Test
    public void testTimeConversion_12AM_to_00() {
        TimeConversion timeConversion = new TimeConversion();
        assertEquals("00:00:00", timeConversion.convert("12:00:00AM"));
    }
}
