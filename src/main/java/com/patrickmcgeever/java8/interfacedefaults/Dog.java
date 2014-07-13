package com.patrickmcgeever.java8.interfacedefaults;

/**
 * Created by patrick on 10/07/2014.
 */
public class Dog implements Animal {

    @Override
    public String speak() {
        return "woof";
    }

    @Override
    public String eat() {
        return "I am eating dog food, yum!!!";
    }
}
