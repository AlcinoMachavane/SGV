package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SpecificProductRegisterController {
    @GetMapping("/cadastro_de_produto_especifico")
    public String specificProductRegisterController(Model model) {
        // Define o título da página no modelo
        model.addAttribute("pageTitle", "Cadastro de produto específico"); // Você pode alterar o título conforme necessário
        return "views/appViews/specificProductRegister"; // This should be a template file in templates folder

    }

}
