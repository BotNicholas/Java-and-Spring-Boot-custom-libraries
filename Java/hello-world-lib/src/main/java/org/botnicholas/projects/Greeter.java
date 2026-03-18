package org.botnicholas.projects;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;

import java.util.Map;
import java.util.Scanner;

public class Greeter {
    private Scanner scanner;
    private ObjectMapper mapper;

    public Greeter() {
        this.scanner = new Scanner(System.in);
        this.mapper = new ObjectMapper().registerModules(new JavaTimeModule());
    }

    public Greeter(final Scanner scanner, final ObjectMapper mapper) {
        this.scanner = scanner;
        this.mapper = mapper;
    }

    public void greet(final String name) throws JsonProcessingException {
        System.out.printf("Hello, %s!\n", name);
        System.out.println("How are you doing today?");

        var answer = scanner.nextLine();
        System.out.printf("You've answered %s\n", answer);

        String obj = mapper.writeValueAsString(Map.of("key", "value"));
        System.out.println(obj);
    }
}
