package com.designpattern.strategy;

public class NotificationStrategy implements RememberDateStrategy {

    @Override
    public String rememberMe() {
        return "Notification strategy is active in order to remind you.";
    }
}
