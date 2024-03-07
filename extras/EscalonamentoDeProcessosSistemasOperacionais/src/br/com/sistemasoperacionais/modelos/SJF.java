package br.com.sistemasoperacionais.modelos;

public class SJF {

    // Shortest Job First (Não-Premptivo)

    public void run(FilaDeProcessos processos) {
        //Organizando os processos
        boolean trocou;
        do {
            trocou = false;

            for (int i = 0; i < processos.getProcessos().length-1; i++) {
                if (processos.getProcessos()[i] > processos.getProcessos()[i+1]) {
                    int aux = processos.getProcessos()[i];
                    processos.getProcessos()[i] = processos.getProcessos()[i+1];
                    processos.getProcessos()[i+1] = aux;
                    trocou = true;
                }
            }
        } while(trocou);

        // Rodando
        for (int i = 0; i < processos.getProcessos().length; i++) {
            System.out.println((i+1) + "º - executando tamanho: " + processos.getProcessos()[i]);
        }

    }


}
