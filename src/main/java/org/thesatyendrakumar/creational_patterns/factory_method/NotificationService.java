package org.thesatyendrakumar.creational_patterns.factory_method;

public class NotificationService {
    public static void main(String[] args) {
        // Create an Email notification using the EmailNotificationFactory
        NotificationFactory emailFactory = new EmailNotificationFactory();
        Notification email = emailFactory.createNotification();
        email.notifyUser();

        // Create an SMS notification using the SMSNotificationFactory
        NotificationFactory smsFactory = new SMSNotificationFactory();
        Notification sms = smsFactory.createNotification();
        sms.notifyUser();
    }
}

