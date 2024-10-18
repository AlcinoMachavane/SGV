package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ProductController {
    @GetMapping("/produtos")
    public String product(Model model) {
        // Define o título da página no modelo
        model.addAttribute("pageTitle", "Produtos"); // Você pode alterar o título conforme necessário
        return "views/appViews/product"; // This should be a template file in templates folder
    }
}
