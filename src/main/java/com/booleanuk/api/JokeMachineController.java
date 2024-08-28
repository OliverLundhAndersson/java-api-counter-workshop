package com.booleanuk.api;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@RestController
@RequestMapping("/jokes")
public class JokeMachineController {


    private final List<String> jokes;
    private final Random random;

    public JokeMachineController() {
        this.random = new Random();
        this.jokes = new ArrayList<>();
        this.jokes.add("Joke1");
        this.jokes.add("Joke2");
        this.jokes.add("Joke3");
        this.jokes.add("Joke4");
        this.jokes.add("Joke5");
        this.jokes.add("Joke6");
        this.jokes.add("Joke7");
        this.jokes.add("Joke8");
    }


    @GetMapping
    public String getJoke() {
        return this.jokes.get(random.nextInt(jokes.size()));
    }

    public List<String> getJokes() {
        return jokes;
    }
}
