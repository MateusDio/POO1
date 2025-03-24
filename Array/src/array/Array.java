
package array;

import java.util.ArrayList;


public class Array {

    
    public static void main(String[] args) {
        ArrayList<String> listaDeFrutas = new ArrayList<>();

        
        listaDeFrutas.add("Maçã");
        listaDeFrutas.add("Banana");
        listaDeFrutas.add("Laranja");
        
         
        for (int i = 0; i < listaDeFrutas.size(); i++) {
            System.out.println("Fruta #" + i + ": " + listaDeFrutas.get(i));
            
             
    
        }
            listaDeFrutas.remove("Banana");
         System.out.println("Após remover Banana:");
        for (String fruta : listaDeFrutas) {
            System.out.println(fruta);
        }
    }
    
}
