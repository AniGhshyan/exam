package com.example.exam.interview;

public class MaxOfArray {

    public static void main(String[] args) {

        int[] array = {2, 26, 58, 12, 69, 87, 12, 3, 236};
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        System.out.println(max);

    }
}
