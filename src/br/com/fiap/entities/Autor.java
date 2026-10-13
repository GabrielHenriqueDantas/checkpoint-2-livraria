package br.com.fiap.entities;

import java.time.LocalDate;

public class Autor {

    // visibilidade, tipo de dados e atributos

    private String nome;
    private String nacionalidade;
    private String email;
    private LocalDate dataNascimento;

    public Autor() {
    }

    // metodos getters e setters

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }
}

