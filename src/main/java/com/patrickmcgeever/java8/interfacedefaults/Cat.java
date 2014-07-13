package com.patrickmcgeever.java8.interfacedefaults;

/**
 * Created by patrick on 10/07/2014.
 */
public class Cat implements Animal {

    @Override
    public String speak() {
        return "meoww";
    }

    @Override
    public String eat() {
        return "I am eating cat food, yum!";
    }
}
