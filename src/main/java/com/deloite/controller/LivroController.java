package com.deloite.controller;

import com.deloite.entity.Livro;
import com.deloite.entity.dto.LivroDTO;
import com.deloite.service.LivroService;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
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
    public ResponseEntity<List<Livro>> listarLivros(){
        var list = livroService.listAll();

        if(list.isEmpty()){
            return ResponseEntity.noContent().build();
        }
        return ResponseEntity.ok(list);
    }

    @PostMapping
    public ResponseEntity<Livro> adicionarLivro(@RequestBody @Valid LivroDTO livro){
        return ResponseEntity.ok(livroService.save(livro));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> removerPeloId(@PathVariable String id){
        livroService.removerPeloId(id);
        return ResponseEntity.noContent().build();
    }
}
