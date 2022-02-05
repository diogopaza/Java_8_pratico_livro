import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
 

public class Capitulo5 {

public static void main(String[] args) {
    List<Usuario> usuarios = new ArrayList<Usuario>();
    Usuario user1 = new Usuario("Paulo", 150);
    Usuario user2 = new Usuario("Joao", 200);
    Usuario user3 = new Usuario("Beto", 111);
    usuarios.add(user1);
    usuarios.add(user2);
    usuarios.add(user3);
    
    /*
    Comparator<Usuario> comparator = new Comparator<Usuario>(){
        public int compare(Usuario u1, Usuario u2){
            return u1.getNome().compareTo(u2.getNome());
        }
    };

    Collections.sort(usuarios, comparator);
    usuarios.forEach(u -> System.out.println(u.getNome())); */
/*
    Comparator<Usuario> comparator = (u1, u2) -> u1.getNome().compareTo(u2.getNome());
    Collections.sort(usuarios, comparator);
    usuarios.forEach(u -> System.out.println(u.getNome()));
*/

   // Collections.sort(usuarios,(u1, u2) -> u1.getNome().compareTo(u2.getNome()));
    usuarios.forEach(u -> System.out.println(u.getNome()));
   
}
   

}
