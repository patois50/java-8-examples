package com.patrickmcgeever.java8.lambdaexpressions;

/**
 * Created by patrick on 13/07/2014.
 *
 * Demonstrates the scope of a lambda expression, particularly how it can access local
 * variables outside of the expression.
 */
public class LocalVariableAccessorExample {

    public static void main(String[] args) {

        // Can access but not modify final and non final local variables
        // Even though can access the non final variable it effectively
        // has to be final i.e. not modified after creation anywhere else in the method
        final String prefix1 = "O'";
        String prefix2 = "Mc";

        SurnameGetter prefix1Surname = () -> prefix1 + "Davids";
        SurnameGetter prefix2Surname = () -> prefix2 + "Davids";

        // Cannot do this as this effectively means that the variable is not final
        // Uncomment the code and see
//        prefix2 = "Test";

        // Cannot do this
        // Compile Error...
        // Variable used in lambda expression should be effectively final
        // Uncomment the code and see
//        SurnameGetter prefix3Surname = () -> {
//            prefix2 = "St.";
//            return prefix2 + "Davids";
//        };

        System.out.println( prefix1Surname.getSurname() );
        System.out.println( prefix2Surname.getSurname() );
    }

    interface SurnameGetter {
        String getSurname();
    }

}
