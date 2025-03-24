
package array7;

import java.util.ArrayList;



public class Array7 {

    
    public static void main(String[] args) {
        ArrayList<Integer> lista = new ArrayList<>();
        lista.add(12);
        lista.add(12);
        lista.add(15);
        lista.add(98);
        lista.add(12);
        System.out.println("Lista: " + lista);
        lista.remove(0);
        lista.remove(3);
        
        System.out.println("Lista sem repetições: " + lista);

        
    }
    
}
