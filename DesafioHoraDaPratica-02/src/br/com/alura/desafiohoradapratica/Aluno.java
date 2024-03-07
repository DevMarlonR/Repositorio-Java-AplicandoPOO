package br.com.alura.desafiohoradapratica;
// 04 Desenvolva uma classe Aluno com os atributos privados nome e notas. Utilize métodos getters e setters para
// acessar e modificar esses atributos. Adicione um método calcularMedia que retorna a média das notas do aluno.
public class Aluno {

    private String nome;
    private double notas;
    private int totalNotas;

    //Setters
    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setNotas(double notas) {
        this.notas += notas;
        totalNotas++;
    }

    //Getters
    public String getNome() {
        return nome;
    }
    public double getNotas() {
        return notas;
    }
    public int getTotalNotas() {
        return totalNotas;
    }

    //Metodos
    public double exibirMediaDeNotas() {
        return notas / totalNotas;
    }

}
