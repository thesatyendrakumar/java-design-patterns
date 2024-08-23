package org.thesatyendrakumar.creational_patterns.factory_method;

public class EmailNotificationFactory implements NotificationFactory {
    @Override
    public Notification createNotification() {
        return new EmailNotification();
    }
}
