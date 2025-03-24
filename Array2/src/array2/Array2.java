
package array2;

import java.util.ArrayList;
import java.util.Scanner;


public class Array2 {

    public static void main(String[] args) {
        ArrayList<String> lista = new ArrayList<>();
        lista.add("Ana");
        lista.add("Carlos");
        lista.add("Bruna");
        lista.add("Daniel");
        lista.add("Eduardo");
        
         Scanner scanner = new Scanner(System.in);
         String nome = scanner.nextLine();
         
         lista.remove(nome);
         System.out.println("Após remover " + nome + ":");
        for (String nom : lista) {
            System.out.println(nom);
        }
         
        
    }
    
}
