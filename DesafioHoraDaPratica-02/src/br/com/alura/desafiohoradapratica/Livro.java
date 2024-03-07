package br.com.alura.desafiohoradapratica;
// 05 Desenvolva uma classe Livro com os atributos privados titulo e autor. Utilize métodos getters e setters
// para acessar e modificar esses atributos. Adicione um método exibirDetalhes que imprime o título e o autor do livro.
public class Livro {

    private String titulo;
    private String autor;

    //Setters
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public  void setAutor(String autor) {
        this.autor = autor;
    }

    //Getters
    public String getTitulo() {
        return titulo;
    }
    public String getAutor() {
        return autor;
    }

    //Metodos
    public void exibirDetalhes() {
        System.out.println("Titulo do livro: " + titulo);
        System.out.println("Autor do livro: " + autor);
    }

}
