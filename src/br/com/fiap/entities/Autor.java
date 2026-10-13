package br.com.fiap.entities;

public class Autor {

    // Atributos
    private String nome;
    private String nacionalidade;
    private String email;
    private String dataNascimento;

    // Construtor
    public Autor(String nome, String nacionalidade,
                 String email, String dataNascimento) {
        this.nome = nome;
        this.nacionalidade = nacionalidade;
        this.email = email;
        this.dataNascimento = dataNascimento;
    }

    // Getters e Setters
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

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    // toString
    @Override
    public String toString() {
        return "Autor" +
                "\nNome: " + nome +
                "\nNacionalidade: " + nacionalidade +
                "\nEmail: " + email +
                "\nData de nascimento: " + dataNascimento;
    }
}

