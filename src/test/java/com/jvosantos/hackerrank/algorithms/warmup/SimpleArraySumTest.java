package com.jvosantos.hackerrank.algorithms.warmup;

import org.junit.Assert;
import org.junit.Test;

public class SimpleArraySumTest {

    @Test
    public void testArrayOfNumbers() {
        Assert.assertEquals(31, SimpleArraySum.sumArray(new int[]{1, 2, 3, 4, 10, 11}));
    }

    @Test
    public void testArrayOfOneNumber() {
        Assert.assertEquals(20, SimpleArraySum.sumArray(new int[]{20}));
    }
}
