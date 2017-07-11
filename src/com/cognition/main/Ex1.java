package com.cognition.main;

/**
 * Created by robin on 7/3/17.
 * <p>
 * 1. Write a program called Fibonacci to display the first 20 Fibonacci numbers F(n), where F(n)=F(n–1)+F(n–2). Also
 * compute their average.
 */
public class Ex1 {
    public static void main(String[] args) {
        int n = 0, o = 1, p, sum = 0, avg;
        System.out.print(n + "\t" + o + "\t");
        for (int i = 2; i < 20; i++) {
            p = n + o;
            sum += p;
            System.out.print(p + "\t");
            n = o;
            o = p;
        }
        avg = sum / 20;
        System.out.println("\nAverage: " + avg);
    }
}
