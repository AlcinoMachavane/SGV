package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SalesController {
    @GetMapping("/vendas")
    public String salesController(Model model) {
        // Define o título da página no modelo
        model.addAttribute("pageTitle", "Ajuste vendas"); // Você pode alterar o título conforme necessário
        return "views/appViews/sales"; // This should be a template file in templates folder
    }
}