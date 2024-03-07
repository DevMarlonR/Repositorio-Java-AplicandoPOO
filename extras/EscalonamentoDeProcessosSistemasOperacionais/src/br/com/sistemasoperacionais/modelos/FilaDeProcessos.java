package br.com.sistemasoperacionais.modelos;

public class FilaDeProcessos {

    private int[] processos = {};

    public FilaDeProcessos(int[] processos) {
        this.processos = processos;
    }


    public int[] getProcessos() {
        return processos;
    }

    public void imprimirProcessos() {
        int cont = 0;
        System.out.println("Processos");
        for (int job : getProcessos()){
            System.out.println(++cont + "º - " + job);
        }
    }
}
