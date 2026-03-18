package org.botnicholas.projects;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.mockito.ArgumentMatchers.anyMap;

@ExtendWith(MockitoExtension.class)
class GreeterTest {
    @Mock
    private Scanner scanner;
    @Mock
    private ObjectMapper mapper;

    @InjectMocks
    private Greeter greeter;

    @Test
    void greet_validInput_success() throws JsonProcessingException {
        Mockito.when(scanner.nextLine()).thenReturn("Test");
        Mockito.when(mapper.writeValueAsString(anyMap())).thenReturn("JSONSTRING");

        assertDoesNotThrow(() -> greeter.greet("Test"));
    }
}
