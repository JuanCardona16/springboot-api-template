package com.example.demo.modules.authentication.basic.controllers;

import com.example.demo.config.router.ApiRouterController;
import com.example.demo.constants.ConsultationPaths;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AuthBasicController extends ApiRouterController {

    @GetMapping(ConsultationPaths.LOGIN)
    public String login() {
        return "Ruta de inicio de sesion";
    }

    @GetMapping(ConsultationPaths.REGISTER)
    public String register() {
        return "Ruta para crear una cuenta";
    }

}
