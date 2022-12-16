package com.example.demo2.controller;

import com.example.demo2.model.CrearCurso;
import com.example.demo2.model.Curso;
import org.springframework.web.bind.annotation.*;

import java.util.LinkedList;
import java.util.List;

@RestController
public class CursoController {
    private List<Curso> cursos;
    private long ultimoId=102;

    public CursoController(){
        cursos= new LinkedList<>();
        cursos.add(new Curso(100l, "Full Stack java"));
        cursos.add(new Curso(101l, "Full Stack javascript"));
        cursos.add(new Curso(102l, "Full Stack python"));
    }

    @GetMapping("/obtenerCursos")
    public List<Curso>obtenerCursos(){
        return cursos;
    }

    @GetMapping("/obtenerCurso/{id}")
    public Curso obtenerCurso(@PathVariable long id){
        for (Curso c: cursos) {
            if (c.getId()== id){
                return c;

        }

        }
        return  null;
    }

    @PostMapping("/crearCurso")

    public Curso crearCurso(@RequestBody CrearCurso Data){
        Curso nuevo = new Curso(++ultimoId, Data.getNombre());
        cursos.add(nuevo);
        return nuevo;
    }

}
