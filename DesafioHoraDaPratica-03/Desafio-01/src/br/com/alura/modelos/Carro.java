package br.com.alura.modelos;

public class Carro {

    private String nomeModelo;
    private double valorAno1;
    private double valorAno2;
    private double valorAno3;

    public String getNomeModelo() {
        return nomeModelo;
    }

    public void setNomeModelo(String nomeModelo) {
        this.nomeModelo = nomeModelo;
    }

    public double getValorAno1() {
        return valorAno1;
    }

    public void setValorAno1(double valorAno1) {
        this.valorAno1 = valorAno1;
    }

    public double getValorAno2() {
        return valorAno2;
    }

    public void setValorAno2(double valorAno2) {
        this.valorAno2 = valorAno2;
    }

    public double getValorAno3() {
        return valorAno3;
    }

    public void setValorAno3(double valorAno3) {
        this.valorAno3 = valorAno3;
    }

    public void exibirMenorPreco() {
        double menor = valorAno1;
        if (menor > valorAno2) {
            menor = valorAno2;
        }
        if (menor > valorAno3) {
            menor = valorAno3;
        }
        System.out.println("Menor valor: " + menor);

    }
    public void exibirMaiorPreco() {
        double maior = valorAno1;
        if (maior < valorAno2) {
            maior = valorAno2;
        }
        if (maior < valorAno3) {
            maior = valorAno3;
        }
        System.out.println("Maior valor: " + maior);
    }

}
