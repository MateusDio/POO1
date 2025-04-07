package DAO;

import DTO.PedidoDTO;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class PedidoDAO {

    ArrayList<PedidoDTO> lista = new ArrayList<>();

    public void salvarPedido(PedidoDTO p) {
        lista.add(p);

    }
    
    public void RemoverPedido(PedidoDTO p){
        lista.remove(p);
          
    }
    public void ListarPedido(){
         JOptionPane.showMessageDialog(null, "Lista de Pedido: " + lista);
        
    }
}
