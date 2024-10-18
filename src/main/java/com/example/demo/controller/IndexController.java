package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {
    @GetMapping("/")
    public String index(Model model) {
        // Define o título da página no modelo
        model.addAttribute("pageTitle", "Pagina inicial"); // Você pode alterar o título conforme necessário
        return "views/appViews/index"; // This should be a template file in templates folder
    }
}