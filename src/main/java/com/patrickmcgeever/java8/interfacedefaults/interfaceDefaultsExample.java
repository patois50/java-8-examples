package com.patrickmcgeever.java8.interfacedefaults;

/**
 * Created by patrick on 10/07/2014.
 */
public class interfaceDefaultsExample {

    public static void main(String[] args) {
        Animal dog = new Dog();
        Animal cat = new Cat();

        System.out.println("> Dog speak");
        System.out.println(dog.speak());

        System.out.println("> Cat speak");
        System.out.println(cat.speak());

        System.out.println("> Dog eat");
        System.out.println(dog.eat());

        System.out.println("> Cat eat");
        System.out.println(cat.eat());

        System.out.println("> Dog sleep");
        System.out.println(dog.sleep());

        System.out.println("> Cat sleep");
        System.out.println(cat.sleep());
    }
}
