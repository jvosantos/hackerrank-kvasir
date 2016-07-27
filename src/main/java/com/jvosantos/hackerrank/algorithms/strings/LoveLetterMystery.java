package com.jvosantos.hackerrank.algorithms.strings;

import java.util.Scanner;

public class LoveLetterMystery {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] strings = new String[sc.nextInt()];
        sc.nextLine();

        for(int i = 0; i < strings.length; i++) {
            strings[i] = sc.nextLine();
        }

        sc.close();

        for(int i = 0; i < strings.length; i++) {
            System.out.println(costToPalindromize(strings[i]));
        }

    }

    public static int costToPalindromize(String s) {
        int costSum = 0;
        for(int i = 0, j = s.length() - 1; i < s.length()/2 && j >= s.length()/2; i++, j--) {
            costSum += Math.abs(s.charAt(i) - s.charAt(j));
        }

        return costSum;
    }
}
