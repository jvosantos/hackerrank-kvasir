package com.jvosantos.hackerrank.tutorials.thirtydaysofcode.day17;

import java.util.Scanner;
import java.util.stream.IntStream;

public class MoreExceptions {
    public static void main(String []argh)
    {
        Scanner in = new Scanner(System.in);
        int T=in.nextInt();
        while(T-->0)
        {
            int n = in.nextInt();
            int p = in.nextInt();
            Calculator myCalculator = new Calculator();
            try
            {
                int ans=myCalculator.power(n,p);
                System.out.println(ans);

            }
            catch(Exception e)
            {
                System.out.println(e.getMessage());
            }
        }

    }
}

class Calculator {
    public int power(int n, int p) throws Exception {
        if(n < 0 || p < 0) {
            throw new Exception("n and p should be non-negative");
        }

        return IntStream.rangeClosed(1, p).map(i -> n).reduce(1, (left, right) -> left * right);
    }
}
