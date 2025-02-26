package com.example.demo.config.api.errors.Exceptios;

// Clase padre que contiene todas las clases de exceptiones personalizadas
public class Exceptios {

    public static class ResourceNotFoundException extends RuntimeException{
        public ResourceNotFoundException(String message) {
            super(message);
        }
    }

    public static class UnauthorizedException extends RuntimeException {
        public UnauthorizedException(String message) {
            super(message);
        }
    }

    public static class ForbiddenException extends RuntimeException {
        public ForbiddenException(String message) {
            super(message);
        }
    }

    public static class ServiceUnavaliableException extends RuntimeException {
        public ServiceUnavaliableException(String message) {
            super(message);
        }
    }

    public static class ConflictException extends RuntimeException {
        public ConflictException(String message) {
            super(message);
        }
    }

    public static class BadRequestException extends RuntimeException {
        public BadRequestException(String message) {
            super(message);
        }
    }

    public static class NotImplementedException extends RuntimeException {
        public NotImplementedException(String message) {
            super(message);
        }
    }

    public static class SeeOtheException extends RuntimeException {
        public SeeOtheException(String message) {
            super(message);
        }
    }

}
