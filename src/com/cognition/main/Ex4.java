package com.cognition.main;

import java.util.Random;

/**
 * Created by robin on 7/3/17.
 * <p>
 * 4. Write a Java method to find the smallest number among three numbers
 */
public class Ex4 {
    public static void main(String[] args) {
        Random random = new Random();
        int a = random.nextInt(100), b = random.nextInt(100), c = random.nextInt(100);
        System.out.println("Randomly generated numbers: " +
                "\n\ta: " + a +
                "\n\tb: " + b +
                "\n\tc: " + c);
        System.out.println("\n\tSmallest: " + getSmallest(a, b, c));

    }

    private static int getSmallest(int a, int b, int c) {
        int small = a;
        if (b < a && b < c) small = b;
        if (c < a && c < b) small = c;
        return small;
    }
}
