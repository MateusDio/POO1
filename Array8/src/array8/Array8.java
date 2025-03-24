
package array8;

import java.util.ArrayList;

public class Array8 {

    
    public static void main(String[] args) {
        
         ArrayList<Integer> lista = new ArrayList<>();
        lista.add(1);
        lista.add(2);
        lista.add(3);
        lista.add(4);
        lista.add(5);
        System.out.println("Lista ordenada: " + lista);
        System.out.println("Lista ordem inversa: " + lista.reversed());
    }
    
}
