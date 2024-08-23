package org.thesatyendrakumar.creational_patterns.factory_method;

public class SMSNotificationFactory implements NotificationFactory {
    @Override
    public Notification createNotification() {
        return new SMSNotification();
    }
}
