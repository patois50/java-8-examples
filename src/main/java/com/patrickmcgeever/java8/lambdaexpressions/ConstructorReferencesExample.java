package com.patrickmcgeever.java8.lambdaexpressions;

/**
 * Created by patrick on 13/07/2014.
 */
public class ConstructorReferencesExample {

    public static void main(String[] args) {

        // The person factory contains only one method which returns a Person Object.
        // We are mapping the implementation of this function to a constructor in the Person class.
        // The compiler decides which of the constructors in the person class it will used based on the
        // signature of the only abstract method in the interface. Adding another abstract method to the
        // interface will stop the code from compiling.
        PersonFactory factory = Person::new;

        Person person = factory.create("John", "Smith");
        System.out.println("First: " + person.firstName);
        System.out.println("Last: " + person.lastName);
    }

    interface PersonFactory<P extends Person> {
        P create(String first, String last);
    }

    static class Person {

        String firstName = "Not Set";
        String lastName = "Not Set";

        Person() {}

        Person(String first, String last) {
            this.firstName = first;
            this.lastName = last;
        }
    }
}
