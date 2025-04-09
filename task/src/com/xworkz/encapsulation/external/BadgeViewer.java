package com.xworkz.encapsulation.external;
import com.xworkz.encapsulation.internal.Badge;

public class BadgeViewer {
    public void display() {
        Badge badge = new Badge();
        System.out.println("Badge Info (read-only):");
        System.out.println("Title: " + badge.getTitle());
        System.out.println("Issued By: " + badge.getIssuedBy());
    }
}
