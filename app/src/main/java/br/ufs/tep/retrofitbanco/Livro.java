package br.ufs.tep.retrofitbanco;

/**
 * Created by ammenendez on 28/09/16.
 */

public class Livro {

    private int id;
    private String nome;
    private String autor;
    private int ano;

    public String getNome() {
        return nome;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNome(String titulo) {
        this.nome = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

}
