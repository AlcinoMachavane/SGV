package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class StockMovementsController {
    @GetMapping("/movimentos_do_stock")
    public String stockMovementsController(Model model) {
        // Define o título da página no modelo
        model.addAttribute("pageTitle", "Movimentos do estoque"); // Você pode alterar o título conforme necessário
        return "views/appViews/stockMovements"; // This should be a template file in templates folder
    }
}