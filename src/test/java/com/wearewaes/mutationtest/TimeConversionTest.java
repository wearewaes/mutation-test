package com.wearewaes.mutationtest;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

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
}
