package br.com.alura.minhasmusicas.modelos;

public class MinhasPreferidas {

    public void inclui(Audio audio) {

        if (audio.getClassificacao() >= 9) {
            System.out.println(audio.getTitulo() + " está entre os seus preferidos!");
        } else {
            System.out.println(audio.getTitulo() + " está sendo ouvida por todos e também merece sua atenção");
        }

    }

}
