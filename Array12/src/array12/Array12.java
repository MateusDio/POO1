package array12;

import java.util.ArrayList;
import java.util.Collections;

public class Array12 {

    public static void main(String[] args) {
        ArrayList<Integer> lista = new ArrayList<>();
        lista.add(1);
        lista.add(3);
        lista.add(1);
        lista.add(4);
        lista.add(5);
        System.out.println("Lista: " + lista);
        
        int maior =Collections.max(lista);
        System.out.println("Maior valor: " + maior);
        
        int menor =Collections.min(lista);
        System.out.println("Menor valor: " + menor);
        
        
    }
}
