package br.com.fiap.entities;

public class Editora {

    // Atributos
    private String nome;
    private String cnpj;
    private Endereco endereco;
    private String telefone;
    private String email;

    // Construtor
    public Editora(String nome, String cnpj,
                   String telefone, String email) {
        this.nome = nome;
        this.cnpj = cnpj;
        this.telefone = telefone;
        this.email = email;
    }

    // Getters e Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    // toString
    @Override
    public String toString() {
        return "Editora" +
                "\nNome da Editora: " + nome +
                "\nCNPJ: " + cnpj +
                "\nEndereço: " + endereco +
                "\nTelefone: " + telefone +
                "\nEmail: " + email;
    }
}
