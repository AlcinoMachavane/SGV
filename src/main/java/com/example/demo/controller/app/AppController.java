package com.example.demo.controller.app;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("/app")
public class AppController {

    // Rota para a página inicial
    @GetMapping("/home")
    public String index(Model model) {
        model.addAttribute("title", "Página Inicial");
        return "app/index"; // Renderiza o template "home.html"
    }



    @GetMapping("/adicionar_produto")
    public String addItemToPurchase(Model model) {
        // Define o título da página no modelo
        model.addAttribute("pageTitle", "Adicionar produto"); // Você pode alterar o título conforme necessário
        return "app/addItemToPurchase"; // This should be a template file in templates folder
    }



    @GetMapping("/editar_produto_generico")
    public String editGenericProduct(Model model) {
        // Define o título da página no modelo
        model.addAttribute("pageTitle", "Adicionar produto"); // Você pode alterar o título conforme necessário
        return "app/editGenericProduct"; // This should be a template file in templates folder
    }



    @GetMapping("/editar_produto_especifico")
    public String editSpecificProduct(Model model) {
        // Define o título da página no modelo
        model.addAttribute("pageTitle", "Editar produto específico"); // Você pode alterar o título conforme necessário
        return "app/editSpecificProduct"; // This should be a template file in templates folder

    }



    @GetMapping("/lista_de_produtos_genericos")
    public String genericProductList(Model model) {
        // Define o título da página no modelo
        model.addAttribute("pageTitle", "Lista de produtos genéricos"); // Você pode alterar o título conforme necessário
        return "app/genericProductList"; // This should be a template file in templates folder
    }



    @GetMapping("/cadastro_de_produto_generico")
    public String genericProductRegister(Model model) {
        // Define o título da página no modelo
        model.addAttribute("pageTitle", "Cadastro de produto genérico"); // Você pode alterar o título conforme necessário
        return "app/genericProductRegister"; // This should be a template file in templates folder

    }



    @GetMapping("/ajuste_negativo")
    public String negativeAdjustment(Model model) {
        // Define o título da página no modelo
        model.addAttribute("pageTitle", "Ajuste negativo"); // Você pode alterar o título conforme necessário
        return "app/negativeAdjustment"; // This should be a template file in templates folder
    }



    @GetMapping("/ajuste_positivo")
    public String positiveAdjustment(Model model) {
        // Define o título da página no modelo
        model.addAttribute("pageTitle", "Ajuste positivo"); // Você pode alterar o título conforme necessário
        return "app/positiveAdjustment"; // This should be a template file in templates folder
    }



    @GetMapping("/produtos")
    public String product(Model model) {
        // Define o título da página no modelo
        model.addAttribute("pageTitle", "Produtos"); // Você pode alterar o título conforme necessário
        return "app/product"; // This should be a template file in templates folder
    }



    @GetMapping("/lista_de_grossario")
    public String purchaseItemsList(Model model) {
        // Define o título da página no modelo
        model.addAttribute("pageTitle", "Lista de grossário"); // Você pode alterar o título conforme necessário
        return "app/purchase"; // This should be a template file in templates folder

    }



    @GetMapping("/Lista_de_compras")
    public String purchaseList(Model model) {
        // Define o título da página no modelo
        model.addAttribute("pageTitle", "Lista de compras"); // Você pode alterar o título conforme necessário
        return "app/purchaseList"; // This should be a template file in templates folder

    }



    @GetMapping("/vendas")
    public String sales(Model model) {
        // Define o título da página no modelo
        model.addAttribute("pageTitle", "Ajuste vendas"); // Você pode alterar o título conforme necessário
        return "app/sales"; // This should be a template file in templates folder
    }



    @GetMapping("/lista_de_produtos_especificos")
    public String specificProductList(Model model) {
        // Define o título da página no modelo
        model.addAttribute("pageTitle", "Lista de produtos específicos"); // Você pode alterar o título conforme necessário
        return "app/specificProductList"; // This should be a template file in templates folder
    }



    @GetMapping("/cadastro_de_produto_especifico")
    public String specificProductRegister(Model model) {
        // Define o título da página no modelo
        model.addAttribute("pageTitle", "Cadastro de produto específico"); // Você pode alterar o título conforme necessário
        return "app/specificProductRegister"; // This should be a template file in templates folder

    }



    @GetMapping("/stock")
    public String stock(Model model) {
        // Define o título da página no modelo
        model.addAttribute("pageTitle", "Estoque"); // Você pode alterar o título conforme necessário
        return "app/stock"; // This should be a template file in templates folder

    }



    @GetMapping("/movimentos_do_stock")
    public String stockMovements(Model model) {
        // Define o título da página no modelo
        model.addAttribute("pageTitle", "Movimentos do estoque"); // Você pode alterar o título conforme necessário
        return "app/stockMovements"; // This should be a template file in templates folder
    }
}