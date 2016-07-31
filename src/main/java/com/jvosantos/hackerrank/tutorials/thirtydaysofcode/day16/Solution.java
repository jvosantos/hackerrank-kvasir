package com.jvosantos.hackerrank.tutorials.thirtydaysofcode.day16;

import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.println(Integer.valueOf(sc.nextLine()));
        } catch(NumberFormatException e) {
            System.out.println("Bad String");
        }
    }
}
