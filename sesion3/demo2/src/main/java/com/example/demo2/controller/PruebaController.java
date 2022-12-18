package com.example.demo2.controller;

import com.example.demo2.model.Curso;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/prueba")
public class PruebaController {
    @GetMapping("/hello")
    public String helloWorld(){
        return "Ejercicio Carlos Ramirez";
    }
    @GetMapping("goodBye")
    public String goodBye(){
        return "good bye: Carlos Ramirez";
    }

    @GetMapping("/curso")
    public Curso enviarCurso(){
        return new Curso(100l, "backend curso");
    }

}

