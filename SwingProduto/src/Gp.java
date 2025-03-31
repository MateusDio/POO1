
import java.util.ArrayList;


public class Gp  {
    
 private static ArrayList<String> listaProdutos = new ArrayList<>();
  
     public void addProduto(String nomeProduto) {
        listaProdutos.add(nomeProduto);
        

    }

    public String ExbirP() {
        return String.join("\n", listaProdutos);
        
        
    }
    
    void listarProdutos(){
        System.out.println(listaProdutos);
        
    }
}