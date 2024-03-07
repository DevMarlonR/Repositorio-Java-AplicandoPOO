package br.com.alura.minhasmusicas.main;

import br.com.alura.minhasmusicas.modelos.MinhasPreferidas;
import br.com.alura.minhasmusicas.modelos.Musica;
import br.com.alura.minhasmusicas.modelos.Podcast;

public class Main {
    public static void main(String[] args) {

        Musica minhaMusica = new Musica();
        minhaMusica.setTitulo("Lugar Distante");
        minhaMusica.setArtista("Matue");
        for (int i = 0; i < 3000; i++) {
            minhaMusica.reproduz();
        }
        for (int i = 0; i < 47; i++) {
            minhaMusica.curte();
        }

        Podcast meuPodcast = new Podcast();
        meuPodcast.setTitulo("Chat com os Devs");
        meuPodcast.setApresentador("Micael Mota");
        for (int i = 0; i < 500; i++) {
            meuPodcast.reproduz();
        }
        for (int i = 0; i < 125; i++) {
            meuPodcast.curte();
        }

        MinhasPreferidas minhasPreferidas = new MinhasPreferidas();
        minhasPreferidas.inclui(minhaMusica);
        minhasPreferidas.inclui(meuPodcast);

    }
}
