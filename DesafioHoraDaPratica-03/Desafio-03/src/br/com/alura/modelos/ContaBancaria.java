package br.com.alura.modelos;

import java.util.Scanner;

public class ContaBancaria {

    protected double saldo;

    public double getSaldo() {
        return saldo;
    }

    private void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public ContaBancaria(double valorInicial) {
        setSaldo(valorInicial);
    }

    public void consultarSaldo() {
        System.out.println("Saldo: " + saldo);
    }

    public void depositar() {
        System.out.print("Valor a ser depositado: ");
        Scanner sc = new Scanner(System.in);
        double deposito;
        do {
            deposito = sc.nextDouble();
            if (deposito <= 0) {
                System.out.println("Valor precisa ser maior ou igual a 0 para depositar.");
            } else {
                saldo += deposito;
                System.out.println("Deposito realizado com sucessso!");
            }
        } while (deposito <= 0);

        sc.close();
    }

    public void sacar() {
        System.out.println("Valor a ser sacado: ");
        Scanner sc = new Scanner(System.in);
        double saque;

        do {
            saque = sc.nextDouble();
            if (saque > saldo) {
                System.out.println("Valor insuficiente para saque!");
            } else if (saque <= 0) {
                System.out.println("Insira um valor maior que 0 para saque.");
            } else {
                saldo -= saque;
                System.out.println("Saque realizado com sucesso!");
            }
        } while (saque > 0 && saque <= saldo);

    }

}
