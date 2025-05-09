package com.deloite.service;

import com.deloite.entity.Livro;
import com.deloite.entity.dto.LivroDTO;
import com.deloite.entity.dto.map.LivroFactory;
import com.deloite.repository.LivroRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;
import java.util.UUID;

@Service
public class LivroService {

    private LivroRepository livroRepository;

    public LivroService(LivroRepository livroRepository) {
        this.livroRepository = livroRepository;
    }

    public List<Livro> listAll() {
        return livroRepository.findAll();
    }

    public Livro save(LivroDTO livro) {
        var livroEntity = LivroFactory.fromDTO(livro);
        return livroRepository.save(livroEntity);
    }

    public void removerPeloId(String idUUID) {

        UUID id = UUID.fromString(idUUID);
        var userId = livroRepository.findById(id);
        if(userId.isPresent()){
            livroRepository.deleteById(id);
        }else {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND);
        }
    }
}
