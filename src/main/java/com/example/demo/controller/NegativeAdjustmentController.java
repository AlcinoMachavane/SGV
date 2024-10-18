package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class NegativeAdjustmentController {
    @GetMapping("/ajuste_negativo")
    public String negativeAdjustmentController(Model model) {
        // Define o título da página no modelo
        model.addAttribute("pageTitle", "Ajuste negativo"); // Você pode alterar o título conforme necessário
        return "views/appViews/negativeAdjustment"; // This should be a template file in templates folder
    }
}