package br.com.alura.minhasmusicas.modelos;

public class Musica extends Audio {

    private String album;
    private String artista;
    private String gerenero;

    public String getAlbum() {
        return album;
    }

    public void setAlbum(String album) {
        this.album = album;
    }

    public String getArtista() {
        return artista;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }

    public String getGerenero() {
        return gerenero;
    }

    public void setGerenero(String gerenero) {
        this.gerenero = gerenero;
    }

    @Override
    public int getClassificacao() {
        if (this.getTotalReproducoes() > 2000) {
            return 10;
        } else {
            return 7;
        }
    }
}
