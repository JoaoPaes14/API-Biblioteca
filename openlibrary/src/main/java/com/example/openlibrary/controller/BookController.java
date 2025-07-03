package com.example.openlibrary.controller;  // Corrigido o nome do pacote

import com.example.openlibrary.model.Book;  // Corrigido o nome do pacote
import com.example.openlibrary.service.OpenLibraryService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;  // Corrigido a importação de RequestParam
import java.util.List;

@Controller
public class BookController {

    private final OpenLibraryService openLibraryService;

    // Construtor
    public BookController(OpenLibraryService openLibraryService){
        this.openLibraryService = openLibraryService;
    }

    // Mapeamento da rota inicial
    @GetMapping("/")
    public String home(){
        return "index";
    }

    // Mapeamento da rota /buscar
    @GetMapping("/buscar")
    public String buscar(@RequestParam String query, Model model) {
        List<Book> livros = openLibraryService.buscarLivros(query);
        model.addAttribute("Livros", livros);  // Passando os livros para o modelo
        return "result";  // Retornando a página result.html
    }

}
