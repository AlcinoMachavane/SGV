package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PurchaseListController {
    @GetMapping("/Lista_de_compras")
    public String purchaseListController(Model model) {
        // Define o título da página no modelo
        model.addAttribute("pageTitle", "Lista de compras"); // Você pode alterar o título conforme necessário
        return "views/appViews/purchaseList"; // This should be a template file in templates folder

    }
}
