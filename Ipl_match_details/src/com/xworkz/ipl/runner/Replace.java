package com.xworkz.ipl.runner;

public class Replace {
    public static void main(String[] args) {
        String input="you are welcome";
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            if(ch=='a'){
                System.out.println(input.charAt(i)+1);
            }
            if(ch=='e'){
                System.out.println(input.charAt(i)+1);
            }
            if(ch=='i'){
                System.out.println(input.charAt(i)+1);
            }
            if(ch=='o'){
                System.out.println(input.charAt(i)+1);
            }
            if(ch=='u'){
                System.out.println(input.charAt(i)+1);
            }
        }
        System.out.println(input);
    }
}
