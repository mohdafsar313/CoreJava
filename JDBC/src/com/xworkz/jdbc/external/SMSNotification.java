package com.xworkz.jdbc.external;

import com.xworkz.jdbc.internal.NotificationService;

import javax.xml.soap.Node;

public class SMSNotification implements NotificationService {
    @Override
    public void sendNotification() {
        System.out.println("Sending SMS notification...");
    }
}
