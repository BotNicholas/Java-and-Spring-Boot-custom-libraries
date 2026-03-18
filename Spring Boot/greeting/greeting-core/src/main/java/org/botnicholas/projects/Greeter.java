package org.botnicholas.projects;

import jakarta.annotation.PostConstruct;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Greeter {
    private String prefix;

    public Greeter() {
        this.prefix = "Hello";
    }

    public Greeter(final String prefix) {
        this.prefix = prefix;
    }

    @PostConstruct
    public void postConstruct() {
        log.info("Greeter was created!");
    }

    public void greet(final String name) {
        System.out.printf("%s, %s!\n", this.prefix, name);
    }
}
