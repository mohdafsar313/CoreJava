package com.xworkz.string.runner;

public class ReverseRunner {
    public static void main(String[] args) {
        String place = "Mumbai";
        int count=0;
        for (char c:place.toCharArray())
        {
            count++;
        }
        for(int i=count-1;i>=0;i--)
        {
            System.out.println(place.charAt(i));
        }
    }
}