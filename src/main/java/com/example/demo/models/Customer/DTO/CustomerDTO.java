package com.example.demo.models.Customer.DTO;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class CustomerDTO {

    private String uuid;
    private String fullName;
    private String dni;
    private String email;
    private String phone;

}

