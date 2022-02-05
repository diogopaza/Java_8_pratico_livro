import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class Capitulo4 {
    public static void main(String[] args) {
        /*
        Usuario user1 = new Usuario("Paulo", 150);
        Usuario user2 = new Usuario("Joao", 200);
        Usuario user3 = new Usuario("Beto", 111);

        List<Usuario> usuarios = Arrays.asList(user1,user2,user3);
        */
        Usuario user1 = new Usuario("Paulo Vieira", 150);
        Usuario user2 = new Usuario("Rodrigo Turini", 120);
        Usuario user3 = new Usuario("Guilherme Silveira", 200);
        
        List<Usuario> usuarios = new ArrayList<>();
        usuarios.add(user1);
        usuarios.add(user2);
        usuarios.add(user3);
        Consumer<Usuario> mostraMensagem = u -> System.out.println("antes de imprimir os nomes"); 

        Consumer<Usuario> imprimeNome = u -> System.out.println(u.getNome());

        //usuarios.forEach(mostraMensagem.andThen(imprimeNome));

       // usuarios.removeIf(u -> u.getPontos() > 199); 
        usuarios.forEach(u -> System.out.println(u.getNome()));
    }
    


}
