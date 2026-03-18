package org.botnicholas.projects;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;

class GreeterTest {
    private static final Greeter greeter = new Greeter();
    @Test
    void greet_validInput_success() {
        assertDoesNotThrow(() -> greeter.greet("Test"));
    }
}
