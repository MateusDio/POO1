
package array11;

import java.util.ArrayList;


public class Array11 {

    
    public static void main(String[] args) {
           ArrayList<Double> lista = new ArrayList<>();
        lista.add(1.2);
        lista.add(3.2);
        lista.add(1.6);
        lista.add(4.7);
        lista.add(5.3);
        
        System.out.println("Lista: " + lista );
        double soma = 0;
    for (Double valor : lista) {
            soma += valor;
        }
        System.out.println("Lista somada: " + soma);
    }
    
}
