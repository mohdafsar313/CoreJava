package com.xworkz.encapsulation.internal;

public class OccupationUser {
    public void test() {
        Occupation occupation = new Occupation();
        occupation.setTitle("Software Engineer");
        occupation.setIndustry("IT");
        occupation.setExperienceYears(5);
        occupation.setIsRemote(true);
        occupation.setAverageSalary(120000.0);

        System.out.println("Occupation Title: " + occupation.getTitle());
        System.out.println("Industry: " + occupation.getIndustry());
        System.out.println("Remote? " + occupation.isRemote());

        occupation.work();
    }
}
