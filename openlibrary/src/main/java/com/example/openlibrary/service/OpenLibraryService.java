package com.example.openlibrary.service;  // Corrigido o pacote

import com.example.openlibrary.model.Book;  // Corrigido o pacote
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

import java.util.List;  // Importando List corretamente

@Service
public class OpenLibraryService {
    private final String API_URL = "https://openlibrary.org/search.json";

    public List<Book> buscarLivros(String query) {
        try {
            RestTemplate restTemplate = new RestTemplate();

            // Construindo a URL com o parâmetro de consulta (query)
            String url = UriComponentsBuilder.fromHttpUrl(API_URL)
                    .queryParam("q", query)  // Adiciona o parâmetro de consulta para pesquisa por título/autor
                    .toUriString();

            // Fazendo a requisição GET para a API
            OpenLibraryResponse response = restTemplate.getForObject(url, OpenLibraryResponse.class);

            // Retorna os livros ou uma lista vazia caso a resposta seja nula
            return response != null ? response.docs : List.of();
        } catch (Exception e) {
            e.printStackTrace();  // Log da exceção
            return List.of();  // Retorna uma lista vazia em caso de erro
        }
    }

    // Classe interna para o formato de resposta da API
    private static class OpenLibraryResponse {
        public List<Book> docs;  // Lista de livros
    }
}
