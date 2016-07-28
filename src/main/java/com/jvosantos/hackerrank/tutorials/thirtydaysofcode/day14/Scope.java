package com.jvosantos.hackerrank.tutorials.thirtydaysofcode.day14;

import java.util.Scanner;
import java.util.stream.IntStream;

public class Scope {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        sc.close();

        Difference difference = new Difference(a);

        difference.computeDifference();

        System.out.print(difference.maximumDifference);
    }
}

class Difference {
    private int[] elements;
    public int maximumDifference;

    Difference(int[] elements) {
        this.elements = elements;
    }

    void computeDifference() {
        maximumDifference = Math.abs(IntStream.range(0, elements.length).map(i -> elements[i]).min().getAsInt()
                - IntStream.range(0, elements.length).map(i -> elements[i]).max().getAsInt());
    }
}
