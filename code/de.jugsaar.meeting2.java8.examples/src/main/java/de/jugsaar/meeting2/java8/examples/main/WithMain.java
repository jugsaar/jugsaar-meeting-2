package de.jugsaar.meeting2.java8.examples.main;

/**
 * Author: tom
 */
public interface WithMain {
    public static void main(String[] args){
        System.out.printf("Running %s%n",System.getProperty("sun.java.command"));
    }
}
