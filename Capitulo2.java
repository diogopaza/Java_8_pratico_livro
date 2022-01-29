import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;


public class Capitulo2 {
    public static void main(String[] args) {
        Usuario user1 = new Usuario("Paulo Vieira", 150);
        Usuario user2 = new Usuario("Rodrigo Turini", 120);
        Usuario user3 = new Usuario("Guilherme Silveira", 190);
        
        List<Usuario> usuarios = new ArrayList<>();
        usuarios.add(user1);
        usuarios.add(user2);
        usuarios.add(user3);
        /*
        for(Usuario u : usuarios){
            System.out.println(u.getNome());
        }

    //Novo método - JAVA 8 - forEach
    /* teste pessoal     
    usuarios.forEach(u->System.out.println(u.getNome()));
    */   
    /*
    Mostrador mostrador = new Mostrador();
    usuarios.forEach(mostrador);
    
    usuarios.forEach(new Consumer<Usuario>(){
        public void accept(Usuario u){
            System.out.println(u.getNome());
        }
    });
    */    
   
   // Consumer<Usuario> mostrador = u -> System.out.println(u.getNome());
    usuarios.forEach(u -> System.out.println(u.getNome()));
    usuarios.forEach(u -> u.setModerador(true));
    System.out.println("O usuário é moderador " + user1.isModerador());

}


    
           


}

