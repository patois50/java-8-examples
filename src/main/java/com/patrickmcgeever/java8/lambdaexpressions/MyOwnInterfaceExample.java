package com.patrickmcgeever.java8.lambdaexpressions;

/**
 * Created by patrick on 12/07/2014.
 */
public class MyOwnInterfaceExample {

    public static void main(String[] args) {
        System.out.println(
                getSomeStringFromMyOwnInterface(() -> "Some text")
        );


        // Another way
        MyInterface my = () -> "Some more text";
        System.out.println(
                getSomeStringFromMyOwnInterface( my )
        );

    }

    private static String getSomeStringFromMyOwnInterface( MyInterface myInterface ) {
        return myInterface.getStringFunction();
    }

}
