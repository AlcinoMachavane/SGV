package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class GenericProductRegisterController {
    @GetMapping("/cadastro_de_produto_generico")
    public String genericProductRegisterController(Model model) {
        // Define o título da página no modelo
        model.addAttribute("pageTitle", "Cadastro de produto genérico"); // Você pode alterar o título conforme necessário
        return "views/appViews/genericProductRegister"; // This should be a template file in templates folder

    }

}
