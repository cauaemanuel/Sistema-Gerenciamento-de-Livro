package com.deloite.controller;

import com.deloite.entity.Livro;
import com.deloite.entity.dto.LivroDTO;
import com.deloite.service.LivroService;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/livros")
public class LivroController {

    private LivroService livroService;

    public LivroController(LivroService livroService) {
        this.livroService = livroService;
    }

    @GetMapping
    public List<Livro> listarLivros(){
        return livroService.listAll();
    }

    @PostMapping
    public Livro adicionarLivro(@RequestBody @Valid LivroDTO livro){
        return livroService.save(livro);
    }

    @DeleteMapping("/{id}")
    public void removerPeloId(@PathVariable String id){
        livroService.removerPeloId(id);
    }
}
