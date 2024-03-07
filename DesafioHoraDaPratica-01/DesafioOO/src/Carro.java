import java.util.Calendar;

public class Carro {
    String modelo;
    int ano;
    String cor;

    void exibirFichaTecnica() {
        System.out.println("*-*-*-*-*-*-*-*-*-*-*-*");
        System.out.println("Carro: " + modelo);
        System.out.println("Ano: " + ano);
        System.out.println("Cor: " + cor);
        System.out.println("*-*-*-*-*-*-*-*-*-*-*-*");
    }

    int retornaIdadeCarro() {
        Calendar cal = Calendar.getInstance();
        int anoAtual = cal.get(Calendar.YEAR);

        return anoAtual - ano;

    }

}
