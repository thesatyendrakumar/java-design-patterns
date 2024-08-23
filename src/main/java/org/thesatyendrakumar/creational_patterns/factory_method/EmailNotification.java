package org.thesatyendrakumar.creational_patterns.factory_method;

public class EmailNotification implements Notification {
    @Override
    public void notifyUser() {
        System.out.println("Sending an Email notification");
    }
}
