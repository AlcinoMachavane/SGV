package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PurchaseController {
    @GetMapping("/compras")
    public String purchaseController(Model model) {
        // Define o título da página no modelo
        model.addAttribute("pageTitle", "Compras"); // Você pode alterar o título conforme necessário
        return "views/appViews/purchase"; // This should be a template file in templates folder

    }
};
