package com.mhussain.helloflux;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static java.time.Instant.now;

@RequestMapping("/resources/greetings")
@RestController
public class GreetingResource {

    @GetMapping("{name}")
    Greeting getGreeting(@PathVariable("name") String name) {
        return new Greeting("Hello " + name + " --- " + now() + " :-)");
    }

}