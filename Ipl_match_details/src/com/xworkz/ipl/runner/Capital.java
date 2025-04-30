package com.xworkz.ipl.runner;

public class Capital {
    public static void main(String[] args) {
        String input = "hello how are you all set to go home";
        String[] words = input.split(" ");
        StringBuilder result = new StringBuilder();

        for (String word : words) {
            if (!word.isEmpty()) {
                result.append(Character.toUpperCase(word.charAt(0)))
                        .append(word.substring(1))
                        .append(" ");
            }
        }

        System.out.println("Output: " + result.toString().trim());
    }
}
