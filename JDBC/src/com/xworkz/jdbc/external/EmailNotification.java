package com.xworkz.jdbc.external;

import com.xworkz.jdbc.internal.NotificationService;

public class EmailNotification implements NotificationService {
    @Override
    public void sendNotification() {
        System.out.println("Sending email notification...");
    }
}
