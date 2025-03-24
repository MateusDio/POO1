
package array4;

import java.util.ArrayList;
import java.util.Scanner;


public class Array4 {

    
    public static void main(String[] args) {
        String nome ;
          ArrayList<String> lista = new ArrayList<>();
        lista.add("Arroz");
        lista.add("Feijão");
        lista.add("Leite");
        lista.add("Queijo");
        lista.add("Refrigerante");
       
         Scanner scanner = new Scanner(System.in);
         nome = scanner.nextLine();
         System.out.println("Tem " + nome + " em estoque?");
         
         
         if ( lista.contains(nome)){
             System.out.println("Temos em estoque!!!");
             
         } else {
             System.out.println("Não tem em estoque");
         }
         
    }
    
}
