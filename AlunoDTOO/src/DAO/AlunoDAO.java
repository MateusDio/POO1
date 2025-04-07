
package DAO;

import DTO.AlunoDTO;
import java.util.ArrayList;
import javax.swing.JOptionPane;


public class AlunoDAO {
      ArrayList<AlunoDTO> lista = new ArrayList<>();

    public void AlunoADD(AlunoDTO p) {
        lista.add(p);

    }
    
    public void AlunoRemov(AlunoDTO p){
        lista.remove(p);
          
    }
    
    public void Listar(){
         JOptionPane.showMessageDialog(null, "Lista : " + lista);
        
    }
}
