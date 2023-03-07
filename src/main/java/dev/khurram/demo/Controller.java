package dev.khurram.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
    @GetMapping("/starter")
    public String hello() {
        return "Starter Test";
    }
}
