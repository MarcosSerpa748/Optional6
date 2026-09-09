import java.util.List;
import java.util.Optional;

public class MetodosEstaticos {
    public static Optional<Usuario> vericarPrimeiraLista(List<Usuario> primeiraLista,Integer id){



        return primeiraLista
                .stream()
                .filter(e ->e.getId() == id)
                .findFirst();
    }
    public static Optional<Usuario> verificarSegundaLista(List<Usuario> segundaLista,Integer id){

        return segundaLista
                .stream()
                .filter(e ->e.getId() == id)
                .findFirst();
    }
}
