package com.example.exam.interview;

public class DuplicatedWords {

    public static void main(String[] args) {
        String s="barev Davo vonces Davo barev";
        String word;
        String[] split = s.split(" ");
        for (int i = 0; i < split.length; i++) {
            for (int j = i+1; j < split.length ; j++) {
                if (split[i].equals(split[j])) {
                    word = split[i];
                    System.out.println(word);
                }
            }

        }
    }
}
