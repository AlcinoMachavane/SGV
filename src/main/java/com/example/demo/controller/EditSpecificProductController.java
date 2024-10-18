package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class EditSpecificProductController {
    @GetMapping("/editar_produto_especifico")
    public String editSpecificProductController(Model model) {
        // Define o título da página no modelo
        model.addAttribute("pageTitle", "Editar produto específico"); // Você pode alterar o título conforme necessário
        return "views/appViews/editSpecificProduct"; // This should be a template file in templates folder

    }

}
