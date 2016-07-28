package com.jvosantos.hackerrank.tutorials.thirtydaysofcode.day10;

public class BinaryNumbers {

    public static int getMaximumConsecutiveOnes(int n) {
        String binaryString = Integer.toBinaryString(n);

        int maxSum = 0;
        int currentSum = 0;

        for(int i = 0; i < binaryString.length(); i++) {
            if(binaryString.charAt(i) == '1') {
                currentSum++;
            } else {
                if(currentSum > maxSum) {
                    maxSum = currentSum;
                }
                currentSum = 0;
            }
        }

        if(currentSum > maxSum) {
            maxSum = currentSum;
        }

        return maxSum;
    }
}
