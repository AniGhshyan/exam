package com.example.exam.interview;

import java.util.HashMap;
import java.util.Map;

public class DuplicatedArray {

    public static Map<Integer, Integer> count(int[] array) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int a : array) {
            if (map.get(a) == null) {
                map.put(a, 1);
            } else {
                int count = map.get(a);
                map.put(a, ++count);
            }
        }
        return map;
    }
    public static void main(String[] args) {
        int[] arrays = {1, 5, 2, 3,  9, 6, 5, 1,4, 5};
        System.out.println(count(arrays));


    }
}
