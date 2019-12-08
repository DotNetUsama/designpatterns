package com.designpattern.strategy;

public class RememberDateContext {
    private RememberDateStrategy rememberDateStrategy;

    public String apply(){
        return rememberDateStrategy.rememberMe();
    }

    public void setRememberDateStrategy(RememberDateStrategy strategy){
        this.rememberDateStrategy = strategy;
    }
}
