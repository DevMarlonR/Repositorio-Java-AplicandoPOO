import br.com.alura.modelos.Animal;
import br.com.alura.modelos.Cachorro;
import br.com.alura.modelos.Gato;

public class Main {
    public static void main(String[] args) {
        Animal elephant = new Animal();
        elephant.setNome("Elefante cor de rosa");
        elephant.emitirSom();

        Gato cat = new Gato();
        cat.setNome("Mingau");
        cat.emitirSom();
        cat.aranharMoveis();

        Cachorro dog = new Cachorro();
        dog.setNome("Totó");
        dog.emitirSom();
        dog.abanarORabo();

    }
}