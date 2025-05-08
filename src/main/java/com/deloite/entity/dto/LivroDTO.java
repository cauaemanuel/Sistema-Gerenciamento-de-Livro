package com.deloite.entity.dto;

import jakarta.validation.constraints.NotBlank;

public record LivroDTO(@NotBlank String titulo,@NotBlank String autor) {
}
