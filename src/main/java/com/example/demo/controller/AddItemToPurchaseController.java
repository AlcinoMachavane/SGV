package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AddItemToPurchaseController {
    @GetMapping("/adicionar_produto")
    public String addItemToPurchaseController(Model model) {
        // Define o título da página no modelo
        model.addAttribute("pageTitle", "Adicionar produto"); // Você pode alterar o título conforme necessário
        return "views/appViews/addItemToPurchase"; // This should be a template file in templates folder
    }
}
