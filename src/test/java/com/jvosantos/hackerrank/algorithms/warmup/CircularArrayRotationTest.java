package com.jvosantos.hackerrank.algorithms.warmup;

import org.junit.Assert;
import org.junit.Test;

public class CircularArrayRotationTest {

    @Test
    public void testWithOneRotation() {
        CircularArrayRotation circularArrayRotation = new CircularArrayRotation(new int[] {1, 2, 3, 4, 0});
        circularArrayRotation.rotate(1);

        for(int i = 0; i < 5; i++) {
            Assert.assertEquals(i, circularArrayRotation.get(i));
        }
    }

    @Test
    public void testWithTwoRotations() {
        CircularArrayRotation circularArrayRotation = new CircularArrayRotation(new int[] {2, 3, 4, 0, 1});
        circularArrayRotation.rotate(2);

        for(int i = 0; i < 5; i++) {
            Assert.assertEquals(i, circularArrayRotation.get(i));
        }
    }

    @Test
    public void testWithThreeRotations() {
        CircularArrayRotation circularArrayRotation = new CircularArrayRotation(new int[] {3, 4, 0, 1, 2});
        circularArrayRotation.rotate(3);

        for(int i = 0; i < 5; i++) {
            Assert.assertEquals(i, circularArrayRotation.get(i));
        }
    }

    @Test
    public void testWithFourRotations() {
        CircularArrayRotation circularArrayRotation = new CircularArrayRotation(new int[] {4, 0, 1, 2, 3});
        circularArrayRotation.rotate(4);

        for(int i = 0; i < 5; i++) {
            Assert.assertEquals(i, circularArrayRotation.get(i));
        }
    }

    @Test
    public void testWithFiveRotations() {
        CircularArrayRotation circularArrayRotation = new CircularArrayRotation(new int[] {0, 1, 2, 3, 4});
        circularArrayRotation.rotate(5);

        for(int i = 0; i < 5; i++) {
            Assert.assertEquals(i, circularArrayRotation.get(i));
        }
    }

    @Test
    public void testWithSixRotations() {
        CircularArrayRotation circularArrayRotation = new CircularArrayRotation(new int[] {1, 2, 3, 4, 0});
        circularArrayRotation.rotate(6);

        for(int i = 0; i < 5; i++) {
            Assert.assertEquals(i, circularArrayRotation.get(i));
        }
    }

}
