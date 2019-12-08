package com.designpattern.abstractfactory;

public class Maid {


    private String name;
    private int age;

    public Maid(){}

    public Maid(String name, int age){
        this.age = age;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        age = age;
    }
}
