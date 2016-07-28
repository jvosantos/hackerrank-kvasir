package com.jvosantos.hackerrank.tutorials.thirtydaysofcode.day10;

import com.jvosantos.hackerrank.tutorials.thirtydaysofcode.day10.BinaryNumbers;
import org.junit.Assert;
import org.junit.Test;

public class BinaryNumbersTest {
    @Test
    public void testMaxConsecutiveOnesWithAllZeros() {
        Assert.assertEquals(0, BinaryNumbers.getMaximumConsecutiveOnes(Integer.parseInt("000000", 2)));
    }

    @Test
    public void testMaxConsecutiveOnesWithAllOnes() {
        Assert.assertEquals(6, BinaryNumbers.getMaximumConsecutiveOnes(Integer.parseInt("111111", 2)));
    }

    @Test
    public void testMaxConsecutiveOnesWithMaxInMiddle() {
        Assert.assertEquals(2, BinaryNumbers.getMaximumConsecutiveOnes(Integer.parseInt("101101", 2)));
    }

    @Test
    public void testMaxConsecutiveOnesStrictlyDecreasing() {
        Assert.assertEquals(3, BinaryNumbers.getMaximumConsecutiveOnes(Integer.parseInt("111011", 2)));
    }

    @Test
    public void testMaxConsecutiveOnesStrictlyIncreasing() {
        Assert.assertEquals(3, BinaryNumbers.getMaximumConsecutiveOnes(Integer.parseInt("110111", 2)));
    }

    @Test
    public void testMaxConsecutiveOnesWithAlternatingPattern() {
        Assert.assertEquals(1, BinaryNumbers.getMaximumConsecutiveOnes(Integer.parseInt("101010", 2)));
    }
}
