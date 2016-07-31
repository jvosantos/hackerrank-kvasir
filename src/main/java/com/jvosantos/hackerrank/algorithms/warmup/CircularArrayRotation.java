package com.jvosantos.hackerrank.algorithms.warmup;

import java.util.Scanner;

public class CircularArrayRotation {

    private int[] values;
    private int numberOfRotations = 0;

    public CircularArrayRotation(int[] values) {
        this.values = values;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k = sc.nextInt();
        int q = sc.nextInt();

        int[] values = new int[n];

        for (int i = 0; i < values.length; i++) {
            values[i] = sc.nextInt();
        }

        CircularArrayRotation circularArray = new CircularArrayRotation(values);

        circularArray.rotate(k);

        for (int i = 0; i < q; i++) {
            int m = sc.nextInt();

            System.out.println(circularArray.get(m));
        }
    }

    public void rotate(int numberOfRotations) {
        this.numberOfRotations = numberOfRotations;
    }

    public int get(int index) {
        return values[(values.length + index - numberOfRotations % values.length) % values.length];
    }
}
