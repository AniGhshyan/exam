package com.example.exam.interview;

public class Revers {
    public static void main(String[] args) {

        String s = "maven";
        System.out.println(s);
        for (int i = s.length(); i > 0; --i) {
            System.out.print(s.charAt(i - 1));
        }
    }
}
