package com.xworkz.encapsulation.external;
import com.xworkz.encapsulation.internal.PostOffice;

public class PostOfficeViewer {
    public void display() {
        PostOffice postOffice = new PostOffice();
        System.out.println("Post Office Info (read-only):");
        System.out.println("Location: " + postOffice.getLocation());
        System.out.println("Postmaster: " + postOffice.getPostmaster());
    }
}
