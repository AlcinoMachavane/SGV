package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SpecificProductListController {
    @GetMapping("/lista_de_produtos_especificos")
    public String specificProductListController(Model model) {
        // Define o título da página no modelo
        model.addAttribute("pageTitle", "Lista de produtos específicos"); // Você pode alterar o título conforme necessário
        return "views/appViews/specificProductList"; // This should be a template file in templates folder
    }
}
