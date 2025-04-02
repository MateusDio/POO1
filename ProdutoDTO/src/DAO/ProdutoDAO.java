
package DAO;

import DTO.ProdutoDTO;
import javax.swing.JOptionPane;


public class ProdutoDAO {
 public void salvarNome(ProdutoDTO pr) {
        // Captura o nome do DTO
        String nome = pr.getNome();
        double preco = pr.getPreco();
        int quant = pr.getQuant();
        // Exibe o nome em um JOptionPane
        JOptionPane.showMessageDialog(null, "Nome capturado: " + nome + "\nPreço capturado: " 
                + preco + "\nQuantidade capturada: " + quant);
    }
}
