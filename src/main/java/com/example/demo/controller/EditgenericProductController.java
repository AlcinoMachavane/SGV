package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class EditgenericProductController {
    @GetMapping("/editar_produto_generico")
    public String editgenericProductController(Model model) {
        // Define o título da página no modelo
        model.addAttribute("pageTitle", "Editar produto genérico"); // Você pode alterar o título conforme necessário
        return "views/appViews/editGenericProduct"; // This should be a template file in templates folder

    }

}
