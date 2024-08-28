package com.booleanuk.api;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class JokeMachineControllerTest {

    @Test
    void testGetJoke() {
        JokeMachineController jmc = new JokeMachineController();
        assertTrue(jmc.getJokes().contains(jmc.getJoke()));
        assertTrue(jmc.getJokes().contains(jmc.getJoke()));
        assertTrue(jmc.getJokes().contains(jmc.getJoke()));
        assertTrue(jmc.getJokes().contains(jmc.getJoke()));
        assertTrue(jmc.getJokes().contains(jmc.getJoke()));
        assertTrue(jmc.getJokes().contains(jmc.getJoke()));
    }
}
