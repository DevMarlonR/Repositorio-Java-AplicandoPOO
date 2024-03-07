import br.com.alura.modelos.Carro;
import br.com.alura.modelos.ModeloCarro;

public class Main {
    public static void main(String[] args) {
        ModeloCarro carroDoMarlon = new ModeloCarro();

        carroDoMarlon.setNomeModelo("Tesla Model 3");
        carroDoMarlon.setValorAno1(1000000);
        carroDoMarlon.setValorAno2(2000000);
        carroDoMarlon.setValorAno3(3000000);
        carroDoMarlon.exibirMaiorPreco();
        carroDoMarlon.exibirMenorPreco();

    }
}