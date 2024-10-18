package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class StockController {
    @GetMapping("/stock")
    public String stockController(Model model) {
        // Define o título da página no modelo
        model.addAttribute("pageTitle", "Estoque"); // Você pode alterar o título conforme necessário
        return "views/appViews/stock"; // This should be a template file in templates folder

    }

}
