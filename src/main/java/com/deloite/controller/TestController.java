package com.deloite.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class TestController {

    @Value("${spring.application.name}")
    private String nomeProject;

    @Value("${nome.autor}")
    private String nome;

    @Value("${version.project}")
    private String versioProject;

    @GetMapping("/hello")
    public String hello(){
        return "<h1>Autor:</h1> "
                + nome +"; <h1>Projeto:</h1> "
                + nomeProject + "; <h1>Versão:</h1> "+ versioProject;
    }
}
