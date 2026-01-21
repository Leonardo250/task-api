package com.leo.task_api.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SwaggerRedirectController {

    @GetMapping("/")
    public String redirecToSwagger(){
        return "redirect:/swagger-ui/index.html";
    }
}
