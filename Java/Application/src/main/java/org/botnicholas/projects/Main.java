package org.botnicholas.projects;

import com.fasterxml.jackson.core.JsonProcessingException;

public class Main {
    public static void main(final String[] args) throws JsonProcessingException {
        if (args.length < 1) {
            System.err.println("You must provide at least one argument");
            return;
        }

        Greeter greeter = new Greeter();
        greeter.greet(args[0]);
    }
}
