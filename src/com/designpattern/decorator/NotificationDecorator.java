package com.designpattern.decorator;

public class NotificationDecorator extends BaseNotifierDecorator {

    public NotificationDecorator(PlainNotification notification) {
        super(notification);
    }

    @Override
    public void sendNotification(String message) {
        plainNotification.sendNotification(message);
        System.out.println(" [message was sent using Notification Decorator].");
    }

}
