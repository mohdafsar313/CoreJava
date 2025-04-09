package com.xworkz.encapsulation.internal;

public class PostOfficeUser {
    public void test() {
        PostOffice postOffice = new PostOffice();
        postOffice.setLocation("MG Road");
        postOffice.setPostmaster("Mr. Sharma");
        postOffice.setNumberOfEmployees(25);
        postOffice.setHasATM(true);
        postOffice.setAreaInSqFt(1500.75);

        System.out.println("Post Office Location: " + postOffice.getLocation());
        System.out.println("Postmaster: " + postOffice.getPostmaster());
        System.out.println("Has ATM? " + postOffice.isHasATM());

        postOffice.deliverMail();
    }
}
