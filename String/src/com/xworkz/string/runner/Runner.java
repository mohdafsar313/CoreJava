package com.xworkz.string.runner;

public class Runner {
    public static void main(String[] args) {
        String name="afsar";
        String updatedName=name.concat(" K A ");
        System.out.println("name "+name);
        System.out.println("updatedName "+updatedName);
        String u_name ="afsar K A ";
        if(updatedName==u_name){
            System.out.println("matching");
            System.out.println("Address of updatedName is "+updatedName);
            System.out.println("Address of u_Name is "+u_name);
        }
        else {
            System.out.println("not matching");
            System.out.println("Address of updatedName is "+updatedName);
            System.out.println("Address of u_Name is "+u_name);
        }


    }
}
