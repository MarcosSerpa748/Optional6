import java.util.List;
import java.util.Optional;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<Usuario> primeiraLista = List.of(
                new Usuario(1,"Marcos"),
                new Usuario(2,"Débora")
        );
        List<Usuario> segundaLista = List.of(
                new Usuario(3,"Carlor"),
                new Usuario(4,"Letícia")
        );

        System.out.println("Digite o id do usuário que você está buscando:");
        Integer id = sc.nextInt();

        Optional<Usuario> usuarioDesejado = MetodosEstaticos.vericarPrimeiraLista(primeiraLista,id)
                .or(() -> MetodosEstaticos.verificarSegundaLista(segundaLista,id));

        System.out.println(usuarioDesejado);
    }
}