package com.example.demo.models.Category.DTO;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class CategoryDTO {

    private String uuid;
    private String name;
    private String description;

}
