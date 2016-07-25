package com.jvosantos.hackerrank.tutorials.thirtydaysofcode;

import org.junit.Assert;
import org.junit.Test;

public class TwoDArraysTest {

    @Test
    public void testOneHourglass() {
        int[][] hourglass = new int [][]{{1, 1, 1, 0, 0, 0},
        {0, 1, 0, 0, 0, 0},
        {1, 1, 1, 0, 0, 0},
        {0, 0, 2, 4, 4, 0},
        {0, 0, 0, 2, 0, 0},
        {0, 0, 1, 2, 4, 0}};

        Assert.assertEquals(19, TwoDArrays.findMaximumHourglassSum(hourglass));
    }

}
