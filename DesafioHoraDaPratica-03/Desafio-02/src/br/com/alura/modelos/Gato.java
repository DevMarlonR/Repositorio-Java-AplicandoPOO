package br.com.alura.modelos;

public class Gato extends Animal {

    public void aranharMoveis() {
        System.out.println(getNome() + " está: *Arranhando os moveis!*");
    }

    @Override
    public void emitirSom() {
        System.out.println(getNome() + " está: *Miando!*");
    }


}
