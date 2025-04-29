package com.xworkz.ipl.runner;

public class Vowels {
    public static void main(String[] args) {
        String input = "Today is my day,I will do best";
        input = input.toLowerCase();
        int vowels = 0;
        int consonants = 0;
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);


            if (ch >= 'a' && ch <= 'z') {
                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                    vowels++;
                } else {
                    consonants++;
                }

            }
        }
        System.out.println("Vowels: " + vowels);
        System.out.println("Consonants: " + consonants);
    }
}