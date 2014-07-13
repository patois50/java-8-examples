package com.patrickmcgeever.java8.interfacedefaults;

/**
 * Created by patrick on 10/07/2014.
 */
public interface Animal {

    String speak();

    String eat();

    default String sleep() {
        return "I am sleeping";
    }
}
