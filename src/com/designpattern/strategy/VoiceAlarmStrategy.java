package com.designpattern.strategy;

public class VoiceAlarmStrategy implements RememberDateStrategy {

    @Override
    public String rememberMe() {
        return "Notification strategy is active in order to remind you.";
    }
}
