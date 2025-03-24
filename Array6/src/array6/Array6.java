package array6;

import java.util.ArrayList;
import java.util.Scanner;

public class Array6 {

    public static void main(String[] args) {

        ArrayList<String> lista = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        String nome = scanner.nextLine();

        while (true) {
            String palavra = scanner.nextLine();
            if (palavra.equalsIgnoreCase("fim")) {
                break;
            }
            lista.add(palavra); 
        }

        System.out.println("Digite a palavra para contar quantas vezes aparece:");
        String palavraProcurada = scanner.nextLine();

        int contador = 0;
        for (String palavra : lista) {
            if (palavra.equalsIgnoreCase(palavraProcurada)) {
                contador++;
            }
        }

        System.out.println("A palavra '" + palavraProcurada + "' aparece " + contador + " vezes.");

      
    }
}
