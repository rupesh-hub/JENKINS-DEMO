package com.rupesh.resource;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class TestResource {


    @GetMapping
    public ResponseEntity<String> hello(
            @RequestParam(value = "name",
                    required = false,
                    defaultValue = "User") String name) {
        return ResponseEntity.ok("Hello, welcome to our project, " + name + "!");
    }

}
