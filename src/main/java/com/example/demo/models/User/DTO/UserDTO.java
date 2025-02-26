package com.example.demo.models.User.DTO;

import lombok.*;

// UserResponseDTO
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class UserDTO {

    private String uuid;
    private String username;
    private String email;
    private String password;
}
