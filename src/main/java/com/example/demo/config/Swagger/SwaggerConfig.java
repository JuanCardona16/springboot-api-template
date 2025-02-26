package com.example.demo.config.Swagger;

import org.springframework.context.annotation.Configuration;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.info.License;
import io.swagger.v3.oas.annotations.servers.Server;

@OpenAPIDefinition(
        info = @Info(
                title = "Plantilla API REST sprint boot",
                description = "Plantilla de API REST en sprint boot",
                termsOfService = "jcardonabageth@gmail.com",
                version = "0.0.0",
                contact = @Contact(
                        name = "Juan David Cardona Bageth",
                        url = "https://www.linkedin.com/in/juan-david-cardona-5987a7236/",
                        email = "jcardonabageth@gmail.com"
                ),
                license = @License(
                        name = "Desarrollo de software",
                        url = "https://www.linkedin.com/in/juan-david-cardona-5987a7236/"
                )
        ),
        servers = {
                @Server(
                        description = "DEV SERVER",
                        url = "http://localhost:8080"
                ),
        }
)


@Configuration
public class SwaggerConfig {


}
