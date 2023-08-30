package com.demo.demo;

public class Livro {
    private int id;
    private String titulo;
    private String autor;
    private int ano;
    
    public Livro(int id, String titulo, String autor, int ano) {
        this.id = id;
        this.titulo = titulo;
        this.autor = autor;
        this.ano = ano;
    }

    public int getId() {
        return id;
    }
    public String getTitulo() {
        return titulo;
    }
    public String getAutor() {
        return autor;
    }
    public int getAno() {
        return ano;
    }

    @Override
    public String toString() {
        return "\nLivro: \nid: " + id + "\n titulo: " + titulo + "\n autor: " + autor + "\n ano: " + ano + "\n-----";
    }  

}
