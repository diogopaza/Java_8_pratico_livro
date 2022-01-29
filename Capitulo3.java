public class Capitulo3 {
    public static void main(String[] args) {
        Validador<String> validadorCEP = new Validador<String>() {
            public boolean valida(String valor){
                return valor.matches("[0-9]{5}-[0-9]{3}");
            }
        };

        Validador<String> validadorCEP2 = v -> { return v.matches("[0-9]{5}-[0-9]{3}");
         };

         Validador<String> validadorCEP3 = v-> v.matches("[0-9]{5}-[0-9]{3}");

        //System.out.println(validadorCEP2.valida("04101-3001"));

        Runnable o = () -> System.out.println("lambda");
       // System.out.println(o);

       int numero = 5;
       new Thread(() -> {
           System.out.println(numero);
       }).start();

      // numero = 10;
    }
    
}
