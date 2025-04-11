package com.xworkz.override.internal;

public class EngineeringCollege extends University{
    public EngineeringCollege() {
        System.out.println("EngineeringCollege: Constructor is running");
    }

    @Override
    public void conductExam() {
        System.out.println("EngineeringCollege: Conducting technical and practical exams");
    }

    public void arrangeHackathon() {
        System.out.println("EngineeringCollege: Organizing a coding hackathon");
    }

    public void offerInternships() {
        System.out.println("EngineeringCollege: Providing internship opportunities");
    }
}
