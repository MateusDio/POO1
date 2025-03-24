
package array5;

import java.util.ArrayList;
import java.util.Scanner;


public class Array5 {

    
    public static void main(String[] args) {
           ArrayList<String> lista = new ArrayList<>();
        lista.add("Canoas");
        lista.add("Sapucaia do Sul");
        lista.add("Gramadão");
        lista.add("New York");
        lista.add("Passo Fundo");
        
        
         Scanner scanner = new Scanner(System.in);
         
         System.out.println("Quer substituir qual cidade? " + lista);
         String nome = scanner.nextLine();
         lista.remove(nome);
         
         System.out.println("Qual cidade quer adcionar no lugar da anterior? ");
         String nom = scanner.nextLine();
         lista.add(nom);
         
         System.out.println("Lista Atualizada: " + lista);
    }
    
}
