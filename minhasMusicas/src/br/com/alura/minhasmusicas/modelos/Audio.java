package br.com.alura.minhasmusicas.modelos;

public class Audio {

    private String titulo;
    private int totalReproducoes;
    private int totalCurtidas;
    private int classificacao;

    //getters e setters

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getTotalReproducoes() {
        return totalReproducoes;
    }

    public int getTotalCurtidas() {
        return totalCurtidas;
    }

    public int getClassificacao() {
        return classificacao;
    }

    // Métodos

    public void curte() {
        this.totalCurtidas++;
    }

    public void reproduz() {
        System.out.println("Tocando: " + getTitulo());
        this.totalReproducoes++;
    }



}
