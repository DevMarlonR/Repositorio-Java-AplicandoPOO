/*
    01 - Crie uma classe Pessoa com um método que exibe "Olá, mundo!" no console.
    02 - Crie uma classe Calculadora com um método que recebe um número como parâmetro e retorna o dobro desse número.
    03 - Crie uma classe Musica com atributos titulo, artista, anoLancamento, avaliacao e numAvaliacoes, e métodos
     para exibir a ficha técnica, avaliar a música e calcular a média de avaliações.
    04 - Crie uma classe Carro com atributos modelo, ano, cor e métodos para exibir a ficha técnica e
    calcular a idade do carro.
    05 - Crie uma classe Aluno com atributos nome, idade, e um método para exibir informações.
    Crie uma instância da classe Aluno, atribua valores aos seus atributos e utilize o método para exibir as informações.
*/

public class Main {
    public static void main(String[] args) {
        // 01
        System.out.println("Classe: Pessoa");
        Pessoa mundo = new Pessoa();
        mundo.apresentacao();
        System.out.println();

        // 02
        System.out.println("Classe: Calculadora");
        Calculadora dobro = new Calculadora();
        int numero = dobro.dobrarNumero(21);
        System.out.println("Dobro do Número: " + numero);
        System.out.println();

        // 03
        System.out.println("Classe: Música");
        Musica topHit = new Musica();
        topHit.titulo = "Atirei o Pau no Gato";
        topHit.artista = "Galinha Pintadinha";
        topHit.anoLancamento = 2012;
        topHit.exibirFichaTecnica();
        topHit.avaliarMusica(10);
        topHit.avaliarMusica(8);
        System.out.println("Media das notas: " + topHit.calcularMediaAvaliacoes());
        System.out.println();

        // 04
        System.out.println("Classe: Carro");
        Carro sonho = new Carro();
        sonho.modelo = "Tesla Model S";
        sonho.ano = 2023;
        sonho.cor = "Branco";
        sonho.exibirFichaTecnica();
        System.out.println("Idade Carro: " + sonho.retornaIdadeCarro());
        System.out.println();

        // 05
        System.out.println("Classe: Aluno");
        Aluno aluno1 = new Aluno();
        aluno1.nome = "Micael";
        aluno1.idade = 28;
        aluno1.exibirAluno();
        System.out.println();

    }
}