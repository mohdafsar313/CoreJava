package com.xworkz.string.runner;

public class SpaceReplaceRunner {
    public static void main(String[] args) {
        String sentence = "Java is fun to learn";

        String replaced = sentence.replace(' ', '%');

        System.out.println("After replacing spaces: " + replaced);
    }
}
