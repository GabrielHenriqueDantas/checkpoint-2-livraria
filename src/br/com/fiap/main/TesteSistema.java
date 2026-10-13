package br.com.fiap.main;

import br.com.fiap.entities.Autor;
import br.com.fiap.entities.Livro;
//import br.com.fiap.entities.Editora;

import javax.swing.*;
import java.time.LocalDate;

public class TesteSistema {

    public static void main(String[] args) {

        //Instanciar objetos
        Autor objAutor = new Autor();
        Livro objLivro = new Livro();
        //Editora objEditora = new Editora ();

        //Entradas do Autor
        objAutor.setNome(JOptionPane.showInputDialog("Nome do Autor"));
        objAutor.setNacionalidade(JOptionPane.showInputDialog("Nacionalidade"));
        objAutor.setEmail(JOptionPane.showInputDialog("Email"));
        objAutor.setDataNascimento(LocalDate.parse(JOptionPane.showInputDialog("Data de Nascimento (AAAA-MM-DD)")));

        //Entradas do Livro
        objLivro.setTitulo(JOptionPane.showInputDialog("Titulo do Livro"));
        objLivro.setPreco(Double.parseDouble(JOptionPane.showInputDialog("Preço do Livro")));
        objLivro.setAutor(objAutor);
        //objLivro.setEditora(objEditora);

        //Saidas do Autor
        System.out.println("\nNome do Autor:" + objAutor.getNome());
        System.out.println("\nNacionalidade:" + objAutor.getNacionalidade());
        System.out.println("Email:" + objAutor.getEmail());
        System.out.println("Data de nascimento:" + objAutor.getDataNascimento());

        System.out.println("\nTitulo do Livro:" + objLivro.getTitulo());
        System.out.println("Preço: R$ " + objLivro.getPreco());
        System.out.println("Autor:" + objLivro.getAutor().getNome());
        //System.out.println("Editora: " + objLivro.getEditora().getNome());

    }

}
