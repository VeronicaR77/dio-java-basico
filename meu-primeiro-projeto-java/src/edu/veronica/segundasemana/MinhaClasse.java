package edu.veronica.segundasemana;
public class MinhaClasse {
   
   public static void main (String[] args) {

    String primeiroNome = "Veronica";
    String segundoNome = "Ramos";

    String nomeCompleto = nomeCompleto (primeiroNome,segundoNome);
    System.out.println (nomeCompleto);
    }
    
   public static String nomeCompleto (String primeiroNome, String segundoNome){
    return primeiroNome.concat("").concat(segundoNome);

    }

}
