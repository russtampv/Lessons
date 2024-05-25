package ru.edu;

/**
 * Welcome information
 */
public class GreetingImpl implements Greeting {
    /**
     * Last Name
     */
    private static final String LAST_NAME = "P***n";
    /**
     * First Name
     */
    private static final String FIRST_NAME = "Rustam";
    /**
     * Age
     */
    private static final int AGE = 32;
    /**
     * Job title
     */
    private static final String JOB_TITLE = "Development engineer";

    /**
     * Method returning greeting
     */
    @Override
    public String toGreet() {
        return "Hello! My Name is " + LAST_NAME + " " + FIRST_NAME + ". I am " + AGE + " years old. I work as a " + JOB_TITLE;
    }
}
