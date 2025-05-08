package com.deloite.entity.dto.map;

import com.deloite.entity.Livro;
import com.deloite.entity.dto.LivroDTO;

public class LivroFactory {

    public static Livro fromDTO(LivroDTO dto) {
        Livro livro = new Livro();
        livro.setTitulo(dto.titulo());
        livro.setAutor(dto.autor());
        return livro;
    }
}