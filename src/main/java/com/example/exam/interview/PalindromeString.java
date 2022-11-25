package com.example.exam.interview;

public class PalindromeString {
    public static void main(String[] args) {
        String str = "asdffdsa";
        System.out.println(palindrome(str));

    }

    public static boolean palindrome(String str) {
        int i = 0, j = str.length() - 1;
        while (i < j) {
            if (str.charAt(i) != str.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}
