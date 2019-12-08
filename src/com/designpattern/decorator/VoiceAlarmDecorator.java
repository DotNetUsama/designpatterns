package com.designpattern.decorator;

public class VoiceAlarmDecorator extends BaseNotifierDecorator {

    public VoiceAlarmDecorator(PlainNotification notification) {
        super(notification);
    }

    @Override
    public void sendNotification(String message) {
        plainNotification.sendNotification(message);
        System.out.println(" [message was sent using Voice Alarm Decorator].");
    }
}
