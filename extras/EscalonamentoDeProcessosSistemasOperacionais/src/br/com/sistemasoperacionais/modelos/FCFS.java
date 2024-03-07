package br.com.sistemasoperacionais.modelos;

public class FCFS {

    // First Come First Serve;
    
    public void run(FilaDeProcessos processos) {
        for (int i = 0; i < processos.getProcessos().length; i++) {
            System.out.println((i+1) + "º - executando tamanho: " + processos.getProcessos()[i]);
        }
    }

}
