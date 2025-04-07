
package DAO;

import DTO.CarroDTO;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class CarroDAO {
    ArrayList<CarroDTO> lista = new ArrayList<>();
    
    public void SalvarCarro(CarroDTO c){
        lista.add(c);
              
    }
    
    public void Listar(){
        JOptionPane.showMessageDialog(null, "Lista de Pedido: " + lista);
        
    }
            
            
            
            
}
