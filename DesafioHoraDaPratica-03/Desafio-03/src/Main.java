import br.com.alura.modelos.ContaBancaria;
import br.com.alura.modelos.ContaCorrente;

public class Main {
    public static void main(String[] args) {
        ContaCorrente conta = new ContaCorrente();
        conta.sacar();
        conta.depositar();
        conta.consultarSaldo();
        //


    }
}