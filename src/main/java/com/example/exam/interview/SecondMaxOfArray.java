package com.example.exam.interview;

public class SecondMaxOfArray {

    public static void main(String[] args) {

        int[] array = {2, 26, 58, 12, 69, 87, 12, 3, 236};
        int max = 0;
        int secondMax = 0;
        for (int i = 0; i < array.length; i++) {
            if (max < array[i]) {
                secondMax = max;
                max = array[i];
            }
            if (secondMax < array[i] && array[i] < max) {
                secondMax = array[i];
            }
        }
        System.out.println(max);
        System.out.println(secondMax);
    }
}
