package com.xworkz.encapsulation.internal;

public class BadgeUser {
    public void test() {
        Badge badge = new Badge();
        badge.setTitle("Java Pro");
        badge.setIssuedBy("Oracle");
        badge.setLevel(3);
        badge.setIsDigital(true);
        badge.setSizeInMB(1.2);

        System.out.println("Badge Title: " + badge.getTitle());
        System.out.println("Issued By: " + badge.getIssuedBy());
        System.out.println("Is Digital? " + badge.isDigital());

        badge.displayBadge();
    }
}
