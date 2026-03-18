package org.botnicholas.projects.demoapplication.controllers;

import lombok.RequiredArgsConstructor;
import org.botnicholas.projects.Greeter;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
public class HomeController {
    private final Greeter greeter;

    @PostMapping("/greet")
    public ResponseEntity greet(final @RequestBody String name) {
        greeter.greet(name);
        return ResponseEntity.accepted().build();
    }
}
