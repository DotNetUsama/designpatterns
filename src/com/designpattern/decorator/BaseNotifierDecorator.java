package com.designpattern.decorator;

public abstract class BaseNotifierDecorator implements Notifier {

    protected PlainNotification plainNotification;

    public BaseNotifierDecorator(PlainNotification notification){
        this.plainNotification = notification;
    }

    @Override
    public void sendNotification(String message) {
        plainNotification.sendNotification(message);
    }
}
