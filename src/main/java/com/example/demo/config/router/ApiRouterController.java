package com.example.demo.config.router;

import com.example.demo.constants.ConsultationPaths;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(ConsultationPaths.BASE_API)
public abstract class ApiRouterController {
}
