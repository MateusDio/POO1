
package array14;

import java.util.ArrayList;
import java.util.Scanner;


public class Array14 {

    
    public static void main(String[] args) {
     ArrayList<String> lista = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Caso não deseje adcionar ou remover nenhum item, digite 'fim'");

        while (true) {
            System.out.println("Adcione algo a lisa de tarefas: ");
            String palavra = scanner.nextLine();
            if (palavra.equalsIgnoreCase("Fim")) {
                break;
            }
            lista.add(palavra); 
        }
    
            while (true) {
            System.out.println("Remova algo a lisa de tarefas: ");
            String palavra = scanner.nextLine();
            if (palavra.equalsIgnoreCase("Fim")) {
                break;
            }
            lista.add(palavra); 
        }
            System.out.println("Lista de Tarefas atualizada: " + lista);
         

    }
    
}
