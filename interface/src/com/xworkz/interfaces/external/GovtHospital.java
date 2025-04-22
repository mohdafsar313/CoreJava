package com.xworkz.interfaces.external;

import com.xworkz.interfaces.internal.rules.Hospital;

public class GovtHospital implements Hospital {
    @Override
    public void treatment() {
        System.out.println("running treatment in GovtHospital");
    }
}
