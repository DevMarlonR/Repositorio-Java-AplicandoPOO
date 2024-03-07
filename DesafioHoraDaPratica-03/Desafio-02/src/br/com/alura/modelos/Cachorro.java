package br.com.alura.modelos;

public class Cachorro extends Animal {

    public void abanarORabo() {
        System.out.println(getNome() + " está: *Abanando o rabo!*");
    }

    @Override
    public void emitirSom() {
        System.out.println(getNome() + " está: *Latindo!*");
    }

}
