package com.xworkz.override.internal;

public class SpecialityHospital extends Hospital{
    public SpecialityHospital() {
        System.out.println("SpecialityHospital: Constructor is running");
    }

    @Override
    public void treatPatient() {
        System.out.println("SpecialityHospital: Providing advanced specialized care");
    }

    public void performSurgery() {
        System.out.println("SpecialityHospital: Performing complex surgery");
    }

    public void runDiagnostics() {
        System.out.println("SpecialityHospital: Running diagnostic tests");
    }
}
