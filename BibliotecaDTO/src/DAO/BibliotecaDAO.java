/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import DTO.BibliotecaDTO;
import javax.swing.JOptionPane;

/**
 *
 * @author aluno.saolucas
 */
public class BibliotecaDAO {
     public void salvarNome(BibliotecaDTO b) {
        // Captura o nome do DTO
        String titulo = b.getTitulo();
        int ano = b.getAno();
        String autor = b.getAutor();
        // Exibe o nome em um JOptionPane
        JOptionPane.showMessageDialog(null, "Autor capturado: " + autor + "\nTítulo capturado: " 
                + titulo + "\nAno de publicação capturado: " + ano);
    }
}
