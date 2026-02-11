package com.example.firstspring;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

// This is for telling spring what we want to return
// Which is a "REST" hints the NAME RESTController
@RestController
public class HelloController {

    // This is the url parameter.
    // In js basically->->->>  app.get("/hello", req, res) => res.send("Hello World");
    // Ya dig?
    @GetMapping("/hello")
    public String hello() {
        return "Hello World"; // This return is out rest.
                              // So what is set is sent as data.
                              // Check the next files to see what data you can send!
    }
}
