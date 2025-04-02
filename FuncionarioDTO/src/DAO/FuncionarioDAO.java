package DAO;

import DTO.FuncionarioDTO;
import javax.swing.JOptionPane;


public class FuncionarioDAO {
    public void salvarNome(FuncionarioDTO fu) {
        // Captura o nome do DTO
        String nome = fu.getNome();
        double salario = fu.getSalario();
        String cargo = fu.getCargo();
        // Exibe o nome em um JOptionPane
        JOptionPane.showMessageDialog(null, "Nome capturado: " + nome + "\nCargo capturado: " 
                + cargo + "\nSalario capturado: " + salario);
    }
}
