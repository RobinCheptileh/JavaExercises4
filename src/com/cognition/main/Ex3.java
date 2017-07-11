package com.cognition.main;

import java.util.Arrays;
import java.util.Random;

/**
 * Created by robin on 7/3/17.
 * <p>
 * 3. Write a program that sorts an array using the selection sort algorithm
 */
public class Ex3 {
    public static void main(String[] args) {
        int[] set = new int[10];
        Random rand = new Random();
        for (int i = 0; i < set.length; i++)
            set[i] = rand.nextInt(100);
        System.out.println("A randomly generated list to be used: " + Arrays.toString(set));

        System.out.println("New sorted array using selection sort: " + Arrays.toString(selectionSort(set)));
    }

    private static int[] selectionSort(int[] arr) {
        for (int i = arr.length - 1; i >= 0; i--) {
            int max = 0;
            for (int j = 1; j < i + 1; j++) {
                if (arr[j] > arr[max])
                    max = j;
            }
            int temp = arr[i];
            arr[i] = arr[max];
            arr[max] = temp;
        }
        return arr;
    }
}
