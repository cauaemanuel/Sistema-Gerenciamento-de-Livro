package com.deloite.service;

import com.deloite.entity.Livro;
import com.deloite.entity.dto.LivroDTO;
import com.deloite.entity.dto.map.LivroMapper;
import com.deloite.repository.LivroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class LivroService {

    @Autowired
    private LivroMapper livroMapper;
    private LivroRepository livroRepository;

    public LivroService(LivroMapper livroMapper, LivroRepository livroRepository) {
        this.livroMapper = livroMapper;
        this.livroRepository = livroRepository;
    }

    public List<Livro> listAll() {
        return livroRepository.findAll();
    }

    public Livro save(LivroDTO livro) {
        var livroEntity = livroMapper.livroDtoToLivro(livro);
        return livroRepository.save(livroEntity);
    }

    public void removerPeloId(int id) {
        var userId = livroRepository.findById(id);
        if(userId.isPresent()){
            livroRepository.deleteById(id);
        }else {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND);
        }
    }
}
