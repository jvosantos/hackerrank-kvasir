package com.jvosantos.hackerrank.tutorials.thirtydaysofcode;

import java.util.Scanner;

public class TwoDArrays {
    private static final int[][] HOURGLASS_PATTERN = new int[][] {{1, 1, 1}, {0, 1, 0}, {1, 1, 1}};

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int arr[][] = new int[6][6];
        for(int i=0; i < 6; i++){
            for(int j=0; j < 6; j++){
                arr[i][j] = in.nextInt();
            }
        }

        System.out.println(findMaximumHourglassSum(arr));
    }

    public static int findMaximumHourglassSum(int[][] values) {
        if(values.length < 3) {
            return 0;
        }

        int maxHourglassSum = values[0][0] * HOURGLASS_PATTERN[0][0] + values[0][1] * HOURGLASS_PATTERN[0][1]
                + values[0][2] * HOURGLASS_PATTERN[0][2] + values[1][0] * HOURGLASS_PATTERN[1][0]
                + values[1][1] * HOURGLASS_PATTERN[1][1] + values[1][2] * HOURGLASS_PATTERN[1][2]
                + values[2][0] * HOURGLASS_PATTERN[2][0] + values[2][1] * HOURGLASS_PATTERN[2][1]
                + values[2][2] * HOURGLASS_PATTERN[2][2];

        for(int i = 1; i < values.length - 1; i++) {
            for(int j = 1; j < values[i].length - 1; j++) {
                int hourglassSum = 0;
                hourglassSum += values[i-1][j-1] * HOURGLASS_PATTERN[0][0] + values[i-1][j] * HOURGLASS_PATTERN[0][1]
                        + values[i-1][j+1] * HOURGLASS_PATTERN[0][2] + values[i][j-1] * HOURGLASS_PATTERN[1][0]
                        + values[i][j] * HOURGLASS_PATTERN[1][1] + values[i][j+1] * HOURGLASS_PATTERN[1][2]
                        + values[i+1][j-1] * HOURGLASS_PATTERN[2][0] + values[i+1][j] * HOURGLASS_PATTERN[2][1]
                        + values[i+1][j+1] * HOURGLASS_PATTERN[2][2];

                if(hourglassSum > maxHourglassSum) {
                    maxHourglassSum = hourglassSum;
                }
            }
        }

        return maxHourglassSum;
    }

}
