package com.example.demo.models.Book.DTO;

import com.example.demo.models.Author.entity.Author;
import com.example.demo.models.BaseEntity;
import jakarta.persistence.*;
import jdk.jfr.Category;
import lombok.*;

import java.time.LocalDate;
import java.util.Set;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class BookDTO {

    private String title;
    private LocalDate publicationDate;
    private Long categoryId; // O CategoryDTO si necesitas más detalles
    private Set<Long> authorIds; // O Set<AuthorDTO> si necesitas más detalles



}
