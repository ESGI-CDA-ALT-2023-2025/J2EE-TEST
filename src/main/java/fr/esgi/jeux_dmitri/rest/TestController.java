package fr.esgi.jeux_dmitri.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @GetMapping(value="/test")
    public String hello(){
        return "Hello Jeux!!";
    }
}
