package de.berlin.htw.webtech.demo;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {

    @GetMapping(path = "/greeting")
    public String greeting(@RequestParam(name = "name", required =false, defaultValue="World") String name){
    return "hello " + name;
    }



}