package br.com.fiap.entities;

public class Livro {

    // visibilidade, tipo de dados e atributos
    private String titulo;
    private double preco;
    private Autor autor; // atributo de referencia
    //private Editora editora; // atributo de referencia

    // metodos getters e setters

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

    //public Editora getEditora() {
    //    return editora;
    //}

    //public void setEditora(Editora editora) {
    //   this.editora = editora;
    //}
}