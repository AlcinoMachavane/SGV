package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PurchaseItemsListController {
    @GetMapping("/lista_de_grossario")
    public String purchaseItemsListContoller(Model model) {
        // Define o título da página no modelo
        model.addAttribute("pageTitle", "Lista de grossário"); // Você pode alterar o título conforme necessário
        return "views/appViews/purchaseItemsList"; // This should be a template file in templates folder

    }

}
