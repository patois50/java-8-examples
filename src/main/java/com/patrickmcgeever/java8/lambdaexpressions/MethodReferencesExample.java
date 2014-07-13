package com.patrickmcgeever.java8.lambdaexpressions;

/**
 * Created by patrick on 13/07/2014.
 */
public class MethodReferencesExample {

    public static void main(String[] args) {

        // Note the :: syntax
        // The interface "MyInterface" contains one abstract method, which takes no arguments and
        // returns a string. Here we are using a static method for the implementation of this abstract
        // method in our interface. This is done using the :: notation.
        MyInterface my1 = SomeClass :: getSomeString;
        System.out.println( my1.getStringFunction() );

        // We can also do this using a function of an object
        SomeClass otherClassObject = new SomeClass();
        MyInterface my2 = otherClassObject :: getSomeStringFromObject;
        System.out.println( my2.getStringFunction() );
    }

    static class SomeClass {

        static String getSomeString() {
            return "This is some string from a static method";
        }

        String getSomeStringFromObject() {
            return "This is some string from an instance method";
        }

    }
}
