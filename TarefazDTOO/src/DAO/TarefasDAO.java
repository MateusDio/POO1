
package DAO;

import DTO.TarefasDTO;
import java.util.ArrayList;
import javax.swing.JOptionPane;


public class TarefasDAO {
       ArrayList<TarefasDTO> lista = new ArrayList<>();

    public void TarefaADD(TarefasDTO f) {
        lista.add(f);

    }
    
     public void Listar(){
         
         JOptionPane.showMessageDialog(null, "Lista : " + lista);
        
    }
}
