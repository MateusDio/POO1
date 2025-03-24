
package array3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;


public class Array3 {

    
    public static void main(String[] args) {
        ArrayList<Integer> lista = new ArrayList<>();
        
         Random random = new Random();
        
        for (int i = 0; i < 10; i++) {
            lista.add(random.nextInt(100) ); 
             Collections.sort(lista);
              System.out.println("Lista ordenada: " + lista);
        }
    }
}
