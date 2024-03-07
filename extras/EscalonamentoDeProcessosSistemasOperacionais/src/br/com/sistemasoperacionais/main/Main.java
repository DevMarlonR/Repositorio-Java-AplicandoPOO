package br.com.sistemasoperacionais.main;

import br.com.sistemasoperacionais.modelos.FCFS;
import br.com.sistemasoperacionais.modelos.FilaDeProcessos;
import br.com.sistemasoperacionais.modelos.SJF;

public class Main {
    public static void main(String[] args) {
        int[] tarefas = {2, 5, 1, 4, 10};
        FilaDeProcessos primeiroProcesso = new FilaDeProcessos(tarefas);
        FCFS fila = new FCFS();
        SJF menorPrimeiro = new SJF();

        primeiroProcesso.imprimirProcessos();

        System.out.println("Processos em FCFS - First Come First Serve");
        fila.run(primeiroProcesso);
        System.out.println("Processos em SJF - Shortest Job First");
        menorPrimeiro.run(primeiroProcesso);

    }
}
