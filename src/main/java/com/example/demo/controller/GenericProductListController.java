package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class GenericProductListController {
    @GetMapping("/lista_de_produtos_genericos")
    public String genericProductListController(Model model) {
        // Define o título da página no modelo
        model.addAttribute("pageTitle", "Lista de produtos genéricos"); // Você pode alterar o título conforme necessário
        return "views/appViews/genericProductList"; // This should be a template file in templates folder
    }
}
