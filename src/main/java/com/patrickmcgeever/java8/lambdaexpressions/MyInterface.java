package com.patrickmcgeever.java8.lambdaexpressions;

/**
 * Created by patrick on 12/07/2014.
 */
// This annotation will cause a compile error if I try to add another abstract method
@FunctionalInterface
public interface MyInterface {

    default String defaultOne() {
        return "Default 1";
    }

    default String defaultTwo() {
        return "Default 2";
    }

    default String defaultThree() {
        return "Default 3";
    }

    String getStringFunction();

//    This abstract function will cause a compile error because of the FunctionalInterface annotation
//    String extraFunction();

}
