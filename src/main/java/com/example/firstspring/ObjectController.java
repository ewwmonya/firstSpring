package com.example.firstspring;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class ObjectController {

    @GetMapping("/objects")
    public Map<String, String> obj() {
        Map<String, String> response = new HashMap<>();
        response.put("data", "Hello OBJECT!");
        return response;
    }
}
