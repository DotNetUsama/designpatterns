package com.designpattern.decorator;

public class PlainNotification implements Notifier {

    @Override
    public void sendNotification(String message) {
        System.out.print("Message:" + message);
    }
}
