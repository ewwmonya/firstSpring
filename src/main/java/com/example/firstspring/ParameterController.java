package com.example.firstspring;

import org.springframework.web.bind.annotation.GetMapping;
// The library below is the bread and butter! Keep this in mind!
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

//Notice we have the RESTController because we want to send some data!
@RestController
public class ParameterController {
    @GetMapping("/name")
            // This is where we are grabbing the url parameters.
            // We have to specify the value key we want to grab.
            // For example id, name, search, place. Just name it
    public String helloName(@RequestParam String name) {
        return "Hello "  + name;
    }
}
