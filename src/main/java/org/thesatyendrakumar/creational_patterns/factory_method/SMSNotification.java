package org.thesatyendrakumar.creational_patterns.factory_method;

public class SMSNotification implements Notification {
    @Override
    public void notifyUser() {
        System.out.println("Sending an SMS notification");
    }
}
