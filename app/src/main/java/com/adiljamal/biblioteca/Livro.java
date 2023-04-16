package com.adiljamal.biblioteca;

import java.io.Serializable;

public class Livro implements Serializable {
    private int id;
    private String titulo;
    private String nomeAutor;
    private int ano;
    private String localEd;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getNomeAutor() {
        return nomeAutor;
    }

    public void setNomeAutor(String nomeAutor) {
        this.nomeAutor = nomeAutor;
    }

    public int getAno() {
        return ano;
    }

    public void setData(int ano) {
        this.ano = ano;
    }

    public String getLocalEd() {
        return localEd;
    }

    public void setLocalEd(String localEd) {
        this.localEd = localEd;
    }

    public Livro( String titulo, String nomeAutor, int data, String localEd) {
        this.id = Math.round(1000);
        this.titulo = titulo;
        this.nomeAutor = nomeAutor;
        this.ano = ano;
        this.localEd = localEd;
    }
}
