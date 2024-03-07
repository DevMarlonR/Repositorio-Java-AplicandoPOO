public class Musica {
    String titulo;
    String artista;
    int anoLancamento;
    double avaliacao;
    int numAvaliacoes;

    void exibirFichaTecnica() {
        System.out.println("/-/-/-/-/-/-/-/-/-/-/-/-/");
        System.out.println("Nome da música: " + titulo);
        System.out.println("Artista: " + artista);
        System.out.println("Ano de Lançamento: " + anoLancamento);
        System.out.println("/-/-/-/-/-/-/-/-/-/-/-/-/");
    }

    void avaliarMusica(double nota) {
        avaliacao += nota;
        numAvaliacoes++;
    }

    double calcularMediaAvaliacoes() {
        return avaliacao / numAvaliacoes;
    }

}
