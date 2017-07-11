package com.cognition.main;

/**
 * Created by robin on 7/3/17.
 * <p>
 * 2. Write a program called CozaLozaWoza which prints the numbers 1 to 110, 11 numbers per line. The program shall
 * print "Coza" in place of the numbers which are multiples of 3, "Loza" for multiples of 5, "Woza" for multiples of 7,
 * "CozaLoza" for multiples of 3 and 5, and so on.
 */
public class Ex2 {
    public static void main(String[] args) {
        for (int i = 1; i <= 110;) {
            for (int j = 0; j < 11 && i <= 110; j++) {
                if ((i % 3) == 0 && (i % 5) == 0 && (i % 7) == 0) {
                    System.out.print("CozaLozaWoza\t");
                    i++;
                } else if ((i % 3) == 0 && (i % 5) == 0) {
                    System.out.print("CozaLoza\t");
                    i++;
                } else if ((i % 5) == 0 && (i % 7) == 0) {
                    System.out.print("LozaWoza\t");
                    i++;
                } else if ((i % 3) == 0 && (i % 7) == 0) {
                    System.out.print("CozaWoza\t");
                    i++;
                } else if ((i % 3) == 0) {
                    System.out.print("Coza\t");
                    i++;
                } else if ((i % 5) == 0) {
                    System.out.print("Loza\t");
                    i++;
                } else if ((i % 7) == 0) {
                    System.out.print("Woza\t");
                    i++;
                } else {
                    System.out.print(i + "\t");
                    i++;
                }
            }
            System.out.println("\n");
        }
    }
}
