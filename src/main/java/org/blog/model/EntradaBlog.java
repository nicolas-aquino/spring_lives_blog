package org.blog.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class EntradaBlog {
    private Long id;
    private String title;
    private String author;
    private LocalDate publicationDate;
}
