package com.xworkz.ipl.runner;

public class Ipl2 {
    public static void main(String[] args) {
        String input="RCB will win the match against csk";
        System.out.println(input);
        String[] words=input.split(" ");
        for(String word:words){
            System.out.print(word.length()+" ");
        }
    }
}
