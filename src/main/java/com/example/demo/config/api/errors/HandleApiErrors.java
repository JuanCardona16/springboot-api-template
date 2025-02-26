package com.example.demo.config.api.errors;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

/* Clase o modelo para las respuesta de errores */
@Getter
@Setter
public class HandleApiErrors {

    private int status;
    private String message;
    private String error;
    private LocalDateTime timestamp;

    public HandleApiErrors() {
        this.timestamp = LocalDateTime.now();
    }

    public HandleApiErrors(int status, String message, String error) {
        this.status = status;
        this.message = message;
        this.error = error;
        this.timestamp = LocalDateTime.now();
    }
}
