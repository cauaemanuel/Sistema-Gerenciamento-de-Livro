package com.deloite.entity.dto.map;

import com.deloite.entity.Livro;
import com.deloite.entity.dto.LivroDTO;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface LivroMapper {

    Livro livroDtoToLivro(LivroDTO livroDTO);
}
