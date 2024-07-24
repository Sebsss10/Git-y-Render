package com.example.render.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class nameController {

    @GetMapping("/name/{nombre}")
    public String name(@PathVariable String nombre) {
        return "Hola, " + nombre;
    }

}
