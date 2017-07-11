package com.cognition.main;

import java.util.Scanner;

/**
 * Created by robin on 7/3/17.
 * <p>
 * Main class
 */
public class Main {
    public static void main(String[] args) {
        choose();
    }

    private static void choose() {
        Scanner input = new Scanner(System.in);
        System.out.println("Pick a question:" +
                "\n\t1. Write a program called Fibonacci to display the first 20 Fibonacci numbers F(n), where " +
                "F(n)=F(n–1)+F(n–2). Also compute their average." +
                "\n\t2. Write a program called CozaLozaWoza which prints the numbers 1 to 110, 11 numbers per line. " +
                "The program shall print \"Coza\" in place of the numbers which are multiples of 3, \"Loza\" for " +
                "multiples of 5, \"Woza\" for multiples of 7, \"CozaLoza\" for multiples of 3 and 5, and so on." +
                "\n\t3. Write a program that sorts an array using the selection sort algorithm." +
                "\n\t4. Write a Java method to find the smallest number among three numbers" +
                "\n\t5. Exit");
        int action = input.nextInt();

        switch (action) {
            case 1:
                Ex1.main(null);
                break;

            case 2:
                Ex2.main(null);
                break;

            case 3:
                Ex3.main(null);
                break;

            case 4:
                Ex4.main(null);
                break;

            case 5:
                System.out.println("\n\tBye!");
                break;

            default:
                System.out.println("Invalid choice");
                choose();
                break;
        }
    }
}
