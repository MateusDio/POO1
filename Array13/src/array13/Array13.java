package array13;

import java.util.ArrayList;
import java.util.Collections;

public class Array13 {

    public static void main(String[] args) {
        ArrayList<Integer> lista = new ArrayList<>();
        lista.add(32);
        lista.add(12);
        lista.add(65);
        lista.add(89);
        lista.add(23);

        ArrayList<Integer> lista2 = new ArrayList<>();
        lista2.add(1);
        lista2.add(3);
        lista2.add(1);
        lista2.add(4);
        lista2.add(5);
        
        ArrayList<Integer> lista3 = new ArrayList<>();
        lista3.addAll(lista) ;
        lista3.addAll(lista2);
        
        System.out.println("Lista 3: " + lista3);
        
    }
}
