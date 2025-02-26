package com.example.demo.constants;

public interface ConsultationPaths {
    String BASE_API = "/api";
    String AUTH = "/auth";

    // Authentication paths
    String LOGIN = AUTH + "/login";
    String REGISTER = AUTH + "/register";

    // Autentication google paths
    String GOOGLE = AUTH + "/google";

    // User Paths
    String USER = "/user";
}
