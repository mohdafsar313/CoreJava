package com.xworkz.ipl.runner;

public class Ipl {
    public static void main(String[] args) {
        String input = "RCB will win the match";
        String[] result = input.split(" ");

        for (int i = 1; i < result.length; i++) {
            if (result[i].length() == 3) {
                result[i] = reverse(result[i]);
            }
        }

        // Join the words back into a sentence
        String output = String.join(" ", result);
        System.out.println(output);
    }

    // Method to reverse a word
    public static String reverse(String word) {
        String reverse = "";
        for (int i = word.length() - 1; i >= 0; i--) {
            reverse += word.charAt(i);
        }
        return reverse;
    }
}