package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PositiveAdjustmentController {
    @GetMapping("/ajuste_positivo")
    public String positiveAdjustmentController(Model model) {
        // Define o título da página no modelo
        model.addAttribute("pageTitle", "Ajuste positivo"); // Você pode alterar o título conforme necessário
        return "views/appViews/positiveAdjustment"; // This should be a template file in templates folder
    }
}