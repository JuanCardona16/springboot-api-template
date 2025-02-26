package com.example.demo.config.api.errors;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import com.example.demo.config.api.errors.Exceptios.*;

import java.time.LocalDateTime;
import java.util.*;

/**
 * Manejador global de excepciones para la aplicación.
 * Captura las excepciones y devuelve un objeto ApiError con el estado HTTP correspondiente.
 */
@ControllerAdvice
public class handlerGlogalErros {

    // Menejo de exceptiones generica
    @ExceptionHandler(Exception.class)
    public ResponseEntity<Map<String, Object>> handleGeneralException(Exception exception, WebRequest request) {
        return buildErrorResponse(HttpStatus.INTERNAL_SERVER_ERROR, "Error interno del servidor", exception.getMessage());
    }

    // Menejo de "Recurso no encontrado" (404)
    @ExceptionHandler(Exceptios.ResourceNotFoundException.class)
    public ResponseEntity<Map<String, Object>> handleNotFoundException(Exceptios.ResourceNotFoundException exception) {
        return buildErrorResponse(HttpStatus.NOT_FOUND, "Recurso no encontrado", exception.getMessage());
    }

    // Menejo de "Acceso no autororizado" (401)
    @ExceptionHandler(Exceptios.UnauthorizedException.class)
    public ResponseEntity<Map<String, Object>> handleUnautorizedException(Exceptios.UnauthorizedException exception) {
        return buildErrorResponse(HttpStatus.UNAUTHORIZED, "No Autorizado", exception.getMessage());
    }

    // Menejo de "Acceso no autororizado" (401)
    @ExceptionHandler(Exceptios.ForbiddenException.class)
    public ResponseEntity<Map<String, Object>> handleForbiddenException(Exceptios.ForbiddenException exception) {
        return buildErrorResponse(HttpStatus.FORBIDDEN, "Acceso prohibido", exception.getMessage());
    }

    // Menejo de "Servicio no dispoble" (503)
    @ExceptionHandler(Exceptios.ServiceUnavaliableException.class)
    public ResponseEntity<Map<String, Object>> handleServiceUnavaliableException(Exceptios.ServiceUnavaliableException exception) {
        return buildErrorResponse(HttpStatus.SERVICE_UNAVAILABLE, "Servicio no disponible", exception.getMessage());
    }

    // Menejo de "Servicio no dispoble" (503)
    @ExceptionHandler(Exceptios.ConflictException.class)
    public ResponseEntity<Map<String, Object>> handleConflictException(Exceptios.ConflictException exception) {
        return buildErrorResponse(HttpStatus.CONFLICT, "Conflicto", exception.getMessage());
    }

    // Menejo de "Solicitud incorrecta" (400)
    @ExceptionHandler(Exceptios.BadRequestException.class)
    public ResponseEntity<Map<String, Object>> handleBadRequestException(Exceptios.BadRequestException exception) {
        return buildErrorResponse(HttpStatus.BAD_REQUEST, "Bad request", exception.getMessage());
    }

    // Menejo de "Solicitud incorrecta" (400)
    @ExceptionHandler(Exceptios.NotImplementedException.class)
    public ResponseEntity<Map<String, Object>> handleNotImplementedException(Exceptios.NotImplementedException exception) {
        return buildErrorResponse(HttpStatus.NOT_IMPLEMENTED, "Not Implemented", exception.getMessage());
    }

    // Manejo del error 303: See Other (redirección) - ejemplo con excepción personalizada.
    @ExceptionHandler(Exceptios.SeeOtheException.class)
    public ResponseEntity<Map<String, Object>> handleSeeOtheException(Exceptios.SeeOtheException exception) {
        return buildErrorResponse(HttpStatus.SEE_OTHER, "See Other", exception.getMessage());
    }

    // Metodo para construir la respuesta de la excepcion
    private ResponseEntity<Map<String, Object>> buildErrorResponse(HttpStatus status, String error, Object details) {
        Map<String, Object> body = new HashMap<>();
        body.put("status", status);
        body.put("error", error);
        body.put("details", details);
        body.put("timestamp", LocalDateTime.now());
        return new ResponseEntity<>(body, status);
    }

}
