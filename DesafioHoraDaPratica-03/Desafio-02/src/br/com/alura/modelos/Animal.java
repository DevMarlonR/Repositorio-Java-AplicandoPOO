package br.com.alura.modelos;

public class Animal {

    private String nome;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }


    public void emitirSom() {
        System.out.println(nome + " está: *fazendo barulho!*");
    }

}