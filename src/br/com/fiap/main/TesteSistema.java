package br.com.fiap.main;

import br.com.fiap.entities.Autor;
import br.com.fiap.entities.Editora;
import br.com.fiap.entities.Endereco;
import br.com.fiap.entities.Livro;
//import br.com.fiap.entities.Editora;

import javax.swing.*;
import java.io.OutputStream;
import java.time.LocalDate;

public class TesteSistema {
        // String
        static String texto(String j) { return JOptionPane.showInputDialog(j); }

        // int
        static int inteiro(String j) { return Integer.parseInt( JOptionPane.showInputDialog(j) ); }

        // double
        static double real(String j){ return Double.parseDouble( JOptionPane.showInputDialog(j) ); }

    public static void main(String[] args) {

        // Instanciar objetos

        Livro objLivro = new Livro(
                texto("Informações do Livro\nTítulo:"),
                real("Preço do livro:")
        );
        Autor objAutor = new Autor(
                texto( "Informações do Autor\nNome:"),
                texto( "Nacionalidade:"),
                texto("Email:"),
                texto( "Data de nascimento:")
        );
        Editora objEditora = new Editora(
                texto("Informações da Editora\nNome:"),
                texto("Cnpj:"),
                texto("Telfone:"),
                texto("Email:")
        );
        Endereco objEndereco = new Endereco(
                texto("Endereço da Editora\nLogradouro:"),
                inteiro("Número:"),
                texto("Complemento:"),
                texto("Cep:"),
                texto("Bairro:"),
                texto("Cidade:"),
                texto("Estados:")
        );

        objEditora.setEndereco(objEndereco);
        objLivro.setAutor(objAutor);
        objLivro.setEditora(objEditora);

        // Saídas
        System.out.print(
                objLivro + "\n" +
                        objAutor + "\n" +
                        objEditora + "\n" +
                        objEndereco
        );
    }
}
