package br.com.alura.desafiohoradapratica;

// 01 - Crie uma classe br.com.alura.desafiohoradapratica.ContaBancaria com os seguintes atributos: numeroConta (privado), saldo (privado) e titular
// (publico). Implemente métodos getters e setters para os atributos privados.
public class ContaBancaria {
    private int numeroConta;
    private double saldo;
    public String titular;

    //Setters
    public void setNumeroConta (int numeroConta) {
        this.numeroConta = numeroConta;
    }
    public void setSaldo (double saldo) {
        this.saldo = saldo;
    }

    //Getters
    public int getNumeroConta() {
        return numeroConta;
    }

    public double getSaldo() {
        return saldo;
    }

}
