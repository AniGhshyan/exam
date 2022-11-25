package com.example.exam.interview;

public class BubbleSort {
    public static void main(String[] args) {
        int[] array = {2, 26, 58, 12, 69, 87, 12, 3, 236};

        for (int k : array) {
            System.out.print(k + " ");
        }
        System.out.println();

        for (int i = 0; i < array.length; i++) {
            for (int j = 1; j < array.length - 1; j++) {
                int temp;
                if (array[j - 1] > array[j]) {
                    temp = array[j - 1];
                    array[j - 1] = array[j];
                    array[j] = temp;
                }
            }
        }
        for (int j : array) {
            System.out.print(j + " ");
        }
    }
}
