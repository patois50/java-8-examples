package com.patrickmcgeever.java8.lambdaexpressions;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Lambda expression can be used to replace an annonymous function where the interface which is being
 * implemented by the lambda expression only has one abstract function
 */
public class ComparatorExample {

    public static void main(String[] args) {
        List<String> names = getUnsortedNames();
        System.out.println("Unsorted names: " + names);
        Collections.sort( names, (String a,String b) -> { return a.compareTo(b); });
        System.out.println("Sorted using lamda version 1: " + names);

        names = getUnsortedNames();
        System.out.println("Unsorted names: " + names);
        Collections.sort( names, (String a,String b) -> a.compareTo(b) );
        System.out.println("Sorted using lamda version 2: " + names);

        names = getUnsortedNames();
        System.out.println("Unsorted names: " + names);
        Collections.sort( names, (a,b) -> a.compareTo(b) );
        System.out.println("Sorted using lamda version 3: " + names);
    }

    private static List<String> getUnsortedNames() {
        return Arrays.asList("Mike", "Angela", "Susan", "Ben", "Andrew");
    }
}
