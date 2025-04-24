package com.xworkz.jdbc.external;

import com.xworkz.jdbc.internal.NotificationService;

public class NotificationManager {
    private NotificationService notificationService;

    public NotificationManager(NotificationService notificationService) {
        this.notificationService = notificationService;
    }

    public void notifyUser() {
        this.notificationService.sendNotification();
        if (this.notificationService != null) {
            System.out.println("Notification sent successfully.");
        } else {
            System.out.println("Notification service is null");
        }
    }
}
