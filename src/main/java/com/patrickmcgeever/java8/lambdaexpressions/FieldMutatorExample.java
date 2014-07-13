package com.patrickmcgeever.java8.lambdaexpressions;

/**
 * Created by patrick on 13/07/2014.
 *
 * Fields can be modified provided they are static or if they are instance fields (Declared at class level without a value)
 */
public class FieldMutatorExample {

    String prefix1;
    static String prefix2 = "Mc";

    public static void main(String[] args) {

        FieldMutatorExample obj = new FieldMutatorExample();
        obj.doExample();
    }

    void doExample() {

        SurnamePrefixer prefixer1 = (name) -> {
            prefix1 = "O'";
            return prefix1 + name;
        };

        SurnamePrefixer prefixer2 = (name) -> {
            prefix2 = "M'";
            return prefix2 + name;
        };

        System.out.println(prefixer1.getSurname("Davids"));
        System.out.println(prefixer2.getSurname("Davids"));
    }

    interface SurnamePrefixer {
        String getSurname(String surname);
    }
}
