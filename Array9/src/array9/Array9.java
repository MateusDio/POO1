
package array9;

import java.util.ArrayList;

public class Array9 {

    
    public static void main(String[] args) {
         ArrayList<Integer> lista = new ArrayList<>();
        lista.add(1);
        lista.add(2);
        lista.add(3);
        lista.add(4);
        lista.add(5);
        System.out.println("Lista original: " + lista);
        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(lista);
        System.out.println("Lista copiada: " + list);
    }
    
}
