package com.demo.demo;

import org.springframework.web.bind.annotation.RestController;

import java.util.LinkedList;
import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
public class Controller{
    private List<Livro> livros;

    public Controller() {
        livros = new LinkedList<>();
        livros.add(new Livro(100, "Aprendendo Spring-Boot", "Java", 2023));
        livros.add(new Livro(101, "Aprendendo Java", "Java", 2022));
        livros.add(new Livro(102, "Aprendendo HTML", "HTML5", 2020));
        livros.add(new Livro(103, "Aprendendo JavaScript", "JS", 2023));
    }
    
    @GetMapping("")
    @CrossOrigin(origins = "*")
    public String mensagemBemVindo() {
        return "Bem vindo à Biblioteca Central!";
    }

    @GetMapping("livros")
    @CrossOrigin(origins = "*")
    public List<Livro> getListaLivros(){
        return livros;
    }

    // devolve a lista dos titulos pertencentes ao acervo
    @GetMapping("titulos")
    @CrossOrigin(origins = "*")
    public List<String> getTitulos(){
        return livros.stream()
                     .map(Livro::getTitulo)
                     .toList();
    }

    // devolve a lista dos autores dos livros pertencentes ao acervo (sem repeticao)
    @GetMapping("autores")
    @CrossOrigin(origins = "*")
    public List<String> getAutores(){
        return livros.stream()
                     .map(Livro::getAutor)
                     .distinct()
                     .toList();
    }
}
