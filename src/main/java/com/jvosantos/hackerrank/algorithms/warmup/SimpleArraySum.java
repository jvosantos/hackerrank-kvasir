package com.jvosantos.hackerrank.algorithms.warmup;

import java.util.stream.IntStream;

public class SimpleArraySum {
    public static int sumArray(int[] values) {
        return IntStream.range(0, values.length).map(i -> values[i]).sum();
    }
}
