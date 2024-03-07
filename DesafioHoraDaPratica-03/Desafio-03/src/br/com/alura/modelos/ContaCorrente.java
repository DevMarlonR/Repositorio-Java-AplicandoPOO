package br.com.alura.modelos;

public class ContaCorrente extends ContaBancaria {

    public void cobrarTarifaMensal() {
        double valorDesconto = getSaldo() * ((double) 10 /100);
        saldo -= valorDesconto;
        System.out.println("Foi Descontado o valor mensal de 10% de sua conta");
        System.out.println("Valor descontado: "+ valorDesconto);
        System.out.println("Saldo atual: " + saldo);
    }

}
