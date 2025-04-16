package com.xworkz.override.internal;

public class SecuritySystem {
    private String security_name;
    private int security_number;
    public SecuritySystem(String security_name,int security_number) {
        System.out.println("SecuritySystem: Constructor is running");
    }

    public void monitor() {
        System.out.println("SecuritySystem: Monitoring network traffic");
    }
    @Override
    public String toString() {
        return "security name"+security_name+", security number"+security_number;
    }
}
