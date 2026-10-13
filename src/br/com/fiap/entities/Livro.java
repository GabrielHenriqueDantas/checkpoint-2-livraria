package br.com.fiap.entities;

public class Livro {

    // Atributos
    private String titulo;
    private double preco;
    private Autor autor;
    private Editora editora;

    // Construtor
    public Livro(String titulo, double preco) {
        this.titulo = titulo;
        this.preco = preco;
    }

    // Getters e Setters
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public Autor getAutor() {
        return autor;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }

    public Editora getEditora() {
        return editora;
    }

    public void setEditora(Editora editora) {
        this.editora = editora;
    }

    // toString
    @Override
    public String toString() {
        return " LIVRO " +
                "\nTítulo: " + titulo +
                "\nPreço: R$ " + preco +
                "\n\nAutor: " + autor +
                "\n\nEditora: " + editora;
    }
}