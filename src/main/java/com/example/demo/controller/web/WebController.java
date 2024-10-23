package com.example.demo.controller.web;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/web")
public class WebController {

    // Rota para a página inicial
    @GetMapping("/home")
    public String homePage(Model model) {
        model.addAttribute("title", "Página Inicial");
        return "views/web/home"; // Renderiza o template "home.html"
    }

    // Rota para a galeria
    @GetMapping("/funcionalidades")
    public String featuresPage(Model model) {
        model.addAttribute("title", "Funcionalidades do Flexgest");
        return "views/web/features"; // Renderiza o template "gallery.html"
    }

    // Rota para o blog
    @GetMapping("/login")
    public String loginPage(Model model) {
        model.addAttribute("title", "Login");
        return "views/web/login/login"; // Renderiza o template "blog.html"
    }

    // Rota para criar um novo post (formulário de criação)
    @GetMapping("/cadastro")
    public String registerForm(Model model) {
        model.addAttribute("title", "Cadastro");
        return "views/web/register"; // Renderiza o template "newPost.html"
    }

    // Rota para exibir um post específico
    @GetMapping("/recuperar_senha")
    public String recoveryPassWordFirstStepPage(Model model) {
        model.addAttribute("title", "Recuperar senha");
        return "views/web/login/recoveryPassWordFirstStep"; // Renderiza o template "blogPost.html"
    }

    // Rota para a página de administração
    @GetMapping("/inserir_codigo_de_recuperacao")
    public String recoveryPassWordSecondStepPage(Model model) {
        model.addAttribute("title", "Inserir codigo de recuperação");
        return "views/web/login/recoveryPassWordSecondStep"; // Renderiza o template "admin.html"
    }

}
